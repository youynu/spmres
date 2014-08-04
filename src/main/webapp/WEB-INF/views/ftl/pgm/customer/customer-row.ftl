 <#if itemList ?? && itemList?size gt 0 >
              <#list itemList as item>
				 
			
                <tr>
                  <td>${(item.customerName)!}</td>
                  <td>${(item.customerNo)!}</td>
                  <td>${(item.contrator)!}</td>
                  <td>${(item.contratorPhone)!}</td>
                  <td>${(item.tel)!}</td>
                  <td> 
                  		<i title="详情" class="icon-list-alt operation"
                  		 data-backdrop='static'  data-toggle="modal" 
						 data-target="#customerViewFormModal"
						 data-remote='${servePath}/customer/viewform?gotimeoutpage=true&id=${(item.id)!}'></i>
                  		<i class='divider-vertical '> |</i>
                  		 
                  		<i title="编辑" class="icon-edit operation"
                  		 data-backdrop='static'  data-toggle="modal" 
						 data-target="#myModal"
						 data-remote='${servePath}/customer/form?gotimeoutpage=true&id=${(item.id)!}'>
						 </i> <i class='divider-vertical '> |</i>
						  
						 <i title='删除' class="icon-trash operation j-common-delete"
						 data-module='/customer/delete' data-id="${(item.id)!}"></i></td>
                </tr>
                </#list>	
             </#if>   
