package com.youymi.app.mvc.controller;

import java.util.List;

import javax.annotation.Resource;

import org.apache.commons.lang.StringUtils;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.youymi.app.mvc.ftl.gen.MVCViewName;
import com.youymi.app.mvc.ftl.tm.RoleCheck;
import com.youymi.app.stars.data.ao.CustomerAO;
import com.youymi.app.stars.data.entity.gen.Customer;
import com.youymi.app.stars.service.ICustomerService;
import com.youymi.app.stars.service.IUserService;
import com.youymi.youymiframework.data.Pager;
import com.youymi.youymiframework.service.ServiceResult;

@Controller
@RequestMapping("/customer")
public class CustomerController {
	
	private Logger log = Logger.getLogger(CustomerController.class);
	@Resource
	private IUserService userService;
	
	@Resource
	private ICustomerService customerService;
	
	@Resource
	private RoleCheck roleCheck;
	

	@ModelAttribute("roleCheck")
	public RoleCheck getPrivilege() {
		return roleCheck;
	}
	

	@RequestMapping(value = "/index")
	public ModelAndView index(Model model,Pager page) {
		page.setPageSize(1000);
		ModelAndView mv = new ModelAndView();
		ServiceResult<List<CustomerAO>> ret = customerService.getCustomerList(page);
		model.addAttribute("itemList", ret.getData());
		
		mv.setViewName(MVCViewName.PGM_CUSTOMER_INDEX.toString());
		return mv;
	}
	
	@RequestMapping(value = "/search")
	public ModelAndView search(Model model,Pager page, CustomerAO search) {
		page.setPageSize(100);
		ModelAndView mv = new ModelAndView();
		ServiceResult<List<CustomerAO>> ret = customerService.getCustomerList(page, search);
		model.addAttribute("itemList", ret.getData());
		
		mv.setViewName(MVCViewName.PGM_CUSTOMER_CUSTOMERROW.toString());
		return mv;
	}

	@RequestMapping(value = "/form")
	public ModelAndView form(String id, Model modle) {
		ModelAndView mv = new ModelAndView();
		if (StringUtils.isNotBlank(id)) {
		ServiceResult<Customer> ret = customerService.getCustomerById(id);
		modle.addAttribute("customer", ret.getData());
		}
		mv.setViewName(MVCViewName.PGM_CUSTOMER_FORM.toString());
		return mv;

	}
	
	@RequestMapping(value = "/viewform")
	public ModelAndView viewform(String id, Model modle) {
		ModelAndView mv = new ModelAndView();
		if (StringUtils.isNotBlank(id)) {
		ServiceResult<Customer> ret = customerService.getCustomerById(id);
		modle.addAttribute("customer", ret.getData());
		}
		mv.setViewName(MVCViewName.PGM_CUSTOMER_VIEWFORM.toString());
		return mv;

	}

	@RequestMapping(value = "/save")
	@ResponseBody
	public Object save(Customer customer) {
		log.error(ToStringBuilder.reflectionToString(customer, ToStringStyle.MULTI_LINE_STYLE));
		
		return customerService.saveCustomer(customer);

	}
	
	@RequestMapping(value = "/delete")
	@ResponseBody
	public Object delete(String id) {
		return customerService.deleteCustomer(id);

	}

}
