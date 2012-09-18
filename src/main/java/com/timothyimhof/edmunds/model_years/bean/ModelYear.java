/*
 * Edmunds API Client Library
 * @author Timothy Imhof
 * @email timothyimhof@gmail.com
 */
package com.timothyimhof.edmunds.model_years.bean;

import java.util.List;
import java.util.Map;

import com.timothyimhof.edmunds.ResourceReference;
import com.timothyimhof.edmunds.models.bean.AttributeGroup;

/**
 * The Class ModelYear.
 */
public class ModelYear {

	/** The id. */
	private String id;
	
	/** The make id. */
	private String makeId;
	
	/** The make name. */
	private String makeName;
	
	/** The make nice name. */
	private String makeNiceName;
	
	/** The model id. */
	private String modelId;
	
	/** The model name. */
	private String modelName;
	
	/** The model nice name. */
	private String modelNiceName;
	
	/** The model link code. */
	private String modelLinkCode;
    
    /** The styles. */
    private List<Style> styles;
    
    /** The new default style. */
    private ResourceReference newDefaultStyle;
    
    /** The used default style. */
    private ResourceReference usedDefaultStyle;
    
    /** The equipment. */
    List<ResourceReference> equipment;
    
    /** The name. */
    private String name;
	
	/** The mid year. */
	private String midYear;
	
	/** The year. */
	private String year;
	
	/** The date available. */
	private String dateAvailable;
    
    /** The model. */
    private Model model;
    
    /** The attribute groups. */
    private Map<String, AttributeGroup> attributeGroups;
	
	/** The categories. */
	private Map<String, List<String>> categories;
	
	/** The publication states. */
	private List<String> publicationStates;
    
    /** The sub models. */
    private List<SubModel> subModels;
    
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
	 * Gets the model id.
	 *
	 * @return the model id
	 */
	public String getModelId() {
		return modelId;
	}
	
	/**
	 * Sets the model id.
	 *
	 * @param modelId the new model id
	 */
	public void setModelId(String modelId) {
		this.modelId = modelId;
	}
	
	/**
	 * Gets the model name.
	 *
	 * @return the model name
	 */
	public String getModelName() {
		return modelName;
	}
	
	/**
	 * Sets the model name.
	 *
	 * @param modelName the new model name
	 */
	public void setModelName(String modelName) {
		this.modelName = modelName;
	}
	
	/**
	 * Gets the model nice name.
	 *
	 * @return the model nice name
	 */
	public String getModelNiceName() {
		return modelNiceName;
	}
	
	/**
	 * Sets the model nice name.
	 *
	 * @param modelNiceName the new model nice name
	 */
	public void setModelNiceName(String modelNiceName) {
		this.modelNiceName = modelNiceName;
	}
	
	/**
	 * Gets the styles.
	 *
	 * @return the styles
	 */
	public List<Style> getStyles() {
		return styles;
	}
	
	/**
	 * Sets the styles.
	 *
	 * @param styles the new styles
	 */
	public void setStyles(List<Style> styles) {
		this.styles = styles;
	}
	
	/**
	 * Gets the used default style.
	 *
	 * @return the used default style
	 */
	public ResourceReference getUsedDefaultStyle() {
		return usedDefaultStyle;
	}
	
	/**
	 * Sets the used default style.
	 *
	 * @param usedDefaultStyle the new used default style
	 */
	public void setUsedDefaultStyle(ResourceReference usedDefaultStyle) {
		this.usedDefaultStyle = usedDefaultStyle;
	}
	
	/**
	 * Gets the equipment.
	 *
	 * @return the equipment
	 */
	public List<ResourceReference> getEquipment() {
		return equipment;
	}
	
	/**
	 * Sets the equipment.
	 *
	 * @param equipment the new equipment
	 */
	public void setEquipment(List<ResourceReference> equipment) {
		this.equipment = equipment;
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
	 * Gets the model.
	 *
	 * @return the model
	 */
	public Model getModel() {
		return model;
	}
	
	/**
	 * Sets the model.
	 *
	 * @param model the new model
	 */
	public void setModel(Model model) {
		this.model = model;
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
	
	/**
	 * Gets the sub models.
	 *
	 * @return the sub models
	 */
	public List<SubModel> getSubModels() {
		return subModels;
	}
	
	/**
	 * Sets the sub models.
	 *
	 * @param subModels the new sub models
	 */
	public void setSubModels(List<SubModel> subModels) {
		this.subModels = subModels;
	}

	/**
	 * Gets the model link code.
	 *
	 * @return the model link code
	 */
	public String getModelLinkCode() {
		return modelLinkCode;
	}

	/**
	 * Sets the model link code.
	 *
	 * @param modelLinkCode the new model link code
	 */
	public void setModelLinkCode(String modelLinkCode) {
		this.modelLinkCode = modelLinkCode;
	}

	/**
	 * Gets the new default style.
	 *
	 * @return the new default style
	 */
	public ResourceReference getNewDefaultStyle() {
		return newDefaultStyle;
	}

	/**
	 * Sets the new default style.
	 *
	 * @param newDefaultStyle the new new default style
	 */
	public void setNewDefaultStyle(ResourceReference newDefaultStyle) {
		this.newDefaultStyle = newDefaultStyle;
	}

	/**
	 * Gets the mid year.
	 *
	 * @return the mid year
	 */
	public String getMidYear() {
		return midYear;
	}

	/**
	 * Sets the mid year.
	 *
	 * @param midYear the new mid year
	 */
	public void setMidYear(String midYear) {
		this.midYear = midYear;
	}

	/**
	 * Gets the year.
	 *
	 * @return the year
	 */
	public String getYear() {
		return year;
	}

	/**
	 * Sets the year.
	 *
	 * @param year the new year
	 */
	public void setYear(String year) {
		this.year = year;
	}

	/**
	 * Gets the date available.
	 *
	 * @return the date available
	 */
	public String getDateAvailable() {
		return dateAvailable;
	}

	/**
	 * Sets the date available.
	 *
	 * @param dateAvailable the new date available
	 */
	public void setDateAvailable(String dateAvailable) {
		this.dateAvailable = dateAvailable;
	}
}
