/*
 * Edmunds API Client Library
 * @author Timothy Imhof
 * @email timothyimhof@gmail.com
 */
package com.timothyimhof.edmunds.models.bean;

import java.util.List;

// TODO: Auto-generated Javadoc
/**
 * The Class ModelsResult.
 */
public class ModelsResult {
	
	/** The model holder. */
	private List<Model> modelHolder;

	/**
	 * Gets the make holder.
	 *
	 * @return the make holder
	 */
	public List<Model> getMakeHolder() {
		return modelHolder;
	}

	/**
	 * Sets the make holder.
	 *
	 * @param modelHolder the new make holder
	 */
	public void setMakeHolder(List<Model> modelHolder) {
		this.modelHolder = modelHolder;
	}
}
