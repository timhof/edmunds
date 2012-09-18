/*
 * Edmunds API Client Library
 * @author Timothy Imhof
 * @email timothyimhof@gmail.com
 */
package com.timothyimhof.edmunds.models.bean;

import java.util.List;

import com.timothyimhof.edmunds.ResourceReference;

// TODO: Auto-generated Javadoc
/**
 * The Class SubModel.
 */
public class SubModel {

	/** The id. */
	private String id;
	
	/** The identifier. */
	private String identifier;
	
	/** The name. */
	private String name;
	
	/** The rule type. */
	private String ruleType;
	
	/** The style ids. */
	private List<String> styleIds;
	
	/** The publication states. */
	private List<String> publicationStates;
	
	/** The submodel new default style. */
	private ResourceReference submodelNewDefaultStyle;
	
	/** The submodel used default style. */
	private ResourceReference submodelUsedDefaultStyle;
	
	/**
	 * Gets the identifier.
	 *
	 * @return the identifier
	 */
	public String getIdentifier() {
		return identifier;
	}
	
	/**
	 * Sets the identifier.
	 *
	 * @param identifier the new identifier
	 */
	public void setIdentifier(String identifier) {
		this.identifier = identifier;
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
	 * Gets the rule type.
	 *
	 * @return the rule type
	 */
	public String getRuleType() {
		return ruleType;
	}
	
	/**
	 * Sets the rule type.
	 *
	 * @param ruleType the new rule type
	 */
	public void setRuleType(String ruleType) {
		this.ruleType = ruleType;
	}
	
	/**
	 * Gets the style ids.
	 *
	 * @return the style ids
	 */
	public List<String> getStyleIds() {
		return styleIds;
	}
	
	/**
	 * Sets the style ids.
	 *
	 * @param styleIds the new style ids
	 */
	public void setStyleIds(List<String> styleIds) {
		this.styleIds = styleIds;
	}
	
	/**
	 * Gets the publication states.
	 *
	 * @return the publication states
	 */
	public List<String> getPublicationStates() {
		return publicationStates;
	}
	
	/**
	 * Sets the publication states.
	 *
	 * @param publicationStates the new publication states
	 */
	public void setPublicationStates(List<String> publicationStates) {
		this.publicationStates = publicationStates;
	}
	
	/**
	 * Gets the submodel used default style.
	 *
	 * @return the submodel used default style
	 */
	public ResourceReference getSubmodelUsedDefaultStyle() {
		return submodelUsedDefaultStyle;
	}
	
	/**
	 * Sets the submodel used default style.
	 *
	 * @param submodelUsedDefaultStyle the new submodel used default style
	 */
	public void setSubmodelUsedDefaultStyle(ResourceReference submodelUsedDefaultStyle) {
		this.submodelUsedDefaultStyle = submodelUsedDefaultStyle;
	}
	
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
	 * Gets the submodel new default style.
	 *
	 * @return the submodel new default style
	 */
	public ResourceReference getSubmodelNewDefaultStyle() {
		return submodelNewDefaultStyle;
	}
	
	/**
	 * Sets the submodel new default style.
	 *
	 * @param submodelNewDefaultStyle the new submodel new default style
	 */
	public void setSubmodelNewDefaultStyle(ResourceReference submodelNewDefaultStyle) {
		this.submodelNewDefaultStyle = submodelNewDefaultStyle;
	}
}
