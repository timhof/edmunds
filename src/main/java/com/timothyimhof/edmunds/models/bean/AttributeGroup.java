/*
 * Edmunds API Client Library
 * @author Timothy Imhof
 * @email timothyimhof@gmail.com
 */
package com.timothyimhof.edmunds.models.bean;

import java.util.Map;

// TODO: Auto-generated Javadoc
/**
 * The Class AttributeGroup.
 */
public class AttributeGroup {

	/** The id. */
	private String id;
	
	/** The name. */
	private String name;
	
	/** The attributes. */
	private Map<String, Attribute> attributes;
	
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
	 * Gets the attributes.
	 *
	 * @return the attributes
	 */
	public Map<String, Attribute> getAttributes() {
		return attributes;
	}
	
	/**
	 * Sets the attributes.
	 *
	 * @param attributes the attributes
	 */
	public void setAttributes(Map<String, Attribute> attributes) {
		this.attributes = attributes;
	}
	
}
