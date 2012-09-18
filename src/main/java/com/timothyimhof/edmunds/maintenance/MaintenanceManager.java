/*
 * Edmunds API Client Library
 * @author Timothy Imhof
 * @email timothyimhof@gmail.com
 */
package com.timothyimhof.edmunds.maintenance;

import com.timothyimhof.edmunds.BaseRepositoryManager;

/**
 * The Class MaintenanceManager.
 */
public class MaintenanceManager extends BaseRepositoryManager {

	/**
	 * Instantiates a new maintenance manager.
	 *
	 * @param apiVersion the api version
	 * @param apiKey the api key
	 */
	public MaintenanceManager(String apiVersion, String apiKey) {
		super(apiVersion, apiKey);
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
