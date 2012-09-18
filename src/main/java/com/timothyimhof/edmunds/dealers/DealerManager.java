/*
 * Edmunds API Client Library
 * @author Timothy Imhof
 * @email timothyimhof@gmail.com
 */
package com.timothyimhof.edmunds.dealers;

import com.timothyimhof.edmunds.BaseRepositoryManager;

/**
 * The Class DealerManager.
 */
public class DealerManager extends BaseRepositoryManager{

	/**
	 * Instantiates a new dealer manager.
	 *
	 * @param apiVersion the api version
	 * @param apiKey the api key
	 */
	public DealerManager(String apiVersion, String apiKey) {
		super(apiVersion, apiKey);
		// TODO Auto-generated constructor stub
	}

	/* (non-Javadoc)
	 * @see com.timothyimhof.edmunds.BaseRepositoryManager#getRequestRepository()
	 */
	@Override
	protected String getRequestRepository() {
		// TODO Auto-generated method stub
		return null;
	}

}
