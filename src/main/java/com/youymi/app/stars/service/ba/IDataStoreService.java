package com.youymi.app.stars.service.ba;

import java.util.List;

import com.youymi.app.stars.data.entity.gen.DataStore;
import com.youymi.app.stars.data.entity.gen.DataTreeStore;
import com.youymi.youymiframework.service.ServiceResult;


public interface IDataStoreService {
	
	public ServiceResult<List<DataStore>> getDataStoreListByTypeName(String name);
	public ServiceResult<List<DataStore>> getDataStoreListByTypeKey(String key);
	public ServiceResult<DataStore> getDataStoreById(String id);
	public ServiceResult<DataStore> save(DataStore data);
	public ServiceResult<Boolean> deleteDataStoreById(String id);
	
	
	
	public ServiceResult<DataTreeStore> getDataTreeStoreById(String id);
	public ServiceResult<DataTreeStore> save(DataTreeStore data);
	public ServiceResult<Boolean> deleteDataTreeStoreById(String id);
	
	
	public ServiceResult<List<DataTreeStore>> getDataTreeStoreListByTypeKey(String key);
	public ServiceResult<List<DataTreeStore>> getDataTreeStoreListByTypeName(String name);
	
	public ServiceResult<List<DataTreeStore>> getDataTreeStoreListByTypeKeyAndParentId(String key,String parentId);
	public ServiceResult<List<DataTreeStore>> getDataTreeStoreListByTypeNameAndParentId(String name,String parentId);

}
