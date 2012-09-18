/*
 * Edmunds API Client Library
 * @author Timothy Imhof
 * @email timothyimhof@gmail.com
 */
package com.timothyimhof.edmunds.styles.bean;

import java.util.List;
import java.util.Map;

import com.timothyimhof.edmunds.ResourceReference;
import com.timothyimhof.edmunds.model_years.bean.SubModel;
import com.timothyimhof.edmunds.models.bean.AttributeGroup;

// TODO: Auto-generated Javadoc
/**
 * The Class Style.
 */
public class Style {

	/** The id. */
	private String id;
	
	/** The name. */
	private String name;
	
	/** The nice name. */
	private String niceName;
	
	/** The publication state. */
	private String publicationState;
	
	/** The make id. */
	private String makeId;
	
	/** The year. */
	private String year;
	
	/** The make name. */
	private String makeName;
	
	/** The makel nice name. */
	private String makelNiceName;
	
	/** The model id. */
	private String modelId;
	
	/** The model name. */
	private String modelName;
	
	/** The model nice name. */
	private String modelNiceName;
	
	/** The model year id. */
	private String modelYearId;
	
	/** The transmission type. */
	private String transmissionType;
	
	/** The engine compressor type. */
	private String engineCompressorType;
	
	/** The engine fuel type. */
	private String engineFuelType;
	
	/** The engine cylinder. */
	private String engineCylinder;
	
	/** The engine size. */
	private String engineSize;
    
    /** The price. */
    private Price price;
    
    /** The trim. */
    private Trim trim;
    
    /** The standard equipment. */
    private List<ResourceReference> standardEquipment;
    
    /** The optional equipment. */
    private List<ResourceReference> optionalEquipment;
    
    /** The used equipment. */
    private List<ResourceReference> usedEquipment;
   	
	   /** The categories. */
	   private Map<String, List<String>> categories;
   	
	   /** The model year. */
	   private ResourceReference modelYear;
    
    /** The attribute groups. */
    private Map<String, AttributeGroup> attributeGroups;
    
    /** The squish vins. */
    private List<SquishVin> squishVins;
   	
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
	 * Gets the publication state.
	 *
	 * @return the publication state
	 */
	public String getPublicationState() {
		return publicationState;
	}
	
	/**
	 * Sets the publication state.
	 *
	 * @param publicationState the new publication state
	 */
	public void setPublicationState(String publicationState) {
		this.publicationState = publicationState;
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
	 * Gets the makel nice name.
	 *
	 * @return the makel nice name
	 */
	public String getMakelNiceName() {
		return makelNiceName;
	}
	
	/**
	 * Sets the makel nice name.
	 *
	 * @param makelNiceName the new makel nice name
	 */
	public void setMakelNiceName(String makelNiceName) {
		this.makelNiceName = makelNiceName;
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
	 * Gets the model year id.
	 *
	 * @return the model year id
	 */
	public String getModelYearId() {
		return modelYearId;
	}
	
	/**
	 * Sets the model year id.
	 *
	 * @param modelYearId the new model year id
	 */
	public void setModelYearId(String modelYearId) {
		this.modelYearId = modelYearId;
	}
	
	/**
	 * Gets the transmission type.
	 *
	 * @return the transmission type
	 */
	public String getTransmissionType() {
		return transmissionType;
	}
	
	/**
	 * Sets the transmission type.
	 *
	 * @param transmissionType the new transmission type
	 */
	public void setTransmissionType(String transmissionType) {
		this.transmissionType = transmissionType;
	}
	
	/**
	 * Gets the engine compressor type.
	 *
	 * @return the engine compressor type
	 */
	public String getEngineCompressorType() {
		return engineCompressorType;
	}
	
	/**
	 * Sets the engine compressor type.
	 *
	 * @param engineCompressorType the new engine compressor type
	 */
	public void setEngineCompressorType(String engineCompressorType) {
		this.engineCompressorType = engineCompressorType;
	}
	
	/**
	 * Gets the engine fuel type.
	 *
	 * @return the engine fuel type
	 */
	public String getEngineFuelType() {
		return engineFuelType;
	}
	
	/**
	 * Sets the engine fuel type.
	 *
	 * @param engineFuelType the new engine fuel type
	 */
	public void setEngineFuelType(String engineFuelType) {
		this.engineFuelType = engineFuelType;
	}
	
	/**
	 * Gets the engine cylinder.
	 *
	 * @return the engine cylinder
	 */
	public String getEngineCylinder() {
		return engineCylinder;
	}
	
	/**
	 * Sets the engine cylinder.
	 *
	 * @param engineCylinder the new engine cylinder
	 */
	public void setEngineCylinder(String engineCylinder) {
		this.engineCylinder = engineCylinder;
	}
	
	/**
	 * Gets the engine size.
	 *
	 * @return the engine size
	 */
	public String getEngineSize() {
		return engineSize;
	}
	
	/**
	 * Sets the engine size.
	 *
	 * @param engineSize the new engine size
	 */
	public void setEngineSize(String engineSize) {
		this.engineSize = engineSize;
	}
	
	/**
	 * Gets the price.
	 *
	 * @return the price
	 */
	public Price getPrice() {
		return price;
	}
	
	/**
	 * Sets the price.
	 *
	 * @param price the new price
	 */
	public void setPrice(Price price) {
		this.price = price;
	}
	
	/**
	 * Gets the trim.
	 *
	 * @return the trim
	 */
	public Trim getTrim() {
		return trim;
	}
	
	/**
	 * Sets the trim.
	 *
	 * @param trim the new trim
	 */
	public void setTrim(Trim trim) {
		this.trim = trim;
	}
	
	/**
	 * Gets the standard equipment.
	 *
	 * @return the standard equipment
	 */
	public List<ResourceReference> getStandardEquipment() {
		return standardEquipment;
	}
	
	/**
	 * Sets the standard equipment.
	 *
	 * @param standardEquipment the new standard equipment
	 */
	public void setStandardEquipment(List<ResourceReference> standardEquipment) {
		this.standardEquipment = standardEquipment;
	}
	
	/**
	 * Gets the optional equipment.
	 *
	 * @return the optional equipment
	 */
	public List<ResourceReference> getOptionalEquipment() {
		return optionalEquipment;
	}
	
	/**
	 * Sets the optional equipment.
	 *
	 * @param optionalEquipment the new optional equipment
	 */
	public void setOptionalEquipment(List<ResourceReference> optionalEquipment) {
		this.optionalEquipment = optionalEquipment;
	}
	
	/**
	 * Gets the used equipment.
	 *
	 * @return the used equipment
	 */
	public List<ResourceReference> getUsedEquipment() {
		return usedEquipment;
	}
	
	/**
	 * Sets the used equipment.
	 *
	 * @param usedEquipment the new used equipment
	 */
	public void setUsedEquipment(List<ResourceReference> usedEquipment) {
		this.usedEquipment = usedEquipment;
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
	 * Gets the model year.
	 *
	 * @return the model year
	 */
	public ResourceReference getModelYear() {
		return modelYear;
	}
	
	/**
	 * Sets the model year.
	 *
	 * @param modelYear the new model year
	 */
	public void setModelYear(ResourceReference modelYear) {
		this.modelYear = modelYear;
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
	 * Gets the squish vins.
	 *
	 * @return the squish vins
	 */
	public List<SquishVin> getSquishVins() {
		return squishVins;
	}
	
	/**
	 * Sets the squish vins.
	 *
	 * @param squishVins the new squish vins
	 */
	public void setSquishVins(List<SquishVin> squishVins) {
		this.squishVins = squishVins;
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
}
