package com.youymi.app.mvc.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.youymi.app.mvc.ftl.gen.MVCViewName;
import com.youymi.app.mvc.ftl.tm.RoleCheck;

@Controller
@RequestMapping("/pgm")
public class PGMController {
	@Resource
	private RoleCheck roleCheck;
	

	@ModelAttribute("roleCheck")
	public RoleCheck getPrivilege() {
		return roleCheck;
	}
	
	@RequestMapping("index")
	public ModelAndView index() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName(MVCViewName.PGM_COMMON_INDEX.toString());
		return mv;
	}

}
