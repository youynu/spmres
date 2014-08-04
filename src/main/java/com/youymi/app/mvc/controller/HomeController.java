package com.youymi.app.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.youymi.app.mvc.ftl.gen.MVCViewName;

@Controller
@RequestMapping("/home")
public class HomeController {
	
	@RequestMapping(value = "")
	public ModelAndView index2(Model model) {

		ModelAndView view = new ModelAndView();
		view.setViewName(MVCViewName.PGM_HOME_INDEX.toString());

		return view;
	}
	

}
