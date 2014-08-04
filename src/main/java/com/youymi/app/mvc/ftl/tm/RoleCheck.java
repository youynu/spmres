package com.youymi.app.mvc.ftl.tm;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

import org.apache.commons.lang.StringUtils;
import org.springframework.stereotype.Component;
import org.springframework.util.CollectionUtils;

import com.youymi.app.mvc.Constant;
import com.youymi.app.stars.data.entity.gen.User;
import com.youymi.app.stars.service.IUserService;
import com.youymi.youymiframework.service.ServiceResult;

import freemarker.template.TemplateMethodModel;
import freemarker.template.TemplateModelException;

@Component
public class RoleCheck implements TemplateMethodModel {
	
	
	
	@Resource 
	private HttpSession session;
	
	@Resource
	private IUserService userService;
	
	@Override
	public Object exec(@SuppressWarnings("rawtypes") List arguments) throws TemplateModelException {
		User u = (User) session.getAttribute(Constant.KEY_LOGIN_USER);
		if (u == null) {
			return "false";
		}
		if (CollectionUtils.isEmpty(arguments)) {
			return "false";
		}
		
		String queryRoleNo = (String) arguments.get(0);
		if (StringUtils.isBlank(queryRoleNo)) {
			return "false";
		}
		
		ServiceResult<Boolean> ret = userService.checkUserRole(u.getId(), queryRoleNo);
		return ret.getData().toString();
		
		
	}

}
