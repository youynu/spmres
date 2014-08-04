package com.youymi.test;

import java.util.List;

import javax.annotation.Resource;

import org.json.JSONObject;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractJUnit4SpringContextTests;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.youymi.app.stars.data.ao.OrganizationAO;
import com.youymi.app.stars.data.dao.gen.CustomerMapper;
import com.youymi.app.stars.data.entity.gen.Customer;
import com.youymi.app.stars.data.entity.gen.CustomerExample;
import com.youymi.app.stars.data.entity.gen.DataStore;
import com.youymi.app.stars.service.IOrganizationService;
import com.youymi.app.stars.service.ba.IDataStoreService;
import com.youymi.youymiframework.service.ServiceResult;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "file:src/test/java/*.xml" })
public class CustomerDAOTest extends AbstractJUnit4SpringContextTests {
	@Resource
	private CustomerMapper customerMapper;
	
	@Resource
	private IDataStoreService datastoreService;
	
	@Resource
	private IOrganizationService organizationService;
	
	@Test
	public void testSave() {
		Customer c = new Customer();
		c.setCustomerName("yiyao");
		c.setCustomerNo("1");
		customerMapper.insert(c);
		CustomerExample ce = new CustomerExample();
		ce.createCriteria().andCustomerNameEqualTo("yiyao");
		 
		c.setCustomerNo("ydasdhjk");
		customerMapper.updateByExampleSelective(c, ce);
		
		//customerMapper.selectByExample(example)
	}
	
	@Test
	public void testDataStore() {
		ServiceResult<List<OrganizationAO>> ret =organizationService.getOrganizationListByParentId(null);
		System.out.println(JSONObject.valueToString(ret.getData()));
		//ServiceResult<List<DataStore>> ret = datastoreService.getDataStoreListByTypeName(null);
		//datastoreService.getDataTreeStoreListByTypeKey("1");
		datastoreService.getDataTreeStoreListByTypeKeyAndParentId("1","1");
		
		//System.out.println(ret);
		//customerMapper.selectByExample(example)
	}

}
