package com.youymi.app.stars.data.dao.customized;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.youymi.app.stars.data.ao.CustomerAO;
import com.youymi.app.stars.data.ao.RoleAO;
import com.youymi.youymiframework.data.Pager;

public interface PGMMapper {

	 List<CustomerAO> getCustomerList(@Param("page") Pager page, @Param("search") CustomerAO search);
	 int countQueryRole(@Param("userId") String userId, @Param("roleNo") String roleNo);
	 List<RoleAO> getRoleListForRoleAssign(@Param("userId") String userId);
	 int countQueryApp(@Param("userId") String userId, @Param("appPath") String appPath);
	 
}