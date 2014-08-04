package com.youymi.app.mvc.controller.common;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

 
@Controller
@RequestMapping(value = "/error")
public class ErrorController {
	
  
    /**
     * 403页面定向
     * @param model 模板变量
     * @param request 请求
     * @return 403页面
     */
    @RequestMapping(value = "/403", method = RequestMethod.GET)
    public ModelAndView error403(Model model, HttpServletRequest request) {
    
        return new ModelAndView("/errors/403");
    }

    /**
     * 404页面定向
     * @param model 模板变量
     * @param request 请求
     * @return 404页面
     */
    @RequestMapping(value = "/404", method = RequestMethod.GET)
    public ModelAndView error404(Model model, HttpServletRequest request) {
        return new ModelAndView("/errors/404");
    }

    /**
     * 500页面定向
     * @param model 模板变量
     * @param request 请求
     * @return 500页面
     */
    @RequestMapping(value = "/500", method = RequestMethod.GET)
    public ModelAndView error500(Model model, HttpServletRequest request) {
       
        return new ModelAndView("/errors/500");
    }
}
