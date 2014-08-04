<form class='j-user-form role j-validate-form' action='${servePath}/user/save' method='post'>
  <input type="hidden" name="id" value="${(user.id)!}">
  <fieldset>
     
    <label>用户姓名</label>
    <input type="text" data-rule="required;" name="userName" value="${(user.userName)!}" placeholder="用户姓名">
    <label>用户编号</label>
    <input type="text" name="userNo" value="${(user.userNo)!}" placeholder="用户编号">
    <label>密码</label>
    <input type="text" name='userPassword' data-rule="required;" value="${(user.userPassword)!}" placeholder="密码">
    <label>职位</label>
    <input type="text" name='position' value="${(user.position)!}" placeholder="职位">
    
  </fieldset>
</form>