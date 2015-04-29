<#assign c=JspTaglibs["http://java.sun.com/jsp/jstl/core"]>
<#macro main title="NOVA CRM" customScripts=[] customStyles=[]>
<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8"/>
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>${title?string}</title>
    <link href="/resources/css/bootstrap.css" rel="stylesheet" type="text/css"/>
    <link href="/resources/css/jquery-ui/jquery-ui.min.css" rel="stylesheet" type="text/css"/>
    <link href="/resources/css/style.css" rel="stylesheet" type="text/css">
    <link href="/resources/css/font-awesome.min.css" rel="stylesheet" type="text/css">
    <#list customStyles as style>
        <link href="${style}" rel="stylesheet"/>
    </#list>
    <script src="/resources/js/jquery-2.1.1.min.js"></script>
    <script src="/resources/js/bootstrap.min.js"></script>
    <script src="/resources/js/jquery-ui.min.js"></script>


    <#list customScripts as script>
        <script src="${script}"></script>
    </#list>
</head>
<body>
<header>
    <div class="top-header">
        <h1>${title?string}</h1>
    </div>
</header>
<#--here we can include headers or some part-->
<#--<#include "common/header.ftl">-->
    <@m_body/>
<#if m_customEndings?? && m_customEndings?is_directive>
    <@m_customEndings/>
</#if>
</body>
</#macro>