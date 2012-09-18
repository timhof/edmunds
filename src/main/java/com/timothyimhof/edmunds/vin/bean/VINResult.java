/*
 * Edmunds API Client Library
 * @author Timothy Imhof
 * @email timothyimhof@gmail.com
 */
package com.timothyimhof.edmunds.vin.bean;

import java.util.List;

import com.timothyimhof.edmunds.styles.bean.Style;

// TODO: Auto-generated Javadoc
/**
 * The Class VINResult.
 */
public class VINResult {

	/** The style holder. */
	private List<Style> styleHolder;

	/**
	 * Gets the style holder.
	 *
	 * @return the style holder
	 */
	public List<Style> getStyleHolder() {
		return styleHolder;
	}

	/**
	 * Sets the style holder.
	 *
	 * @param styleHolder the new style holder
	 */
	public void setStyleHolder(List<Style> styleHolder) {
		this.styleHolder = styleHolder;
	}
}
