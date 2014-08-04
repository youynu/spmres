<#include "/pgm/common/pgm-common.ftl">

<@pgmpage title="登录页面">

<div class="row">
  <div class="span2"></div>
  <div id="login" class="span4 pos-relative ">
  
  <div class="navbar"> <div class="navbar-inner ">
  <form method="post" action='${servePath}/login/doLogin'>
	<input name='goback' type='hidden' value='${goback!}'>
  <fieldset>
    <legend><img src="${staticPath}/images/gylogo.jpg" class="" style="width: 35px" />
    PGM 管理系统登录</legend>
    <div style="width:220px">
    <label><font color='red'>${message!}</font></label>
    <label>用户名</label>
    <input type="text" name='userName' value='${(user.userName)!}' placeholder="您的姓名">
    <label>密码</label>
    <input type="password" name='userPassword' placeholder="您的密码">
    
    <label class="checkbox">
      <input type="checkbox" name="rememberUserName" value="true"  ${checked!}> 记住用户名
    </label>
    <button type="submit" class="btn btn-block btn-primary">登录</button>
    </div>
  </fieldset>
</form> 
</div></div>

</div>
  <div class="span2"> </div>
	    
</div>



</@pgmpage>