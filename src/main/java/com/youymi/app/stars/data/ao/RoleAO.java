package com.youymi.app.stars.data.ao;

import java.io.Serializable;

import com.youymi.app.stars.data.entity.gen.Role;

public class RoleAO extends Role implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -7309383261275469825L;
	
	private String dataId;

	public String getDataId() {
		return dataId;
	}

	public void setDataId(String dataId) {
		this.dataId = dataId;
	}
	

}
