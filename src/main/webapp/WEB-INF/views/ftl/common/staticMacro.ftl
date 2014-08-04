<#macro meta>
    <meta charset="utf-8" />
    <meta http-equiv="Cache-Control" content="no-store"/>
    <meta http-equiv="Pragma" content="no-cache"/>
    <meta http-equiv="Expires" content="0"/>
</#macro>


<#macro genCSS>
    <#if css??>
        <#list css as item>
            <link type='text/css' rel='stylesheet' href='${staticPath}${item}.css'/>	
        </#list>
    </#if>
</#macro>

<#macro genJS>
    <#if js??>
        <#list js as item>
            <script type='text/javascript' src='${staticPath}${item}.js'></script>	
        </#list>
    </#if>
</#macro>

<#macro addCSS path>
    <#if css??>
        <#assign css=css+path>
    <#else>
        <#assign css=path>
    </#if>
</#macro>

<#macro addJS path>
    <#if js??>
      <#assign js=js+path>
    <#else>
      <#assign js=path>
    </#if>
</#macro>

<#macro addScript> 
    <#assign tempScript>
    <#nested> 
    </#assign>
    <#if javascript??>
        <#assign javascript = javascript + tempScript />
    <#else>
        <#assign javascript = tempScript />
    </#if>
</#macro> 