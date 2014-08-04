package com.youymi.app.mvc.controller.common;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class RootController {
	
	private Logger log = Logger.getLogger(this.getClass());

	@Value("${jdbc.username}")
	private String version;
	
	@Value("${publish.date}")
	private String publishDate;
	
	
	public RootController() {
		log.error("version:" + version +", publish date : " + publishDate);
	}
	
	@RequestMapping(value = "/")
	public ModelAndView index(Model model) {

		ModelAndView view = new ModelAndView();
		view.setViewName("forward:/home");

		return view;
	}
 
	@RequestMapping(value = "/about")
	public ModelAndView about(Model model) {

		ModelAndView view = new ModelAndView();
		model.addAttribute("version", version);
		model.addAttribute("publishDate", publishDate);
		
		view.setViewName("forward:/pgm/common/about");

		return view;
	}

}
