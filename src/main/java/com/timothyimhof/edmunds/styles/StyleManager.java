/*
 * Edmunds API Client Library
 * @author Timothy Imhof
 * @email timothyimhof@gmail.com
 */
package com.timothyimhof.edmunds.styles;

import java.util.HashMap;
import java.util.Map;

import com.timothyimhof.edmunds.BaseRepositoryManager;
import com.timothyimhof.edmunds.styles.bean.StyleResult;

// TODO: Auto-generated Javadoc
/**
 * The Class StyleManager.
 */
public class StyleManager extends BaseRepositoryManager{

	/**
	 * Instantiates a new style manager.
	 *
	 * @param apiVersion the api version
	 * @param apiKey the api key
	 */
	public StyleManager(String apiVersion, String apiKey){
		super(apiVersion, apiKey);
	}

/**
 * Find by id.
 *
 * @param id the id
 * @return the style result
 */
public StyleResult findById(String id){
	
	Map<String, String> args = new HashMap<String, String>();
	args.put("id", id);
	StyleResult result = (StyleResult)getJSON("findbyid", 
			StyleResult.class, args);
	return result;
}

/**
 * Find styles by make model year.
 *
 * @param make the make
 * @param model the model
 * @param year the year
 * @return the style result
 */
public StyleResult findStylesByMakeModelYear(String make, String model, String year){
	
	Map<String, String> args = new HashMap<String, String>();
	args.put("make", make);
	args.put("model", model);
	args.put("year", year);
	StyleResult result = (StyleResult)getJSON("findstylesbymakemodelyear", 
			StyleResult.class, args);
	return result;
}

/**
 * Find styles by model year id.
 *
 * @param modelyearid the modelyearid
 * @return the style result
 */
public StyleResult findStylesByModelYearId(String modelyearid){
	
	Map<String, String> args = new HashMap<String, String>();
	args.put("modelyearid", modelyearid);
	StyleResult result = (StyleResult)getJSON("findstylesbymodelyearid", 
			StyleResult.class, args);
	return result;
}
	
	/* (non-Javadoc)
	 * @see com.timothyimhof.edmunds.BaseRepositoryManager#getRequestRepository()
	 */
	@Override
	protected String getRequestRepository() {
		return "vehicle/stylerepository";
	}
	
}
