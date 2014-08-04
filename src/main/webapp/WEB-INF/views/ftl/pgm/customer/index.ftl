<#include "/pgm/common/pgm-manage.ftl">
<#include "/pgm/common/validator.ftl">

<@pgmmanage>
<div class=''>
<span class=''>
客户管理页面
<div class='divider '></div>
<div class="row">
	<div class="span4">
	<button type="button" 
	class="btn btn-primary"
	 data-backdrop='static'  data-toggle="modal" 
	 data-target="#myModal"
	 data-remote='${servePath}/customer/form?gotimeoutpage=true'>添加客户</button>
	 
	 </div>
	 <div class="span3">
	 	<input type="text" name='payType' data-module='/customer/search'  class="j-common-search"  placeholder="客户名称">
	 </div>
 </div>
<table class="table table-hover">
              <thead>
                <tr>
                  <th>客户名称</th>
                  <th>客户编号</th>
                  <th>联系人</th>
                  <th>联系人电话</th>
                  <th>座机</th>
                  <th>操作</th>
                </tr>
              </thead>
              <tbody id="j-table" class="j-table j-common-table">
             	<#include 'customer-row.ftl'>
              </tbody>
            </table>
            <div class="holder j-jpages"></div>
            <!-- Modal -->
	<div id="myModal" class="modal hide fade" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
		  <div class="modal-header">
		    <button type="button" class="close" data-dismiss="modal" aria-hidden="true">×</button>
		    <h3 id="myModalLabel">客户管理</h3>
		  </div>
		  <div class="modal-body">
		   
		  </div>
		  <div class="modal-footer">
		    <button class="btn" data-dismiss="modal" aria-hidden="true">取消</button>
		    <button class="btn btn-primary j-common-save" data-module='/customer/save'>保存</button>
		  </div>
	</div>
	
	</div>
	<#include "/pgm/customer/modal/md-view-form.ftl">
</@pgmmanage>