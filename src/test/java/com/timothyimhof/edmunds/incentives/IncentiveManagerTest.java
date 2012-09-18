/*
 * Edmunds API Client Library
 * @author Timothy Imhof
 * @email timothyimhof@gmail.com
 */
package com.timothyimhof.edmunds.incentives;

import com.timothyimhof.edmunds.BaseManagerTest;
import com.timothyimhof.edmunds.BaseRepositoryManager;

public class IncentiveManagerTest extends BaseManagerTest {

	@Override
	protected BaseRepositoryManager getManager() {
		return new IncentiveManager(properties.getProperty("api_version"),
				properties.getProperty("vehicle_api_key"));
	}

}
