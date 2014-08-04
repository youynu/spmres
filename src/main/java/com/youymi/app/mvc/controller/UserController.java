package com.youymi.app.mvc.controller;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.commons.lang.StringUtils;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.youymi.app.mvc.Constant;
import com.youymi.app.mvc.ftl.gen.MVCViewName;
import com.youymi.app.mvc.ftl.tm.RoleCheck;
import com.youymi.app.stars.data.ao.RoleAO;
import com.youymi.app.stars.data.entity.gen.User;
import com.youymi.app.stars.data.entity.gen.UserRole;
import com.youymi.app.stars.service.IUserService;
import com.youymi.youymiframework.service.ServiceResult;

@Controller
@RequestMapping("/user")
public class UserController {

	@Resource
	private IUserService userService;

	@Resource
	private HttpSession session;

	@Resource
	private RoleCheck roleCheck;

	@ModelAttribute("roleCheck")
	public RoleCheck getPrivilege() {
		return roleCheck;
	}

	@RequestMapping(value = "/index")
	public ModelAndView index(HttpServletRequest request, Model model) {
		ModelAndView mv = new ModelAndView();
		User u = (User) session.getAttribute(Constant.KEY_LOGIN_USER);
		
		if (u != null) {
			ServiceResult<Boolean> ret = userService.checkUserApp(u.getId(), request.getRequestURI().replace(
					request.getContextPath(), ""));
			if (ret.getData() == false) {
				mv.setViewName(MVCViewName.ERRORS_ERROR.toString());
				model.addAttribute("errormsg", "您没有访问此页面的权限");
				return mv;
			}
		}
		
		ServiceResult<List<User>> ret = userService.getUserList(null);
		model.addAttribute("itemList", ret.getData());
		mv.setViewName(MVCViewName.PGM_USER_INDEX.toString());
		return mv;
	}

	@RequestMapping(value = "/form")
	public ModelAndView form(String id, Model modle) {
		ModelAndView mv = new ModelAndView();
		if (StringUtils.isNotBlank(id)) {
			ServiceResult<User> ret = userService.getUserById(id);
			modle.addAttribute("user", ret.getData());
		}
		mv.setViewName(MVCViewName.PGM_USER_FORM.toString());
		return mv;

	}

	@RequestMapping(value = "/roleassignform")
	public ModelAndView roleassignform(String userId, Model model) {
		ModelAndView mv = new ModelAndView();
		model.addAttribute("userId", userId);

		if (StringUtils.isNotBlank(userId)) {
			ServiceResult<List<RoleAO>> ret = userService
					.getRoleListForRoleAssign(userId);
			model.addAttribute("itemList", ret.getData());
		}
		mv.setViewName(MVCViewName.PGM_USER_ROLEASSIGN.toString());
		return mv;

	}
	
	@RequestMapping(value = "/passwordform")
	public ModelAndView passwordform(String userId, Model modle) {
		ModelAndView mv = new ModelAndView();

	
		mv.setViewName(MVCViewName.PGM_USER_PASSWORDFORM.toString());
		return mv;

	}
	
	@RequestMapping(value = "/suggestionform")
	public ModelAndView suggestionform(String userId, Model modle) {
		ModelAndView mv = new ModelAndView();

	
		mv.setViewName(MVCViewName.PGM_USER_SUGGESTIONFORM.toString());
		return mv;

	}
	

	@RequestMapping(value = "/save")
	@ResponseBody
	public Object save(User user) {
		return userService.saveUser(user);

	}
	
	@RequestMapping(value = "/saveuserrole")
	@ResponseBody
	public Object saveuserrole(String[] roleId,String userId) {
		if (StringUtils.isBlank(userId)) {
			return new ServiceResult<>(false, "userId不能为空");
		}
		List<UserRole> data = new ArrayList<>();
		if (roleId != null) {
			for (String id : roleId) {
				UserRole ur = new UserRole();
				ur.setRoleId(id);
				ur.setUserId(userId);
				data.add(ur);
			}
		}
		return userService.assignRole(userId, data);

	}
	
	

	@RequestMapping(value = "/delete")
	@ResponseBody
	public Object delete(String id) {
		return userService.deleteUser(id);

	}

}
