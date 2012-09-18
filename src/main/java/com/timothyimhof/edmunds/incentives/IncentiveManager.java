/*
 * Edmunds API Client Library
 * @author Timothy Imhof
 * @email timothyimhof@gmail.com
 */
package com.timothyimhof.edmunds.incentives;

import com.timothyimhof.edmunds.BaseRepositoryManager;

/**
 * The Class IncentiveManager.
 */
public class IncentiveManager extends BaseRepositoryManager {

	/**
	 * Instantiates a new incentive manager.
	 *
	 * @param apiVersion the api version
	 * @param apiKey the api key
	 */
	public IncentiveManager(String apiVersion, String apiKey) {
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
