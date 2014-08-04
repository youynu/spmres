package com.youymi.app.mvc.controller.common;

import java.io.IOException;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/test")
public class TestController {
	  /**
     * 拟稿表单
     * @param request
     * @param response
     * @return
	 * @throws IOException 
     */
    @RequestMapping(value = "")
    public String test(Model model, HttpServletRequest request, HttpServletResponse res) throws IOException {
    	model.addAttribute("uri", request.getRequestURI());
    	model.addAttribute("url", request.getRequestURL().toString());
    	if (request.getParameter("redirect") != null) {
    		Cookie c = new Cookie("hi", "redirect");
    		res.addCookie(c);
    	res.sendRedirect(request.getRequestURI());
    	}
        return "/test";
    }
	
}
