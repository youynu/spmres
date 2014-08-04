package com.youymi.app.stars.service.ba;

import java.util.List;

import javax.annotation.Resource;

import org.apache.commons.lang.StringUtils;
import org.springframework.stereotype.Service;

import com.youymi.app.stars.data.dao.gen.DataStoreMapper;
import com.youymi.app.stars.data.dao.gen.DataTreeStoreMapper;
import com.youymi.app.stars.data.entity.gen.DataStore;
import com.youymi.app.stars.data.entity.gen.DataStoreExample;
import com.youymi.app.stars.data.entity.gen.DataTreeStore;
import com.youymi.app.stars.data.entity.gen.DataTreeStoreExample;
import com.youymi.youymiframework.service.ServiceResult;

@Service
public class DataStoreService implements IDataStoreService {

	@Resource
	private DataStoreMapper dataStoreMapper;

	@Resource
	private DataTreeStoreMapper dataTreeStoreMapper;

	@Override
	public ServiceResult<List<DataStore>> getDataStoreListByTypeName(String name) {
		List<DataStore> data = null;
		DataStoreExample de = new DataStoreExample();

		if (name == null) {
			return new ServiceResult<List<DataStore>>(null);
		} else {
			de.createCriteria().andTypeNameEqualTo(name);

			data = dataStoreMapper.selectByExample(de);

			return new ServiceResult<List<DataStore>>(data);
		}

	}

	@Override
	public ServiceResult<List<DataStore>> getDataStoreListByTypeKey(String key) {
		List<DataStore> data = null;
		DataStoreExample de = new DataStoreExample();
		if (key == null) {
			return new ServiceResult<List<DataStore>>(null);
		} else {
			de.createCriteria().andTypeKeyEqualTo(key);

			data = dataStoreMapper.selectByExample(de);

			return new ServiceResult<List<DataStore>>(data);
		}

	}

	@Override
	public ServiceResult<List<DataTreeStore>> getDataTreeStoreListByTypeKey(
			String key) {
		
		List<DataTreeStore> data = null;
		DataTreeStoreExample de = new DataTreeStoreExample();
		if (key == null) {
			return new ServiceResult<List<DataTreeStore>>(null);
		} else {
			de.createCriteria().andTypeKeyEqualTo(key);

			data = dataTreeStoreMapper.selectByExample(de);

			return new ServiceResult<List<DataTreeStore>>(data);
		}

	}

	@Override
	public ServiceResult<List<DataTreeStore>> getDataTreeStoreListByTypeName(
			String name) {
		 
		List<DataTreeStore> data = null;
		DataTreeStoreExample de = new DataTreeStoreExample();
		if (name == null) {
			return new ServiceResult<List<DataTreeStore>>(null);
		} else {
			de.createCriteria().andTypeNameEqualTo(name);

			data = dataTreeStoreMapper.selectByExample(de);

			return new ServiceResult<List<DataTreeStore>>(data);
		}

	}

	@Override
	public ServiceResult<List<DataTreeStore>> getDataTreeStoreListByTypeKeyAndParentId(
			String key, String parentId) {

		List<DataTreeStore> data = null;
		DataTreeStoreExample de = new DataTreeStoreExample();
		if (key == null) {
			return new ServiceResult<List<DataTreeStore>>(null);
		} else {
			DataTreeStoreExample.Criteria ce = de.createCriteria().andTypeKeyEqualTo(key);
			if (parentId == null) {
				ce.andParentIdIsNull();
			} else  {
				ce.andParentIdEqualTo(parentId);
			}
			 
			
			data = dataTreeStoreMapper.selectByExample(de);

			return new ServiceResult<List<DataTreeStore>>(data);
		}
				 
	}

	@Override
	public ServiceResult<List<DataTreeStore>> getDataTreeStoreListByTypeNameAndParentId(
			String name, String parentId) {
		List<DataTreeStore> data = null;
		DataTreeStoreExample de = new DataTreeStoreExample();
		if (name == null) {
			return new ServiceResult<List<DataTreeStore>>(null);
		} else {
			DataTreeStoreExample.Criteria ce = de.createCriteria().andTypeNameEqualTo(name);
			if (parentId == null) {
				ce.andParentIdIsNull();
			} else  {
				ce.andParentIdEqualTo(parentId);
			}
			
			data = dataTreeStoreMapper.selectByExample(de);

			return new ServiceResult<List<DataTreeStore>>(data);
		}
	}

	@Override
	public ServiceResult<DataStore> getDataStoreById(String id) {
		DataStore d = null;
 
		if (id == null) {
			return new ServiceResult<DataStore>(null);
		} else {
			d = dataStoreMapper.selectByPrimaryKey(id);
			return new ServiceResult<DataStore>(d);
		}
	 
	}

	@Override
	public ServiceResult<DataStore> save(DataStore data) {
		if (data == null) {
			return new ServiceResult<DataStore>(false,"保存对象不能为空");
		} else {
			if (StringUtils.isBlank(data.getId())) {
				dataStoreMapper.insert(data);
			} else {
				dataStoreMapper.updateByPrimaryKeySelective(data);
			}
		}
		return new ServiceResult<DataStore>(data);
	}

	@Override
	public ServiceResult<Boolean> deleteDataStoreById(String id) {
		if (id == null) {
			return new ServiceResult<Boolean>(true);
		}
		dataStoreMapper.deleteByPrimaryKey(id);
		
		return new ServiceResult<Boolean>(true);
	}

	@Override
	public ServiceResult<DataTreeStore> getDataTreeStoreById(String id) {
		if (StringUtils.isBlank(id)) {
			return new ServiceResult<DataTreeStore>(null);
		}
		return new ServiceResult<DataTreeStore>(dataTreeStoreMapper.selectByPrimaryKey(id));
	}

	@Override
	public ServiceResult<DataTreeStore> save(DataTreeStore data) {
		if (data == null) {
			return new ServiceResult<DataTreeStore>(false,"保存对象不能为空");
		} else {
			if (StringUtils.isBlank(data.getId())) {
				dataTreeStoreMapper.insert(data);
			} else {
				dataTreeStoreMapper.updateByPrimaryKeySelective(data);
			}
		}
		return new ServiceResult<DataTreeStore>(data);
	}

	@Override
	public ServiceResult<Boolean> deleteDataTreeStoreById(String id) {
		if (id == null) {
			return new ServiceResult<Boolean>(true);
		}
		dataTreeStoreMapper.deleteByPrimaryKey(id);
		
		return new ServiceResult<Boolean>(true);
	}

}
