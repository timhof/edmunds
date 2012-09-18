/*
 * Edmunds API Client Library
 * @author Timothy Imhof
 * @email timothyimhof@gmail.com
 */
package com.timothyimhof.edmunds.models.bean;

import java.util.List;
import java.util.Map;

import com.timothyimhof.edmunds.ResourceReference;

// TODO: Auto-generated Javadoc
/**
 * The Class Model.
 */
public class Model {
	
	/** The make id. */
	private String makeId;
	
	/** The make name. */
	private String makeName;
	
	/** The make nice name. */
	private String makeNiceName;
	
	/** The id. */
	private String id;
	
	/** The name. */
	private String name;
	
	/** The nice name. */
	private String niceName;
	
	/** The make. */
	private ResourceReference make;
	
	/** The model years. */
	private List<ModelYear> modelYears;
	
	/** The attribute groups. */
	private Map<String, AttributeGroup> attributeGroups;
	
	/** The categories. */
	private Map<String, List<String>> categories;
	
	/** The publication states. */
	private List<String> publicationStates;
//	private Map<String, SubModel> subModels;

	/**
 * Gets the make id.
 *
 * @return the make id
 */
public String getMakeId() {
		return makeId;
	}
	
	/**
	 * Sets the make id.
	 *
	 * @param makeId the new make id
	 */
	public void setMakeId(String makeId) {
		this.makeId = makeId;
	}
	
	/**
	 * Gets the make name.
	 *
	 * @return the make name
	 */
	public String getMakeName() {
		return makeName;
	}
	
	/**
	 * Sets the make name.
	 *
	 * @param makeName the new make name
	 */
	public void setMakeName(String makeName) {
		this.makeName = makeName;
	}
	
	/**
	 * Gets the make nice name.
	 *
	 * @return the make nice name
	 */
	public String getMakeNiceName() {
		return makeNiceName;
	}
	
	/**
	 * Sets the make nice name.
	 *
	 * @param makeNiceName the new make nice name
	 */
	public void setMakeNiceName(String makeNiceName) {
		this.makeNiceName = makeNiceName;
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
	 * Gets the make.
	 *
	 * @return the make
	 */
	public ResourceReference getMake() {
		return make;
	}
	
	/**
	 * Sets the make.
	 *
	 * @param make the new make
	 */
	public void setMake(ResourceReference make) {
		this.make = make;
	}
	
	/**
	 * Gets the model years.
	 *
	 * @return the model years
	 */
	public List<ModelYear> getModelYears() {
		return modelYears;
	}
	
	/**
	 * Sets the model years.
	 *
	 * @param modelYears the new model years
	 */
	public void setModelYears(List<ModelYear> modelYears) {
		this.modelYears = modelYears;
	}
	
	/**
	 * Gets the attribute groups.
	 *
	 * @return the attribute groups
	 */
	public Map<String, AttributeGroup> getAttributeGroups() {
		return attributeGroups;
	}
	
	/**
	 * Sets the attribute groups.
	 *
	 * @param attributeGroups the attribute groups
	 */
	public void setAttributeGroups(Map<String, AttributeGroup> attributeGroups) {
		this.attributeGroups = attributeGroups;
	}
	
	/**
	 * Gets the categories.
	 *
	 * @return the categories
	 */
	public Map<String, List<String>> getCategories() {
		return categories;
	}
	
	/**
	 * Sets the categories.
	 *
	 * @param categories the categories
	 */
	public void setCategories(Map<String, List<String>> categories) {
		this.categories = categories;
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
//	public Map<String, SubModel> getSubModels() {
//		return subModels;
//	}
//	public void setSubModels(Map<String, SubModel> subModels) {
//		this.subModels = subModels;
//	}
}
