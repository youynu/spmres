package com.youymi.app.stars.service;

import java.util.List;

import com.youymi.app.stars.data.ao.OrganizationAO;
import com.youymi.youymiframework.service.ServiceResult;

public interface IOrganizationService {
	
	public ServiceResult<List<OrganizationAO>> getOrganizationListByParentId(String parentId);
	public ServiceResult<List<OrganizationAO>> getOrganizationList();
	public ServiceResult<OrganizationAO> getOrganizationById(String id);
	public ServiceResult<OrganizationAO> save(OrganizationAO org);
	public ServiceResult<Boolean> delete(String id);

}
