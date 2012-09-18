/*
 * Edmunds API Client Library
 * @author Timothy Imhof
 * @email timothyimhof@gmail.com
 */
package com.timothyimhof.edmunds.tco.bean;

import java.util.Map;

// TODO: Auto-generated Javadoc
/**
 * The Class TCOResult.
 */
public class TCOResult {
	
	/** The styles. */
	private Map<String, Style> styles;
	
	/** The makes. */
	private Map<String, Make> makes;
	
	/** The models. */
	private Map<String, Model> models;
	
	/** The value. */
	private String value;
	
	/** The values. */
	private String[] values;
	
	/** The total. */
	private String total;

	/**
	 * Gets the styles.
	 *
	 * @return the styles
	 */
	public Map<String, Style> getStyles() {
		return styles;
	}

	/**
	 * Sets the styles.
	 *
	 * @param styleHolder the style holder
	 */
	public void setStyles(Map<String, Style> styleHolder) {
		this.styles = styleHolder;
	}

	/**
	 * Gets the makes.
	 *
	 * @return the makes
	 */
	public Map<String, Make> getMakes() {
		return makes;
	}

	/**
	 * Sets the makes.
	 *
	 * @param makes the makes
	 */
	public void setMakes(Map<String, Make> makes) {
		this.makes = makes;
	}

	/**
	 * Gets the models.
	 *
	 * @return the models
	 */
	public Map<String, Model> getModels() {
		return models;
	}

	/**
	 * Sets the models.
	 *
	 * @param models the models
	 */
	public void setModels(Map<String, Model> models) {
		this.models = models;
	}

	/**
	 * Gets the value.
	 *
	 * @return the value
	 */
	public String getValue() {
		return value;
	}

	/**
	 * Sets the value.
	 *
	 * @param value the new value
	 */
	public void setValue(String value) {
		this.value = value;
	}

	/**
	 * Gets the values.
	 *
	 * @return the values
	 */
	public String[] getValues() {
		return values;
	}

	/**
	 * Sets the values.
	 *
	 * @param values the new values
	 */
	public void setValues(String[] values) {
		this.values = values;
	}

	/**
	 * Gets the total.
	 *
	 * @return the total
	 */
	public String getTotal() {
		return total;
	}

	/**
	 * Sets the total.
	 *
	 * @param total the new total
	 */
	public void setTotal(String total) {
		this.total = total;
	}
}
