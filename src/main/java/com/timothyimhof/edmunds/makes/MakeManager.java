/*
 * Edmunds API Client Library
 * @author Timothy Imhof
 * @email timothyimhof@gmail.com
 */
package com.timothyimhof.edmunds.makes;

import java.util.HashMap;
import java.util.Map;

import com.timothyimhof.edmunds.BaseRepositoryManager;
import com.timothyimhof.edmunds.makes.bean.MakesResult;

/**
 * The Class MakeManager.
 */
public class MakeManager extends BaseRepositoryManager{

	/**
	 * Instantiates a new make manager.
	 *
	 * @param apiVersion the api version
	 * @param apiKey the api key
	 */
	public MakeManager(String apiVersion, String apiKey){
		super(apiVersion, apiKey);
	}
	
	/**
	 * Find all.
	 *
	 * @return the makes result
	 */
	public MakesResult findAll(){
		
		MakesResult result = (MakesResult)getJSON("findall", 
				MakesResult.class);
		return result;
	}
	
	/**
	 * Find by id.
	 *
	 * @param id the id
	 * @return the makes result
	 */
	public MakesResult findById(String id){
		
		Map<String, String> args = new HashMap<String, String>();
		args.put("id", id);
		MakesResult result = (MakesResult)getJSON("findbyid", 
				MakesResult.class, args);
		return result;
	}

/**
 * Find future makes.
 *
 * @return the makes result
 */
public MakesResult findFutureMakes(){
		
		MakesResult result = (MakesResult)getJSON("findfuturemakes", 
				MakesResult.class);
		return result;
	}

/**
 * Find make by name.
 *
 * @param name the name
 * @return the makes result
 */
public MakesResult findMakeByName(String name){
	
	Map<String, String> args = new HashMap<String, String>();
	args.put("name", name);
	MakesResult result = (MakesResult)getJSON("findmakebyname", 
			MakesResult.class, args);
	return result;
}

/**
 * Find makes by model year.
 *
 * @param year the year
 * @return the makes result
 */
public MakesResult findMakesByModelYear(String year){
	
	Map<String, String> args = new HashMap<String, String>();
	args.put("year", year);
	MakesResult result = (MakesResult)getJSON("findmakesbymodelyear", 
			MakesResult.class, args);
	return result;
}

/**
 * Find makes by publication state.
 *
 * @param state the state
 * @return the makes result
 */
public MakesResult findMakesByPublicationState(String state){
	
	Map<String, String> args = new HashMap<String, String>();
	args.put("state", state);
	MakesResult result = (MakesResult)getJSON("findmakesbypublicationstate", 
			MakesResult.class, args);
	return result;
}

/**
 * Find new and used.
 *
 * @return the makes result
 */
public MakesResult findNewAndUsed(){
	
	MakesResult result = (MakesResult)getJSON("findnewandused", 
			MakesResult.class);
	return result;
}

/**
 * Find new and used makes by model year.
 *
 * @param year the year
 * @return the makes result
 */
public MakesResult findNewAndUsedMakesByModelYear(String year){
	
	Map<String, String> args = new HashMap<String, String>();
	args.put("year", year);
	MakesResult result = (MakesResult)getJSON("findnewandusedmakesbymodelyear", 
			MakesResult.class, args);
	return result;
}

/**
 * Find new makes.
 *
 * @return the makes result
 */
public MakesResult findNewMakes(){
	
	MakesResult result = (MakesResult)getJSON("findnewmakes", 
			MakesResult.class);
	return result;
}

/**
 * Find used makes.
 *
 * @return the makes result
 */
public MakesResult findUsedMakes(){
	
	MakesResult result = (MakesResult)getJSON("findusedmakes", 
			MakesResult.class);
	return result;
}

	/* (non-Javadoc)
	 * @see com.timothyimhof.edmunds.BaseRepositoryManager#getRequestRepository()
	 */
	@Override
	protected String getRequestRepository() {
		return "vehicle/makerepository";
	}

}
