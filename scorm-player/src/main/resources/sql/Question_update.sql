UPDATE Question SET
    categoryID = :e.categoryID,
    title = :e.title,
    description = :e.text,
    explanationText = :e.explanationText,
<#if forceCorrectCount??>
    forceCorrectCount = :forceCorrectCount,
</#if>
<#if isCaseSensitive??>
    isCaseSensitive = :isCaseSensitive,
</#if>
    questionType = :questionType
WHERE id = :e.id