/*
 * Edmunds API Client Library
 * @author Timothy Imhof
 * @email timothyimhof@gmail.com
 */
package com.timothyimhof.edmunds.inventory;

import java.util.HashMap;
import java.util.Map;

import com.timothyimhof.edmunds.BaseRepositoryManager;
import com.timothyimhof.edmunds.inventory.bean.InventoryResult;

/**
 * The Class InventoryManager.
 */
public class InventoryManager extends BaseRepositoryManager {

	/**
	 * Instantiates a new inventory manager.
	 *
	 * @param apiVersion the api version
	 * @param apiKey the api key
	 */
	public InventoryManager(String apiVersion, String apiKey) {
		super(apiVersion, apiKey);
	}

	/**
	 * Gets the inventory by vin.
	 *
	 * @param vin the vin
	 * @return the inventory by vin
	 */
	public InventoryResult getInventoryByVIN(String vin){
		
		Map<String, String> args = new HashMap<String, String>();
		args.put("vin", vin);

		InventoryResult result = (InventoryResult)getJSON("getinventorybyvin", 
				InventoryResult.class, args);
		
		return result;
	}
	
	/* (non-Javadoc)
	 * @see com.timothyimhof.edmunds.BaseRepositoryManager#getRequestRepository()
	 */
	@Override
	protected String getRequestRepository() {
		return "inventory";
	}

}
