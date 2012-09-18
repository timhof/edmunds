/*
 * Edmunds API Client Library
 * @author Timothy Imhof
 * @email timothyimhof@gmail.com
 */
package com.timothyimhof.edmunds.model_years;

import java.util.HashMap;
import java.util.Map;

import com.timothyimhof.edmunds.BaseRepositoryManager;
import com.timothyimhof.edmunds.model_years.bean.ModelYearResult;

/**
 * The Class ModelYearManager.
 */
public class ModelYearManager extends BaseRepositoryManager{

	/**
	 * Instantiates a new model year manager.
	 *
	 * @param apiVersion the api version
	 * @param apiKey the api key
	 */
	public ModelYearManager(String apiVersion, String apiKey){
		super(apiVersion, apiKey);
	}
	
	/**
	 * Find by id.
	 *
	 * @param id the id
	 * @return the model year result
	 */
	public ModelYearResult findById(String id){
		
		Map<String, String> args = new HashMap<String, String>();
		args.put("id", id);
		ModelYearResult result = (ModelYearResult)getJSON("findbyid", 
				ModelYearResult.class, args);
		return result;
	}

/**
 * Find distinct year with new.
 *
 * @return the model year result
 */
public ModelYearResult findDistinctYearWithNew(){
		
		ModelYearResult result = (ModelYearResult)getJSON("finddistinctyearwithnew", 
				ModelYearResult.class);
		return result;
	}

/**
 * Find distinct year with new or used.
 *
 * @return the model year result
 */
public ModelYearResult findDistinctYearWithNewOrUsed(){
	
	ModelYearResult result = (ModelYearResult)getJSON("finddistinctyearwithneworused", 
			ModelYearResult.class);
	return result;
}

/**
 * Find distinct year with used.
 *
 * @param year the year
 * @return the model year result
 */
public ModelYearResult findDistinctYearWithUsed(String year){
	
	ModelYearResult result = (ModelYearResult)getJSON("finddistinctyearwithused", 
			ModelYearResult.class);
	return result;
}

/**
 * Find future model years by model id.
 *
 * @param modelId the model id
 * @return the model year result
 */
public ModelYearResult findFutureModelYearsByModelId(String modelId){
	
	Map<String, String> args = new HashMap<String, String>();
	args.put("modelId", modelId);
	ModelYearResult result = (ModelYearResult)getJSON("findfuturemodelyearsbymodelid", 
			ModelYearResult.class, args);
	return result;
}

/**
 * Find model years by make and year.
 *
 * @param make the make
 * @param year the year
 * @return the model year result
 */
public ModelYearResult findModelYearsByMakeAndYear(String make, String year){
	
	Map<String, String> args = new HashMap<String, String>();
	args.put("make", make);
	args.put("year", year);
	ModelYearResult result = (ModelYearResult)getJSON("findmodelyearsbymakeandyear", 
			ModelYearResult.class, args);
	return result;
}

/**
 * Find model years by make model.
 * 
 * See <a href="http://developer.edmunds.com/docs/read/the_vehicle_api/Year_Repository#findmodelyearsbymakemodel">http://developer.edmunds.com/docs/read/the_vehicle_api/Year_Repository#findmodelyearsbymakemodel</a>
 * 
 * @param makeNiceName The make name (use niceName value)
 * @param modelNiceName The model name (use niceName value)
 * @return the model year result
 */
public ModelYearResult findModelYearsByMakeModel(String makeNiceName, String modelNiceName){
	
	Map<String, String> args = new HashMap<String, String>();
	args.put("make", makeNiceName);
	args.put("model", modelNiceName);
	ModelYearResult result = (ModelYearResult)getJSON("findmodelyearsbymakemodel", 
			ModelYearResult.class, args);
	return result;
}

/**
 * Find new and used model years by make id and year.
 *
 * @param makeid the makeid
 * @param year the year
 * @return the model year result
 */
public ModelYearResult findNewAndUsedModelYearsByMakeIdAndYear(String makeid, String year){
	
	Map<String, String> args = new HashMap<String, String>();
	args.put("makeid", makeid);
	args.put("year", year);
	ModelYearResult result = (ModelYearResult)getJSON("findnewandusedmodelyearsbymakeidandyear", 
			ModelYearResult.class, args);
	return result;
}

/**
 * Find new model years by model id.
 *
 * @param modelId the model id
 * @return the model year result
 */
public ModelYearResult findNewModelYearsByModelId(String modelId){
	
	Map<String, String> args = new HashMap<String, String>();
	args.put("modelId", modelId);
	ModelYearResult result = (ModelYearResult)getJSON("findnewmodelyearsbymodelid", 
			ModelYearResult.class, args);
	return result;
}

/**
 * Find used model years by model id.
 *
 * @param modelId the model id
 * @return the model year result
 */
public ModelYearResult findUsedModelYearsByModelId(String modelId){
	
	Map<String, String> args = new HashMap<String, String>();
	args.put("modelId", modelId);
	ModelYearResult result = (ModelYearResult)getJSON("findusedmodelyearsbymodelid", 
			ModelYearResult.class, args);
	return result;
}

/**
 * Find years by category and publication state.
 *
 * @param category the category
 * @param state the state
 * @return the model year result
 */
public ModelYearResult findYearsByCategoryAndPublicationState(String category, String state){
	
	Map<String, String> args = new HashMap<String, String>();
	args.put("category", category);
	args.put("state", state);
	ModelYearResult result = (ModelYearResult)getJSON("findyearsbycategoryandpublicationstate", 
			ModelYearResult.class, args);
	return result;
}

/**
 * For model id.
 *
 * @param modelId the model id
 * @return the model year result
 */
public ModelYearResult forModelId(String modelId){
	
	Map<String, String> args = new HashMap<String, String>();
	args.put("modelid", modelId);
	ModelYearResult result = (ModelYearResult)getJSON("formodelid", 
			ModelYearResult.class, args);
	return result;
}

/**
 * For year make model.
 *
 * @param make the make
 * @param model the model
 * @param year the year
 * @return the model year result
 */
public ModelYearResult forYearMakeModel(String make, String model, String year){
	
	Map<String, String> args = new HashMap<String, String>();
	args.put("make", make);
	args.put("model", model);
	args.put("year", year);
	ModelYearResult result = (ModelYearResult)getJSON("foryearmakemodel", 
			ModelYearResult.class, args);
	return result;
}

	/* (non-Javadoc)
	 * @see com.timothyimhof.edmunds.BaseRepositoryManager#getRequestRepository()
	 */
	@Override
	protected String getRequestRepository() {
		return "vehicle/modelyearrepository";
	}

	
}
