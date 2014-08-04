<#include "/pgm/common/pgm-common.ftl">
<@pgmpage title='出错啦'>
<div class="alert alert-block alert-error fade in min-height500">
            <button type="button" class="close" data-dismiss="alert">×</button>
            <h4 class="alert-heading">亲(${(currentUser.userName)!"外星人"}小同学) 出错了!</h4>
            <div></div>
            
            <h2>${errormsg!}</h2>
            <p>
              <a class="btn btn-danger" href="${servePath}/">返回首页</a>
            </p>
</div>          
</@pgmpage>