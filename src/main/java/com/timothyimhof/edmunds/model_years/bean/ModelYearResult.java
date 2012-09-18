/*
 * Edmunds API Client Library
 * @author Timothy Imhof
 * @email timothyimhof@gmail.com
 */
package com.timothyimhof.edmunds.model_years.bean;

import java.util.List;

// TODO: Auto-generated Javadoc
/**
 * The Class ModelYearResult.
 */
public class ModelYearResult {

	/** The model year holder. */
	private List<ModelYear> modelYearHolder;

	/**
	 * Gets the model year holder.
	 *
	 * @return the model year holder
	 */
	public List<ModelYear> getModelYearHolder() {
		return modelYearHolder;
	}

	/**
	 * Sets the make holder.
	 *
	 * @param modelYearHolder the new make holder
	 */
	public void setMakeHolder(List<ModelYear> modelYearHolder) {
		this.modelYearHolder = modelYearHolder;
	}

}
