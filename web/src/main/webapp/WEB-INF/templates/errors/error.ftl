<#include "../mainTemplate.ftl">
<#macro m_body>
<h1>???-?? ????? ?? ???</h1>
<div class="alert alert-error">
    <a href="#" class="close" data-dismiss="alert">&times;</a>
    <strong>Error!</strong>
    A problem has been occurred while submitting your data.
</div>
<#if errors?has_content>
    <#list errors as error>
        ${error.defaultMessage}
    </#list>
</#if>
<a href="/">????????? ?? ???????</a>
</#macro>
<@main
title="Index page of Itis World"
/>