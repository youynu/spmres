package com.youymi.app.stars.service;

import java.util.List;

import javax.annotation.Resource;

import org.apache.commons.lang.StringUtils;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Service;

import com.youymi.app.stars.data.ao.CustomerAO;
import com.youymi.app.stars.data.dao.customized.PGMMapper;
import com.youymi.app.stars.data.dao.gen.CustomerMapper;
import com.youymi.app.stars.data.entity.gen.Customer;
import com.youymi.youymiframework.data.Pager;
import com.youymi.youymiframework.service.ServiceResult;

@Service
public class CustomerService implements ICustomerService {
	
	private Logger log = Logger.getLogger(CustomerService.class);
	
	@Resource
	private PGMMapper pgmMapper;
	
	@Resource
	private CustomerMapper customerMapper;

	@Override
	public ServiceResult<List<CustomerAO>> getCustomerList(Pager page) {
		List<CustomerAO> data = null;
		try {
			data = pgmMapper.getCustomerList(page,null);
			
		}catch(Exception e) {
			log.error("getCustomerList", e);
		}
		 
		return new ServiceResult<>(data);
	}

	@Override
	public ServiceResult<Customer> saveCustomer(Customer customer) {
		if (customer == null) {
			return new ServiceResult<>(false,"数据不能为空");
		}
		try {
		if (StringUtils.isNotBlank(customer.getId())) {
			customerMapper.updateByPrimaryKeySelective(customer);
		} else {
			customerMapper.insertSelective(customer);
		}
		} catch(Exception e) {
			log.error("save customer. ", e);
			return new ServiceResult<>(false,"出错了！请检查是否有重复名称等");
		}
		return new ServiceResult<>(true,customer,"保存成功");
	}

	@Override
	public ServiceResult<Boolean> deleteCustomer(String id) {
		try {
			customerMapper.deleteByPrimaryKey(id);
		}catch(Exception e) {
			log.error("delete customer. ", e);
			return new ServiceResult<>(false, "删除出错了");
		}
		return new ServiceResult<>(true,"删除成功！");
	}

	@Override
	public ServiceResult<Customer> getCustomerById(String id) {
		Customer u = customerMapper.selectByPrimaryKey(id);
		return new ServiceResult<>(u);
	}

	@Override
	public ServiceResult<Customer> getById(String id) {
		
		return getCustomerById(id);
	}

	@Override
	public ServiceResult<Boolean> deletetById(String id) {
		// TODO Auto-generated method stub
		return deleteCustomer(id);
	}

	@Override
	public ServiceResult<Customer> save(Customer x) {
		// TODO Auto-generated method stub
		return saveCustomer(x);
	}

	@Override
	public ServiceResult<List<CustomerAO>> getCustomerList(Pager page,
			CustomerAO customer) {
		List<CustomerAO> data = null;
	
		try {
			data = pgmMapper.getCustomerList(page,customer);
			
		}catch(Exception e) {
			log.error("getCustomerList", e);
		}
		 
		return new ServiceResult<>(data);
	}

}
