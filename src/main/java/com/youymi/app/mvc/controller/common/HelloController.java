package com.youymi.app.mvc.controller.common;

import java.util.Date;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloController {
	
	private Logger log = Logger.getLogger(HelloController.class);
	
	public HelloController() {
		log.debug("init hello controller ");
	}
	
	@RequestMapping(value = "/index")
	public String index() {
		System.out.println("index access");
		return "/home";
	}
	
	@RequestMapping(value = "/index2")
	public ModelAndView index2(Model model, HttpServletRequest request, HttpServletResponse response) {
		System.out.println("index access2");
		ModelAndView view = new ModelAndView();
		view.setViewName("/index");
		model.addAttribute("username", "youynu");
		model.addAttribute("date", new Date()
				);
		
		
		 
		return view;
	}

}
