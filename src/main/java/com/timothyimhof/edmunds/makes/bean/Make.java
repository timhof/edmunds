/*
 * Edmunds API Client Library
 * @author Timothy Imhof
 * @email timothyimhof@gmail.com
 */
package com.timothyimhof.edmunds.makes.bean;

import java.util.List;

// TODO: Auto-generated Javadoc
/**
 * The Class Make.
 */
public class Make {

	/** The id. */
	private String id;
	
	/** The name. */
	private String name;
	
	/** The nice name. */
	private String niceName;
	
	/** The manufacturer. */
	private String manufacturer;
	
	/** The attribute groups. */
	private AttributeGroups attributeGroups;
	
	/** The models. */
	private List<Model> models;
	
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
	 * Gets the nice name.
	 *
	 * @return the nice name
	 */
	public String getNiceName() {
		return niceName;
	}
	
	/**
	 * Sets the nice name.
	 *
	 * @param niceName the new nice name
	 */
	public void setNiceName(String niceName) {
		this.niceName = niceName;
	}
	
	/**
	 * Gets the models.
	 *
	 * @return the models
	 */
	public List<Model> getModels() {
		return models;
	}
	
	/**
	 * Sets the models.
	 *
	 * @param models the new models
	 */
	public void setModels(List<Model> models) {
		this.models = models;
	}
	
	/**
	 * Gets the attribute groups.
	 *
	 * @return the attribute groups
	 */
	public AttributeGroups getAttributeGroups() {
		return attributeGroups;
	}
	
	/**
	 * Sets the attribute groups.
	 *
	 * @param attributeGroups the new attribute groups
	 */
	public void setAttributeGroups(AttributeGroups attributeGroups) {
		this.attributeGroups = attributeGroups;
	}
	
	/**
	 * Gets the manufacturer.
	 *
	 * @return the manufacturer
	 */
	public String getManufacturer() {
		return manufacturer;
	}
	
	/**
	 * Sets the manufacturer.
	 *
	 * @param manufacturer the new manufacturer
	 */
	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}
	
}
