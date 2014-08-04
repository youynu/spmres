<#include "/pgm/common/pgm-manage.ftl">
<#include "/pgm/common/validator.ftl">
<#include "/pgm/common/ztree.ftl">

<@addJS ["/js/org"]/>

<@pgmmanage>
<div class=''>
<span class=''>
公司组织机构管理</span>
<div class='divider '></div>

 <div class='span3'>
 <ul id="orgTree" class="ztree"></ul>
 </div>
 
 <div class="span3">
 <button type="button" 
class="btn btn-primary"
 data-backdrop='static'  data-toggle="modal" 
 data-target="#myModal"
 data-remote='${servePath}/user/form?gotimeoutpage=true'>添加</button>
 </div>
 <div class="clear-float"></div>
 <br/>
 
    <!-- Modal -->
	<div id="myModal" class="modal hide fade" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
		  <div class="modal-header">
		    <button type="button" class="close" data-dismiss="modal" aria-hidden="true">×</button>
		    <h3 id="myModalLabel">用户管理</h3>
		  </div>
		  <div class="modal-body">
		    
		  </div>
		  <div class="modal-footer">
		    <button class="btn" data-dismiss="modal" aria-hidden="true">取消</button>
		    <button class="btn btn-primary j-user-save">保存</button>
		  </div>
	</div>
	 
	
	</div>
	<script>
		var treeData = ${treeData!"[]"}
	</script>
</@pgmmanage>