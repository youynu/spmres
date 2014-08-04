package com.youymi.app.stars.service;

import com.youymi.youymiframework.service.ServiceResult;

public interface IDaoService<X> {
	public ServiceResult<X> getById(String id);
	public ServiceResult<Boolean> deletetById(String id);
	public ServiceResult<X> save(X x);
	
}
