package com.youymi.app.stars.service;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import com.youymi.app.stars.data.ao.OrganizationAO;
import com.youymi.app.stars.data.entity.gen.DataTreeStore;
import com.youymi.app.stars.service.ba.IDataStoreService;
import com.youymi.youymiframework.service.ServiceResult;

@Service
public class OrganizationService implements IOrganizationService {

	@Resource
	private IDataStoreService datastoreService;

	@Override
	public ServiceResult<List<OrganizationAO>> getOrganizationListByParentId(
			String parentId) {
		ServiceResult<List<DataTreeStore>> ret = datastoreService
				.getDataTreeStoreListByTypeKeyAndParentId(
						OrganizationAO.TYPE_KEY, parentId);
		List<OrganizationAO> data = new ArrayList<>();
		if (!CollectionUtils.isEmpty(ret.getData())) {
			for (DataTreeStore ds : ret.getData()) {
				data.add(OrganizationAO.convert(ds));
			}
		}
		return new ServiceResult<List<OrganizationAO>>(data);
	}

	@Override
	public ServiceResult<List<OrganizationAO>> getOrganizationList() {
		ServiceResult<List<DataTreeStore>> ret = datastoreService
				.getDataTreeStoreListByTypeKey(OrganizationAO.TYPE_KEY);
		List<OrganizationAO> data = new ArrayList<>();
		if (!CollectionUtils.isEmpty(ret.getData())) {
			for (DataTreeStore ds : ret.getData()) {
				data.add(OrganizationAO.convert(ds));
			}
		}
		return new ServiceResult<List<OrganizationAO>>(data);
	}

	@Override
	public ServiceResult<OrganizationAO> getOrganizationById(String id) {
		ServiceResult<DataTreeStore> ret = datastoreService
				.getDataTreeStoreById(id);
		return new ServiceResult<OrganizationAO>(OrganizationAO.convert(ret
				.getData()));
	}

	@Override
	public ServiceResult<OrganizationAO> save(OrganizationAO org) {
		ServiceResult<DataTreeStore> ret = datastoreService.save(OrganizationAO
				.convert(org));
		return new ServiceResult<OrganizationAO>(OrganizationAO.convert(ret
				.getData()));
	}

	@Override
	public ServiceResult<Boolean> delete(String id) {
		return datastoreService.deleteDataTreeStoreById(id);
	}

}
