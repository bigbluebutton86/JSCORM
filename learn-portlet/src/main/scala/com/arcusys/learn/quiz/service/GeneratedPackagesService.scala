package com.arcusys.learn.quiz.service

import com.arcusys.scorm.util.FileSystemUtil
import java.io.FileInputStream
import com.arcusys.scorm.generator.file.QuizPackageGenerator
import com.arcusys.scorm.deployer.PackageProcessor

import org.scala_tools.subcut.inject.BindingModule
import com.arcusys.learn.web.ServletBase
import com.arcusys.learn.ioc.Configuration
import com.arcusys.learn.liferay.service.asset.AssetHelper
import com.arcusys.learn.service.util.SessionHandler

class GeneratedPackagesService(configuration: BindingModule) extends ServletBase(configuration) {
  def this() = this(Configuration)

  private val assetHelper = new AssetHelper()

  import storageFactory._

  before() {
    response.setHeader("Cache-control", "must-revalidate,no-cache,no-store")
    response.setHeader("Expires", "-1")
  }

  get("/Zip/:quizID.zip") {
    requireTeacherPermissions()

    contentType = "application/zip"

    val quizID = parameter("quizID").intRequired
    val courseID = parameter("courseID").intOption(-1)
    val quiz = quizStorage.getByID(quizID).get
    val generator = new QuizPackageGenerator(quiz)
    val filename = generator.generateZip(courseID)

    val is = new FileInputStream(FileSystemUtil.getRealTmpDir + filename)
    org.scalatra.util.io.copy(is, response.getOutputStream)
    is.close()
  }

  private val packageProcessor = new PackageProcessor()

  post("/ZipInstall/:quizID") {
    requireTeacherPermissions()

    val quizID = parameter("quizID").intRequired
    val userIDHeader = request.getHeader("scormUserID")
    val userID = if (userIDHeader.isEmpty) 0 else userIDHeader.toLong
    val groupIDHeader = request.getHeader("liferayGroupID")
    val groupID = if (groupIDHeader.isEmpty) -1 else groupIDHeader.toLong
    val quiz = quizStorage.getByID(quizID).get
    val generator = new QuizPackageGenerator(quiz)
    val courseID = parameter("courseID").intOption(-1)
    val filename = generator.generateZip(courseID)

    val packageID = packageProcessor.processPackageAndGetID(quiz.title, "", filename.substring(0, filename.length - 4), courseID)
    if (groupID != -1) assetHelper.addPackage(userID, groupID, storageFactory.packageStorage.getByID(packageID).getOrElse(throw new Exception("Can't find newly created pakage")))

    packageID
  }
}
