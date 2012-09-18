/*
 * Edmunds API Client Library
 * @author Timothy Imhof
 * @email timothyimhof@gmail.com
 */
package com.timothyimhof.edmunds.inventory.bean;

import java.util.List;

// TODO: Auto-generated Javadoc
/**
 * The Class InventoryResult.
 */
public class InventoryResult {

	/** The results list. */
	private List<Inventory> resultsList;

	/**
	 * Gets the results list.
	 *
	 * @return the results list
	 */
	public List<Inventory> getResultsList() {
		return resultsList;
	}

	/**
	 * Sets the results list.
	 *
	 * @param resultsList the new results list
	 */
	public void setResultsList(List<Inventory> resultsList) {
		this.resultsList = resultsList;
	}
}
