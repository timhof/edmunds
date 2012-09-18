/*
 * Edmunds API Client Library
 * @author Timothy Imhof
 * @email timothyimhof@gmail.com
 */
package com.timothyimhof.edmunds.tmv;

import com.timothyimhof.edmunds.BaseManagerTest;
import com.timothyimhof.edmunds.BaseRepositoryManager;

public class TMVManagerTest extends BaseManagerTest {

	@Override
	protected BaseRepositoryManager getManager() {
		return new TMVManager(properties.getProperty("api_version"),
				properties.getProperty("vehicle_api_key"));
	}
}
