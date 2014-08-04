package com.youymi.app.stars.data.component;

import java.io.Serializable;

public  class DataStoreComponent implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -8859516887866316394L;
	private String typeKey;
	private String typeName;
	
	public DataStoreComponent(String typeKey, String typeName) {
		 
	}
	
	public String getTypeKey() {
		return typeKey;
	}

	public String getTypeName() {
		return typeName;
	}

	public void setTypeName(String typeName) {
		this.typeName = typeName;
	}

	public void setTypeKey(String typeKey) {
		this.typeKey = typeKey;
	}
 
	
	
}
