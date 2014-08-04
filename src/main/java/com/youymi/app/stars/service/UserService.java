package com.youymi.app.stars.service;

import java.util.List;

import javax.annotation.Resource;

import org.apache.commons.lang.StringUtils;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.CollectionUtils;

import com.youymi.app.stars.data.ao.RoleAO;
import com.youymi.app.stars.data.dao.customized.PGMMapper;
import com.youymi.app.stars.data.dao.gen.UserMapper;
import com.youymi.app.stars.data.dao.gen.UserRoleMapper;
import com.youymi.app.stars.data.entity.gen.User;
import com.youymi.app.stars.data.entity.gen.UserExample;
import com.youymi.app.stars.data.entity.gen.UserRole;
import com.youymi.app.stars.data.entity.gen.UserRoleExample;
import com.youymi.youymiframework.service.ServiceResult;

@Service
public class UserService implements IUserService {

	private Logger log = Logger.getLogger(UserService.class);

	
	@Resource
	private UserMapper userMapper;
	
	@Resource
	private UserRoleMapper userRoleMapper;

	@Resource
	private PGMMapper pgmMapper;

	@Override
	public ServiceResult<User> loginValidate(User account) {
		if (account == null) {
			return new ServiceResult<>(false, "用户对象不能为空");
		}
		if (StringUtils.isBlank(account.getUserName())) {
			return new ServiceResult<>(false, "用户名不能为空");
		}
		if (StringUtils.isBlank(account.getUserPassword())) {
			return new ServiceResult<>(false, "用户密码不能空");
		}
		UserExample uc = new UserExample();
		uc.createCriteria().andUserNameEqualTo(account.getUserName());

		List<User> list = userMapper.selectByExample(uc);

		if (list == null || list.isEmpty()) {
			return new ServiceResult<>(false, "无此用户");
		}
		User current = list.get(0);

		if (account.getUserPassword().equals(current.getUserPassword())) {
			return new ServiceResult<>(true, current, "验证成功！");
		} else {
			return new ServiceResult<>(false, "密码不正确");
		}
	}

	@Override
	public ServiceResult<List<User>> getUserList(String userName) {
		List<User> data = null;
		try {
			UserExample ue = new UserExample();
			data = userMapper.selectByExample(ue);

		} catch (Exception e) {
			return new ServiceResult<>();
		}
		// TODO Auto-generated method stub
		return new ServiceResult<>(data);
	}

	@Override
	public ServiceResult<User> saveUser(User user) {
		if (user == null) {
			return new ServiceResult<>(false, "数据不能为空");
		}
		try {
			if (StringUtils.isNotBlank(user.getId())) {
				userMapper.updateByPrimaryKeySelective(user);
			} else {
				userMapper.insertSelective(user);
			}
		} catch (Exception e) {
			log.error("save user. ", e);
			return new ServiceResult<>(false, "出错了！请检查是否有重复名称等");
		}
		return new ServiceResult<>(true, user, "保存成功");
	}

	@Override
	public ServiceResult<Boolean> deleteUser(String id) {

		try {
			userMapper.deleteByPrimaryKey(id);
		} catch (Exception e) {
			log.error("delete user. ", e);
			return new ServiceResult<>(false, "删除用户出错了");
		}
		return new ServiceResult<>(true, "删除成功！");
	}

	@Override
	public ServiceResult<User> getUserById(String id) {

		User u = userMapper.selectByPrimaryKey(id);
		return new ServiceResult<>(u);
	}

	@Override
	public ServiceResult<Boolean> checkUserRole(String userId, String roleNo) {
		int count = pgmMapper.countQueryRole(userId, roleNo);
		if (count == 0) {
			return new ServiceResult<>(false);
		}
		return new ServiceResult<>(true);
	}

	@Override
	public ServiceResult<List<RoleAO>> getRoleListForRoleAssign(String userId) {
		return new ServiceResult<>(pgmMapper.getRoleListForRoleAssign(userId));
	}

	@Override
	@Transactional
	public ServiceResult<Boolean> assignRole(String userId, List<UserRole> data) {
		
		UserRoleExample ur = new UserRoleExample();
		ur.createCriteria().andUserIdEqualTo(userId);
		userRoleMapper.deleteByExample(ur);
		if (!CollectionUtils.isEmpty(data)) {
			for (UserRole u : data) {
				userRoleMapper.insert(u);
			}
		}
		return new ServiceResult<>(true,true,"成功啦");
	}

	@Override
	public ServiceResult<Boolean> checkUserApp(String userId, String appPath) {
		int count = pgmMapper.countQueryApp(userId, appPath);
		if (count == 0) {
			return new ServiceResult<>(false);
		}
		return new ServiceResult<>(true);
	}

}
