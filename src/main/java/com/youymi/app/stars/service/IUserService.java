package com.youymi.app.stars.service;

import java.util.List;

import com.youymi.app.stars.data.ao.RoleAO;
import com.youymi.app.stars.data.entity.gen.User;
import com.youymi.app.stars.data.entity.gen.UserRole;
import com.youymi.youymiframework.service.ServiceResult;

public interface IUserService {
	
	  /**
     * 验证用户登录
     * @param account 用户信息
     * @return 验证是否通过,(判断succed是否通过;如果通过，则返回的data里面则是账户对象)
     */
    ServiceResult<User> loginValidate(User account);
    
    ServiceResult<User> getUserById(String id);

    /**
     * 获取用户账户列表
     * @param userName 用户名
     * @param page 分页
     * @return 账户列表
     */
    ServiceResult<List<User>> getUserList(String userName);

    /**
     * 添加用户账户
     * @param account 用户账户对象
     * @return 用户对象
     */
    ServiceResult<User> saveUser(User account);

    /**
     * 删除账户
     * @param id 账户id
     * @return 是否删除
     */
    ServiceResult<Boolean> deleteUser(String id);
    
    
    ServiceResult<Boolean> checkUserRole(String userId,String roleNo);
    ServiceResult<Boolean> checkUserApp(String userId,String appPath);
    
    ServiceResult<List<RoleAO>> getRoleListForRoleAssign(String userId);
    
    ServiceResult<Boolean> assignRole(String userId,List<UserRole> data);
    
    
    

}
