<#include "/pgm/common/pgm-manage.ftl">
<#include "/pgm/common/validator.ftl">

<@pgmmanage>
<div class=''>
<span class=''>
用户管理页面</span>
<div class='divider '></div>
<button type="button" 
class="btn btn-primary"
 data-backdrop='static'  data-toggle="modal" 
 data-target="#myModal"
 data-remote='${servePath}/user/form?gotimeoutpage=true'>添加用户</button>
 
<table class="table table-hover">
              <thead>
                <tr>
                  <th>用户姓名</th>
                  <th>用户编号</th>
                  <th>密码</th>
                  <th>职位</th>
                  <th>操作</th>
                </tr>
              </thead>
              <tbody id="j-table" >
              <#if itemList ?? && itemList?size gt 0 >
              <#list itemList as item>
				 
			
                <tr>
                  <td>${(item.userName)!}</td>
                  <td>${(item.userNo)!}</td>
                  <td>${(item.userPassword)!}</td>
                  <td>${(item.position)!}</td>
                  <td> 
                  	<i title='编辑'
                  		class="icon-edit operation"
                  		 data-backdrop='static'  data-toggle="modal" 
						 data-target="#myModal"
						 data-remote='${servePath}/user/form?gotimeoutpage=true&id=${(item.id)!}'>
						 </i> <i class='divider-vertical '>|</i>
						  <i title='删除' class="icon-trash operation j-user-delete" data-id="${(item.id)!}"></i>
						  <i class='divider-vertical '>|</i>
						  <span title='分配角色' class='operation'
						   	data-backdrop='static'  data-toggle="modal" 
						 	data-target="#roleModal"
						 	data-remote='${servePath}/user/roleassignform?gotimeoutpage=true&userId=${(item.id)!}'> 	
						  <i class="icon-plus"></i>分配角色</span>
						 </td>
                </tr>
                </#list>	
             </#if>   
                <#-->
                <tr>
                  <td>2</td>
                  <td>Jacob</td>
                  <td>Thornton</td>
                  <td>@fat</td>
                                    <td> <i class="icon-edit"></i> <i class='divider-vertical'> |</i> <i class="icon-trash"></i></td>
                  
                </tr>
                <tr>
                  <td>3</td>
                  <td colspan="2">Larry the Bird</td>
                  <td>@twitter</td>
                  <td> <i class="icon-edit"></i> <i class='divider-vertical'> |</i> <i class="icon-trash"></i></td>
                  
                </tr>
                -->
              </tbody>
            </table>
            <div class="holder j-jpages"></div>
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
	<#include 'dialog-role.ftl'>
	
	</div>
</@pgmmanage>