package com.youymi.app.stars.service;

import java.util.List;

import com.youymi.app.stars.data.ao.CustomerAO;
import com.youymi.app.stars.data.entity.gen.Customer;
import com.youymi.youymiframework.data.Pager;
import com.youymi.youymiframework.service.ServiceResult;

public interface ICustomerService extends IDaoService<Customer> {
	
	 /**
     * 获取用户账户列表
     * @param userName 用户名
     * @param page 分页
     * @return 账户列表
     */
    ServiceResult<List<CustomerAO>> getCustomerList(Pager page);
    
    ServiceResult<List<CustomerAO>> getCustomerList(Pager page, CustomerAO customer);

    /**
     * 添加用户账户
     * @param account 用户账户对象
     * @return 用户对象
     */
    ServiceResult<Customer> saveCustomer(Customer customer);

    /**
     * 删除账户
     * @param id 账户id
     * @return 是否删除
     */
    ServiceResult<Boolean> deleteCustomer(String id);
    
    ServiceResult<Customer> getCustomerById(String id);

}
