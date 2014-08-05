<#include "/common/basePage.ftl">
<@addCSS ["/lib/bootstrap/css/bootstrap","/lib/bootstrap/css/bootstrap-responsive","/css/home"]/>
<@addJS ["/lib/bootstrap/js/bootstrap","/js/pgm"]/>
 
 
<@common title="贵研资源首页">
	<div class="header center">
		<a href="http://127.0.0.1/phpcms"><img src="${staticPath}/images/logo.jpg">贵研资源</a>
		<ul class="nav">
		<li class="left"><a href="http://127.0.0.1/phpcms">首 页<br><span>HOME</span></a></li>
		<li class="left"><a href="">公司简介<br><span>ABOUT US</span></a></li>
		<li class="left"><a href="">产品展示<br><span>PRODUCT</span></a></li>
		<li class="left"><a href="">新闻中心<br><span>NEWS</span></a></li>
		<li class="left"><a href="">工程案例<br><span>CASE</span></a></li>
		<li class="left"><a href="">人才招聘<br><span>JOB</span></a></li>
		<li class="left"><a href="">联系我们<br><span>CONTACT</span></a></li>
		<li class="left"><a href="">留言板<br><span>MESSAGE</span></a></li>
		</ul>
		<br/>
		<#include "dynamic-pic.ftl">
	</div>
	
	
</@common>

