/*
 * Edmunds API Client Library
 * @author Timothy Imhof
 * @email timothyimhof@gmail.com
 */
package com.timothyimhof.edmunds.tco.bean;

import java.util.List;
import java.util.Map;

// TODO: Auto-generated Javadoc
/**
 * The Class Model.
 */
public class Model {
	
	/** The id. */
	private String id;
	
	/** The name. */
	private String name;
	
	/** The link. */
	private String link;
	
	/** The sub model. */
	private String subModel;
	
	/** The nice sub model. */
	private String niceSubModel;
	
	/** The model. */
	private String model;
	
	/** The nice model. */
	private String niceModel;
	
	/** The years. */
	private Map<String, List<String>> years;
	
	/**
	 * Gets the id.
	 *
	 * @return the id
	 */
	public String getId() {
		return id;
	}
	
	/**
	 * Sets the id.
	 *
	 * @param id the new id
	 */
	public void setId(String id) {
		this.id = id;
	}
	
	/**
	 * Gets the name.
	 *
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	
	/**
	 * Sets the name.
	 *
	 * @param name the new name
	 */
	public void setName(String name) {
		this.name = name;
	}
	
	/**
	 * Gets the link.
	 *
	 * @return the link
	 */
	public String getLink() {
		return link;
	}
	
	/**
	 * Sets the link.
	 *
	 * @param link the new link
	 */
	public void setLink(String link) {
		this.link = link;
	}
	
	/**
	 * Gets the sub model.
	 *
	 * @return the sub model
	 */
	public String getSubModel() {
		return subModel;
	}
	
	/**
	 * Sets the sub model.
	 *
	 * @param subModel the new sub model
	 */
	public void setSubModel(String subModel) {
		this.subModel = subModel;
	}
	
	/**
	 * Gets the nice sub model.
	 *
	 * @return the nice sub model
	 */
	public String getNiceSubModel() {
		return niceSubModel;
	}
	
	/**
	 * Sets the nice sub model.
	 *
	 * @param niceSubModel the new nice sub model
	 */
	public void setNiceSubModel(String niceSubModel) {
		this.niceSubModel = niceSubModel;
	}
	
	/**
	 * Gets the model.
	 *
	 * @return the model
	 */
	public String getModel() {
		return model;
	}
	
	/**
	 * Sets the model.
	 *
	 * @param model the new model
	 */
	public void setModel(String model) {
		this.model = model;
	}
	
	/**
	 * Gets the nice model.
	 *
	 * @return the nice model
	 */
	public String getNiceModel() {
		return niceModel;
	}
	
	/**
	 * Sets the nice model.
	 *
	 * @param niceModel the new nice model
	 */
	public void setNiceModel(String niceModel) {
		this.niceModel = niceModel;
	}
	
	/**
	 * Gets the years.
	 *
	 * @return the years
	 */
	public Map<String, List<String>> getYears() {
		return years;
	}
	
	/**
	 * Sets the years.
	 *
	 * @param years the years
	 */
	public void setYears(Map<String, List<String>> years) {
		this.years = years;
	}
	
}
