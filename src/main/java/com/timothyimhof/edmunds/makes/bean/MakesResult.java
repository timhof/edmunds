/*
 * Edmunds API Client Library
 * @author Timothy Imhof
 * @email timothyimhof@gmail.com
 */
package com.timothyimhof.edmunds.makes.bean;

import java.util.List;

// TODO: Auto-generated Javadoc
/**
 * The Class MakesResult.
 */
public class MakesResult {

	/** The make holder. */
	private List<Make> makeHolder;

	/**
	 * Gets the make holder.
	 *
	 * @return the make holder
	 */
	public List<Make> getMakeHolder() {
		return makeHolder;
	}

	/**
	 * Sets the make holder.
	 *
	 * @param makeHolder the new make holder
	 */
	public void setMakeHolder(List<Make> makeHolder) {
		this.makeHolder = makeHolder;
	}

}
