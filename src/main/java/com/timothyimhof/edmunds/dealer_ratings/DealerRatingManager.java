/*
 * Edmunds API Client Library
 * @author Timothy Imhof
 * @email timothyimhof@gmail.com
 */
package com.timothyimhof.edmunds.dealer_ratings;

import com.timothyimhof.edmunds.BaseRepositoryManager;

/**
 * The Class DealerRatingManager.
 */
public class DealerRatingManager extends BaseRepositoryManager {

	/**
	 * Instantiates a new dealer rating manager.
	 *
	 * @param apiVersion the api version
	 * @param apiKey the api key
	 */
	public DealerRatingManager(String apiVersion, String apiKey) {
		super(apiVersion, apiKey);
	}

	/* (non-Javadoc)
	 * @see com.timothyimhof.edmunds.BaseRepositoryManager#getRequestRepository()
	 */
	@Override
	protected String getRequestRepository() {
		return null;
	}

}
