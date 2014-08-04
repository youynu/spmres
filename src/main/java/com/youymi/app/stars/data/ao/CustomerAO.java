package com.youymi.app.stars.data.ao;

import java.io.Serializable;

import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;

import com.youymi.app.stars.data.entity.gen.Customer;

public class CustomerAO extends Customer implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 6318689022392522399L;
	
	@Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this, ToStringStyle.MULTI_LINE_STYLE);
    }

}
