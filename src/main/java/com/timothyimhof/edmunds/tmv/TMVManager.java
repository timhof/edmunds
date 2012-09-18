/*
 * Edmunds API Client Library
 * @author Timothy Imhof
 * @email timothyimhof@gmail.com
 */
package com.timothyimhof.edmunds.tmv;

import java.util.HashMap;
import java.util.Map;

import com.timothyimhof.edmunds.BaseRepositoryManager;
import com.timothyimhof.edmunds.tmv.bean.TMVResult;

/**
 * The Class TMVManager.
 */
public class TMVManager extends BaseRepositoryManager {

	/**
	 * Instantiates a new tMV manager.
	 *
	 * @param apiVersion the api version
	 * @param apiKey the api key
	 */
	public TMVManager(String apiVersion, String apiKey) {
		super(apiVersion, apiKey);
	}

	/**
	 * Calculate new tmv.
	 *
	 * @param styleId the style id
	 * @param zip the zip
	 * @param colorId the color id
	 * @param optionId the option id
	 * @return the tMV result
	 */
	public TMVResult calculateNewTMV(String styleId, String zip, String colorId, String optionId){

		Map<String, String> args = new HashMap<String, String>();
		args.put("styleid", styleId);
		args.put("zip", zip);
		args.put("colorid", colorId);
		args.put("optionid", optionId);
		
		TMVResult result = (TMVResult)getJSON("calculatenewtmv", 
				TMVResult.class, args);
		return result;

	}

	/**
	 * Calculate used tmv.
	 *
	 * @param styleId the style id
	 * @param condition the condition
	 * @param mileage the mileage
	 * @param zip the zip
	 * @param colorId the color id
	 * @param optionId the option id
	 * @return the tMV result
	 */
	public TMVResult calculateUsedTMV(String styleId, String condition, String mileage, String zip, String colorId, String optionId){

		Map<String, String> args = new HashMap<String, String>();
		args.put("styleid", styleId);
		args.put("condition", condition);
		args.put("mileage", mileage);
		args.put("zip", zip);
		args.put("colorid", colorId);
		args.put("optionid", optionId);
		
		TMVResult result = (TMVResult)getJSON("calculateusedtmv", 
				TMVResult.class);
		return result;

	}

	/**
	 * Calculate typically equipped used tmv.
	 *
	 * @param styleId the style id
	 * @param zip the zip
	 * @return the tMV result
	 */
	public TMVResult calculateTypicallyEquippedUsedTMV(String styleId, String zip){

		Map<String, String> args = new HashMap<String, String>();
		args.put("styleid", styleId);
		args.put("zip", zip);
		
		TMVResult result = (TMVResult)getJSON("calculatetypicallyequippedusedtmv", 
				TMVResult.class, args);
		return result;

	}

	/**
	 * Find certified price for style.
	 *
	 * @param styleId the style id
	 * @param zip the zip
	 * @return the tMV result
	 */
	public TMVResult findCertifiedPriceForStyle(String styleId, String zip){

		Map<String, String> args = new HashMap<String, String>();
		args.put("styleid", styleId);
		args.put("zip", zip);
		
		TMVResult result = (TMVResult)getJSON("findcertifiedpriceforstyle", 
				TMVResult.class, args);
		return result;

	}

	/**
	 * Find cpo years by make.
	 *
	 * @param makeId the make id
	 * @return the tMV result
	 */
	public TMVResult findCPOYearsByMake(String makeId){

		Map<String, String> args = new HashMap<String, String>();
		args.put("makeid", makeId);
		
		TMVResult result = (TMVResult)getJSON("findcpoyearsbymake", 
				TMVResult.class, args);
		return result;

	}

	/* (non-Javadoc)
	 * @see com.timothyimhof.edmunds.BaseRepositoryManager#getRequestRepository()
	 */
	@Override
	protected String getRequestRepository() {
		return "tmv/tmvservice";
	}

}
