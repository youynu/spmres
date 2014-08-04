package com.youymi.app.mvc.controller;

import javax.annotation.Resource;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.commons.lang.StringUtils;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import cn.org.rapid_framework.web.util.CookieUtils;

import com.youymi.app.mvc.Constant;
import com.youymi.app.mvc.ftl.tm.RoleCheck;
import com.youymi.app.stars.data.entity.gen.User;
import com.youymi.app.stars.service.IUserService;
import com.youymi.youymiframework.service.ServiceResult;

@Controller
@RequestMapping("/login")
public class LoginController {

	@Resource
	private IUserService userService;

	@Resource
	private RoleCheck roleCheck;

	@Resource
	private HttpSession session;

	private Logger log = Logger.getLogger(LoginController.class);

	@ModelAttribute(value = "currentUser")
	public User getCurrentAccount() {
		return (User) session.getAttribute("currentUser");
	}

	@ModelAttribute("roleCheck")
	public RoleCheck getPrivilege() {
		return roleCheck;
	}

	@RequestMapping("")
	public ModelAndView index(HttpServletRequest request, String goback,
			Model model) {

		ModelAndView view = new ModelAndView("/pgm/user/login");
		if (session.getAttribute(Constant.KEY_LOGIN_USER) != null) {
			view.setViewName("redirect:/pgm/index");
			return view;
		}

		Cookie[] cs = request.getCookies();
		Cookie c = CookieUtils.toMap(cs).get("user");
		if (c != null) {
			String userName = c.getValue();
			User u = new User();
			u.setUserName(userName);
			view.addObject("user", u);
			 
		}
		
		Cookie cc = CookieUtils.toMap(cs).get("checked");
		if (cc != null) {
			String checked = cc.getValue();
			 
			view.addObject("checked", checked);
		}
		

		model.addAttribute("goback", goback);
		return view;
	}

	@RequestMapping("/timeout")
	public ModelAndView timeout(String goback, Model model) {

		ModelAndView view = new ModelAndView("/pgm/user/login-timeout");

		return view;
	}

	@RequestMapping("/newLogin")
	public ModelAndView newLogin(String goback, Model model) {

		ModelAndView view = new ModelAndView("/pgm/user/new-login");
		if (session.getAttribute(Constant.KEY_LOGIN_USER) != null) {
			view.setViewName("redirect:/pgm/index");

			return view;
		}

		model.addAttribute("goback", goback);
		return view;
	}

	@RequestMapping("/doLogin")
	public ModelAndView doLogin(HttpServletRequest request,
			String rememberUserName, String goback, User user,
			HttpSession session, HttpServletResponse response) {
		ModelAndView mv = new ModelAndView("redirect:/pgm/index");

		if (session.getAttribute("currentUser") != null) {
			return mv;
		}

		ServiceResult<User> ret = userService.loginValidate(user);
		if (ret.isSucceed()) {
			Cookie c = new Cookie("user", user.getUserName());
			
			if (rememberUserName != null && rememberUserName.equals("true")) {
				c.setMaxAge(60 * 60 * 24 * 14);
				Cookie c2 = new Cookie("checked", "checked");
				c2.setMaxAge(60 * 60 * 24 * 14);
				response.addCookie(c2);

			} else {
				c.setMaxAge(0);
				Cookie c2 = new Cookie("checked", "");
				c2.setMaxAge(60 * 60 * 24 * 14);
				response.addCookie(c2);
			}
			response.addCookie(c);
			
			session.setAttribute("currentUser", ret.getData());
			if (StringUtils.isNotBlank(goback)) {
				if (goback.indexOf(request.getContextPath() + "/") > -1) {
					mv.setViewName("redirect:" + goback);
					return mv;
				}
			}
		} else {
			mv.setViewName("/pgm/user/login");
			mv.addObject("user", user);
			mv.addObject("message", ret.getMsg());

		}
		return mv;
	}

	@RequestMapping("/loginOut")
	public String loginOut(HttpSession session) {

		session.removeAttribute("currentUser");

		return "forward:/login";
	}

	@RequestMapping("/logintimeoutjson")
	@ResponseBody
	public Object logintimeoutjson() {
		log.error("登录超时,请重新登录");
		ServiceResult<Boolean> ret = new ServiceResult<>(false, false,
				"登录超时,请重新登录,亲....");
		ret.setCode(Constant.CODE_LOGIN_TIMEOUT);
		return ret;
	}

}
