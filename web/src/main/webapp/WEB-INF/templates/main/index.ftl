<#include "../mainTemplate.ftl">
<#macro m_body>

<script>

</script>

<div class="container">
    <div class="row" style="border: dotted;">
        <div class="col-md-4 col-sm-6 col-xs-12">
            <div class="menu-element"></div>
            <a href="/orders" class="thumbnail">
                <h2>Orders</h2>
            </a>
        </div>
        <div class="col-md-4 col-sm-6 col-xs-12">
            <div class="menu-element"></div>
            <a href="/profile" class="thumbnail">
                <h2>My Profile</h2>
            </a>
        </div>
    </div>
</div>


</#macro>
<@main
title="Index page of NOVA CRM"
customScripts=[
"/resources/js/script.js"
]
/>