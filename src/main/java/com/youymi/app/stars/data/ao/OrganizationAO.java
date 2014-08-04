package com.youymi.app.stars.data.ao;

import com.youymi.app.stars.data.component.DataStoreComponent;
import com.youymi.app.stars.data.entity.gen.DataTreeStore;

public class OrganizationAO extends DataStoreComponent {
	
	public static final String TYPE_KEY = "organization";
	public static final String TYPE_NAME = "组织机构";

	/**
	 * 
	 */
	private static final long serialVersionUID = 1610830202211727697L;
	public OrganizationAO() {
		super(TYPE_KEY, TYPE_NAME);
	}
	
	private String id;
	private String parentId;
	private String name;
	private String key;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getParentId() {
		return parentId;
	}
	public void setParentId(String parentId) {
		this.parentId = parentId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getKey() {
		return key;
	}
	public void setKey(String key) {
		this.key = key;
	}
	
	public static DataTreeStore convert(OrganizationAO org) {
		if (org == null) {
			return null;
		}
		
		DataTreeStore ds = new DataTreeStore();
		ds.setId(org.getId());
		ds.setItemKey(org.getKey());
		ds.setItemValue(org.getName());
		ds.setTypeKey(org.getTypeKey());
		ds.setTypeName(org.getTypeName());
		ds.setParentId(org.getParentId());
		return ds;
		
	}
	
	public static OrganizationAO convert(DataTreeStore ds) {
		OrganizationAO org = new OrganizationAO();
		if (ds == null) {
			return null;
		}
		
		org.setId(ds.getId());
		org.setKey(ds.getItemKey());
		org.setName(ds.getItemValue());
		org.setTypeKey(ds.getTypeKey());
		org.setTypeName(ds.getTypeName());
		org.setParentId(ds.getParentId());
		
		return org;
		
	}

}
