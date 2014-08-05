package com.youymi.app.mvc.controller;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.log4j.Logger;
import org.json.JSONObject;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.youymi.app.mvc.ftl.gen.MVCViewName;
import com.youymi.app.mvc.ftl.tm.RoleCheck;
import com.youymi.app.stars.data.ao.OrganizationAO;
import com.youymi.app.stars.service.IOrganizationService;
import com.youymi.youymiframework.service.ServiceResult;

@Controller
@RequestMapping("/organization")
public class OrganizationController {
	
	private Logger log = Logger.getLogger(OrganizationController.class);
	
	@Resource
	private HttpSession session;
	
	@Resource
	private RoleCheck roleCheck;
	
	@ModelAttribute("roleCheck")
	public RoleCheck getPrivilege() {
		return roleCheck;
	}
	
	@Resource
	private IOrganizationService organizationService;
	
	public OrganizationController() {
		log.info("init org contorller");
	}
	
	@RequestMapping(value = "/index")
	public ModelAndView index(HttpServletRequest request, Model model) {
		ModelAndView mv = new ModelAndView();
		//User u = (User) session.getAttribute(Constant.KEY_LOGIN_USER);
		
//		if (u != null) {
//			ServiceResult<Boolean> ret = userService.checkUserApp(u.getId(), request.getRequestURI().replace(
//					request.getContextPath(), ""));
//			if (ret.getData() == false) {
//				mv.setViewName(MVCViewName.ERRORS_ERROR.toString());
//				model.addAttribute("errormsg", "您没有访问此页面的权限");
//				return mv;
//			}
//		}
		ServiceResult<List<OrganizationAO>> ret = organizationService.getOrganizationList();
		model.addAttribute("treeData",JSONObject.valueToString(ret.getData()));
		//log.warn(new JSONObject(ret.getData()).toString());
		mv.setViewName(MVCViewName.PGM_ORGANIZATION_INDEX.toString());
		return mv;
	}
}
