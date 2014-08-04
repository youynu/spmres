<form class='j-common-form role' action='${servePath}/user/save' method='post'>
<input type='hidden' name='userId' value="${userId!}">
 <#if itemList ?? && itemList?size gt 0 >
    <#list itemList as item>
				 
			<label class="checkbox">
			  <input type="checkbox" name='roleId' value="${(item.id)!}"
			  	<#if item.dataId?? && item.dataId != "">
			   	checked="checked"
			   </#if>
			   >
			 ${(item.roleName)!}
			</label>
	</#list>
	<#else>
	 没有可分配的角色
</#if>
</form>