/*
 * Edmunds API Client Library
 * @author Timothy Imhof
 * @email timothyimhof@gmail.com
 */
package com.timothyimhof.edmunds.inventory;

import java.util.List;

import org.junit.Test;

import com.timothyimhof.edmunds.BaseManagerTest;
import com.timothyimhof.edmunds.BaseRepositoryManager;
import com.timothyimhof.edmunds.inventory.InventoryManager;
import com.timothyimhof.edmunds.inventory.bean.Inventory;
import com.timothyimhof.edmunds.inventory.bean.InventoryResult;

public class InventoryManagerTest extends BaseManagerTest {

	private String vin = "4T4BF1FK7CR202211";

	@Test
	public void testDecodeVIN() {

		InventoryManager inventoryManager = (InventoryManager) getManager();
		InventoryResult result = inventoryManager.getInventoryByVIN(vin);

		List<Inventory> inventoryList = result.getResultsList();
		for (Inventory inventory : inventoryList) {
			System.out.format("%s\t%s\n", inventory.getDealerId(),
					inventory.getDealerName());
		}

	}

	@Override
	protected BaseRepositoryManager getManager() {
		return new InventoryManager(properties.getProperty("api_version"),
				properties.getProperty("inventory_api_key"));
	}
}
