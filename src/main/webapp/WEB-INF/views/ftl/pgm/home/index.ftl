<#include "/common/basePage.ftl">
<!-- 新 Bootstrap 核心 CSS 文件 -->
<link rel="stylesheet" href="http://cdn.bootcss.com/bootstrap/3.2.0/css/bootstrap.min.css">

<!-- 可选的Bootstrap主题文件（一般不用引入） -->
<link rel="stylesheet" href="http://cdn.bootcss.com/bootstrap/3.2.0/css/bootstrap-theme.min.css">
<@addCSS ["/css/home"]/>
 
 <script src="http://cdn.bootcss.com/bootstrap/3.2.0/js/bootstrap.min.js"></script>
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
		
		<#include "dynamic-pic.ftl">
	</div>
	
	
</@common>

