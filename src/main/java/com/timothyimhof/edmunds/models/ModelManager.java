/*
 * Edmunds API Client Library
 * @author Timothy Imhof
 * @email timothyimhof@gmail.com
 */
package com.timothyimhof.edmunds.models;

import java.util.HashMap;
import java.util.Map;

import com.timothyimhof.edmunds.BaseRepositoryManager;
import com.timothyimhof.edmunds.models.bean.ModelsResult;

/**
 * The Class ModelManager.
 */
public class ModelManager extends BaseRepositoryManager{

	/**
	 * Instantiates a new model manager.
	 *
	 * @param apiVersion the api version
	 * @param apiKey the api key
	 */
	public ModelManager(String apiVersion, String apiKey){
		super(apiVersion, apiKey);
	}

	/**
	 * Find by id.
	 *
	 * @param id the id
	 * @return the models result
	 */
	public ModelsResult findById(String id){
		
		Map<String, String> args = new HashMap<String, String>();
		args.put("id", id);
		ModelsResult result = (ModelsResult)getJSON("findbyid", 
				ModelsResult.class, args);
		return result;
	}

/**
 * Find by make id.
 *
 * @param makeId the make id
 * @return the models result
 */
public ModelsResult findByMakeId(String makeId){
		
		Map<String, String> args = new HashMap<String, String>();
		args.put("makeid", makeId);
		ModelsResult result = (ModelsResult)getJSON("findbymakeid", 
				ModelsResult.class, args);
		return result;
	}

/**
 * Find future models by make id.
 *
 * @param makeId the make id
 * @return the models result
 */
public ModelsResult findFutureModelsByMakeId(String makeId){
	
	Map<String, String> args = new HashMap<String, String>();
	args.put("makeid", makeId);
	ModelsResult result = (ModelsResult)getJSON("findfuturemodelsbymakeid", 
			ModelsResult.class, args);
	return result;
}

/**
 * Find model by make model name.
 *
 * @param make the make
 * @param model the model
 * @return the models result
 */
public ModelsResult findModelByMakeModelName(String make, String model){
	
	Map<String, String> args = new HashMap<String, String>();
	args.put("make", make);
	args.put("model", model);
	ModelsResult result = (ModelsResult)getJSON("findmodelbymakemodelname", 
			ModelsResult.class, args);
	return result;
}

/**
 * Find models by make.
 *
 * @param make the make
 * @return the models result
 */
public ModelsResult findModelsByMake(String make){
	
	Map<String, String> args = new HashMap<String, String>();
	args.put("make", make);
	ModelsResult result = (ModelsResult)getJSON("findmodelsbymake", 
			ModelsResult.class, args);
	return result;
}

/**
 * Find models by make and publication state.
 *
 * @param make the make
 * @param state the state
 * @return the models result
 */
public ModelsResult findModelsByMakeAndPublicationState(String make, String state){
	
	Map<String, String> args = new HashMap<String, String>();
	args.put("make", make);
	args.put("state", state);
	ModelsResult result = (ModelsResult)getJSON("findmodelsbymakeandpublicationstate", 
			ModelsResult.class, args);
	return result;
}

/**
 * Find models by make and year.
 *
 * @param make the make
 * @param year the year
 * @return the models result
 */
public ModelsResult findModelsByMakeAndYear(String make, String year){
	
	Map<String, String> args = new HashMap<String, String>();
	args.put("make", make);
	args.put("year", year);
	ModelsResult result = (ModelsResult)getJSON("findmodelsbymakeandyear", 
			ModelsResult.class, args);
	return result;
}

/**
 * Find new and used models by make id.
 *
 * @param makeId the make id
 * @return the models result
 */
public ModelsResult findNewAndUsedModelsByMakeId(String makeId){
	
	Map<String, String> args = new HashMap<String, String>();
	args.put("makeid", makeId);
	ModelsResult result = (ModelsResult)getJSON("findnewandusedmodelsbymakeid", 
			ModelsResult.class, args);
	return result;
}

/**
 * Find new models by make id.
 *
 * @param makeId the make id
 * @return the models result
 */
public ModelsResult findNewModelsByMakeId(String makeId){
	
	Map<String, String> args = new HashMap<String, String>();
	args.put("makeId", makeId);
	ModelsResult result = (ModelsResult)getJSON("findnewmodelsbymakeid", 
			ModelsResult.class, args);
	return result;
}

/**
 * Find used models by make id.
 *
 * @param makeId the make id
 * @return the models result
 */
public ModelsResult findUsedModelsByMakeId(String makeId){
	
	Map<String, String> args = new HashMap<String, String>();
	args.put("makeId", makeId);
	ModelsResult result = (ModelsResult)getJSON("findusedmodelsbymakeid", 
			ModelsResult.class, args);
	return result;
}

	/* (non-Javadoc)
	 * @see com.timothyimhof.edmunds.BaseRepositoryManager#getRequestRepository()
	 */
	@Override
	protected String getRequestRepository() {
		return "vehicle/modelrepository";
	}

}
