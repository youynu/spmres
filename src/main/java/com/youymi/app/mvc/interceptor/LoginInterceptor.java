package com.youymi.app.mvc.interceptor;

import java.util.regex.Pattern;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.lang.StringUtils;
import org.apache.log4j.Logger;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import com.youymi.app.mvc.Constant;

public class LoginInterceptor implements HandlerInterceptor {
	private Logger LOGGER = Logger.getLogger(LoginInterceptor.class);

	/**
	 * 不需要进行校验的URL的正则表达式
	 */
	private String pattern;

	public String getPattern() {
		return pattern;
	}

	public void setPattern(String pattern) {
		this.pattern = pattern;
	}

	/**
	 * session失效后的拦截机制
	 */
	private String redirectURL;

	public String getRedirectURL() {
		return redirectURL;
	}

	public void setRedirectURL(String redirectURL) {
		this.redirectURL = redirectURL;
	}

	private String loginTimeoutPage;
	
	public String getLoginTimeoutPage() {
		return loginTimeoutPage;
	}

	public void setLoginTimeoutPage(String loginTimeoutPage) {
		this.loginTimeoutPage = loginTimeoutPage;
	}

	@Override
	public boolean preHandle(HttpServletRequest request,
			HttpServletResponse response, Object handler) throws Exception {
		 
		LOGGER.info("preHandle enter, and with request URI:" + request.getRequestURI());
		 if (request.getRequestURI() != null && null != pattern
	                && Pattern.compile(pattern).matcher(request.getRequestURI()).matches()) {
	            return true;
	        }
		 
		Object o = request.getSession().getAttribute("currentUser");
		if (o != null) {
			return true;
			
		} else  {
			String ajax = request.getParameter(Constant.KEY_AJAX);
			if (StringUtils.isNotBlank(ajax)) {
							 
				request.getRequestDispatcher("/login/logintimeoutjson").forward(request, response);
				return false;
			}
			// 去超时页面
			String goTimeoutPage = request.getParameter(Constant.KEY_GOTIMEOUTPAGE);
			if (StringUtils.isNotBlank(goTimeoutPage)) {
				  response.sendRedirect(loginTimeoutPage);
	                return false;
			}
			
			 //未登录的访问 或者 登出后的访问            
            if (StringUtils.isNotBlank(redirectURL)) {
                response.sendRedirect(redirectURL + "?goback=" + request.getRequestURL().toString());
                return false;
            }
		}
		return false;
	}

	@Override
	public void postHandle(HttpServletRequest request,
			HttpServletResponse response, Object handler,
			ModelAndView modelAndView) throws Exception {
		// TODO Auto-generated method stub

	}

	@Override
	public void afterCompletion(HttpServletRequest request,
			HttpServletResponse response, Object handler, Exception ex)
			throws Exception {
		// TODO Auto-generated method stub

	}

}
