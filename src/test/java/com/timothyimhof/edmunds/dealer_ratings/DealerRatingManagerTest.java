/*
 * Edmunds API Client Library
 * @author Timothy Imhof
 * @email timothyimhof@gmail.com
 */
package com.timothyimhof.edmunds.dealer_ratings;

import com.timothyimhof.edmunds.BaseManagerTest;
import com.timothyimhof.edmunds.BaseRepositoryManager;

public class DealerRatingManagerTest extends BaseManagerTest {

	@Override
	protected BaseRepositoryManager getManager() {
		return new DealerRatingManager(properties.getProperty("api_version"),
				properties.getProperty("vehicle_api_key"));
	}

}
