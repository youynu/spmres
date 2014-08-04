<div class='bs-docs-example container-default title-text'>
<#include 'modal-password.ftl'>
<div class="" id="">
	
 <@privil isShow="${roleCheck('customer')}">	
 <div class="groupColl">
    <div class="accordion-heading">
      <span class="accordion-toggle menu-text" data-toggle="collapse" data-parent="#accordion2" href="#collapse5">
        	客户管理
      </span>
    </div>
    <div id="collapse5" >
      <div class="accordion-inner">
        <ul class='nav nav-list'>
        	<li class=''>  <a  href="${servePath}/customer/index">
       			客户信息维护</a>
     		 </li>
     		 <#-- 
     		 <li>  <a class="accordion-toggle" data-toggle="collapse" data-parent="#accordion2" href="#">
       			 客户事项</a>
     		 </li>
     		 -->
        </ul>
      </div>
    </div>
  </div>
  </@privil>
  
  <@privil isShow="${roleCheck('user')}">
  <div class="accordion-group no-border groupColl">
    <div class="accordion-heading">
      <span class="accordion-toggle" data-toggle="collapse" data-parent="#accordion2" href="#collapseOne">
       	用户管理
      </span>
    </div>
    <div id="collapseOne" >
      <div class="accordion-inner">
       <ul class='nav nav-list'>
        	<li class=''>  
        		<a class="" href="${servePath}/user/index">
       			用户信息维护</a>
     		 </li>
     		 <#-- 
     		 <li>  <a   href="#">
       			 角色信息维护</a>
     		 </li>
     		  <li>  <a   href="#">
       			 用户权限维护</a>
     		 </li>
     		 -->
        </ul>
      </div>
    </div>
  </div>
  </@privil>	  

  <div class="accordion-group no-border groupColl">
    <div class="accordion-heading">
      <span class="accordion-toggle" data-toggle="collapse" data-parent="#accordion2" href="#collapseTwo">
       	业务管理
      </span>
    </div>
    <div id="collapseTwo" class="accordion-body collapse">
      <div class="accordion-inner">
        	敬请期待...
      </div>
    </div>
  </div>

  
</div>

</div>