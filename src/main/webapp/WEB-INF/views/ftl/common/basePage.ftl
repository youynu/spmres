<#include "staticMacro.ftl">
<#macro common title>
	<!DOCTYPE html>	
	<html>
	    <head>
	        <title>${title}</title>
	         <@block name="meta">
	        	<meta charset="utf-8" />
                <meta http-equiv="X-UA-Compatible" content="IE=edge">
                <meta name="renderer" content="webkit">
    			<meta http-equiv="Cache-Control" content="no-store"/>
    			<meta http-equiv="Pragma" content="no-cache"/>
    			<meta http-equiv="Expires" content="0"/>
    			<meta name="viewport" content="width=device-width, initial-scale=1.0">
    		</@block>
    		
    		<@block name="icon">
    		<link rel="shortcut icon" href="${staticPath}/images/favicon.ico" /> 
    		</@block>
    		
    		<@block name="commonCSS">
    		 
     		</@block> 
    	
	         
	        <@block name="customJS">
	        <script src='${staticPath}/lib/js/jquery-1.11.0.js' type='text/javascript'></script>
	        <script src='${staticPath}/lib/js/namespace.js' type='text/javascript'></script>
	    	</@block>
	    	
	    	 <script>
	              webCfg = {
	              staticServePath: "${staticPath}",	             
	              servePath: "${servePath}"
	            };
	 		</script>
	    </head>
	    <body <@block name="body"/>>
	     	
	        <#nested/>
	        <@genCSS/>
	        <@genJS/>
	        
	    </body>
	</html>
</#macro>