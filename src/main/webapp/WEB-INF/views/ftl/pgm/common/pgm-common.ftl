<#include "/common/basePage.ftl">
<#include "placeholder.ftl">
<#include "privil.ftl">
<#include "jpage.ftl">

<@addCSS ["/lib/bootstrap/css/bootstrap","/lib/bootstrap/css/bootstrap-responsive","/css/pgm","/css/common"]/>
<@addJS ["/lib/bootstrap/js/bootstrap","/js/pgm"]/>
<#macro pgmpage title>
	<@common title=title>		
		<div class="bg-default  pgm-mainpage">
			<#include 'header.ftl'>
			<div class='container min-height500'>
			<#nested/>
			</div>
			<#include 'footer.ftl'>
		</div>
	</@common>
</#macro>