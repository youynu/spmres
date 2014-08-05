<#include "/common/basePage.ftl">
<@addCSS ["/lib/bootstrap/css/bootstrap","/lib/bootstrap/css/bootstrap-responsive","/css/home"]/>
<@addJS ["/lib/bootstrap/js/bootstrap","/js/pgm"]/>
 
 
<@common title="贵研资源">
	<div class="header center">
		<div style="position: relative;">
			
			<div>
			<img src="${staticPath}/images/logo1.png">
			</div>
			<div style=" position: absolute; left:140px; top:1px">
				<h3>
				贵研资源（易门）有限公司
				</h3>
				<h6>
				  Sino-Platinum Metals Rescouces (Yimen) Co.,Ltd.
				</h6>
			</div>
		</div>
		<ul class="nav">
		<li class="left"><a href="">首 页<br><span>HOME</span></a></li>
		<li class="left"><a href="">公司简介<br><span>ABOUT US</span></a></li>
		<li class="left"><a href="">产品展示<br><span>PRODUCT</span></a></li>
		<li class="left"><a href="">新闻中心<br><span>NEWS</span></a></li>
		<!--
		<li class="left"><a href="">工程案例<br><span>CASE</span></a></li>
		-->
		<li class="left"><a href="">人才招聘<br><span>JOB</span></a></li>
		<li class="left"><a href="">联系我们<br><span>CONTACT</span></a></li>
		<li class="left"><a href="">留言板<br><span>MESSAGE</span></a></li>
		</ul>
		
		<#include "dynamic-pic.ftl">
		
		<#include "news.ftl">
		
		<div class="footer">
			<div class="add">
	        	Copyright © 2004-
				<script type="text/javascript">
				var date = new Date();
					document.write(1900 + date.getYear());
				</script>2014
	 贵研资源（易门）有限公司 地址：昆明市翠湖北路2号 邮编：650091   <a href="http://www.miibeian.gov.cn/" target="_blank">滇ICP备05004791</a> 
	        </div>
		</div
	</div>
	
	
</@common>

