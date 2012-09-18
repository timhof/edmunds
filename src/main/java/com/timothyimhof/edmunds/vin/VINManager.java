/*
 * Edmunds API Client Library
 * @author Timothy Imhof
 * @email timothyimhof@gmail.com
 */
package com.timothyimhof.edmunds.vin;

import java.util.HashMap;
import java.util.Map;

import com.timothyimhof.edmunds.BaseRepositoryManager;
import com.timothyimhof.edmunds.vin.bean.VINResult;

/**
 * The Class VINManager.
 */
public class VINManager extends BaseRepositoryManager{

	/**
	 * Instantiates a new vIN manager.
	 *
	 * @param apiVersion the api version
	 * @param apiKey the api key
	 */
	public VINManager(String apiVersion, String apiKey) {
		super(apiVersion, apiKey);
	}

	/**
	 * Decode vin.
	 *
	 * @param vin the vin
	 * @return the vIN result
	 */
	public VINResult decodeVIN(String vin){
		
		Map<String, String> args = new HashMap<String, String>();
		args.put("vin", vin);

		VINResult result = (VINResult)getJSON("vindecoder", 
				VINResult.class, args);
		
		return result;
	}
	
	/* (non-Javadoc)
	 * @see com.timothyimhof.edmunds.BaseRepositoryManager#getRequestRepository()
	 */
	@Override
	protected String getRequestRepository() {

		return "toolsrepository";		
	}

}
