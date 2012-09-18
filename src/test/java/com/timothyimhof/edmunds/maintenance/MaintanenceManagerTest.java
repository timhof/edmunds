/*
 * Edmunds API Client Library
 * @author Timothy Imhof
 * @email timothyimhof@gmail.com
 */
package com.timothyimhof.edmunds.maintenance;

import com.timothyimhof.edmunds.BaseManagerTest;
import com.timothyimhof.edmunds.BaseRepositoryManager;
import com.timothyimhof.edmunds.maintenance.MaintenanceManager;

public class MaintanenceManagerTest extends BaseManagerTest {

	@Override
	protected BaseRepositoryManager getManager() {
		return new MaintenanceManager(properties.getProperty("api_version"),
				properties.getProperty("inventory_api_key"));
	}
}
