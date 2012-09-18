/*
 * Edmunds API Client Library
 * @author Timothy Imhof
 * @email timothyimhof@gmail.com
 */
package com.timothyimhof.edmunds.vehicle_ratings;

import java.util.HashMap;
import java.util.Map;

import com.timothyimhof.edmunds.BaseRepositoryManager;
import com.timothyimhof.edmunds.vehicle_ratings.bean.VehicleRatingResult;

// TODO: Auto-generated Javadoc
/**
 * The Class VehicleRatingManager.
 */
public class VehicleRatingManager extends BaseRepositoryManager {

	/**
	 * Instantiates a new vehicle rating manager.
	 *
	 * @param apiVersion the api version
	 * @param apiKey the api key
	 */
	public VehicleRatingManager(String apiVersion, String apiKey) {
		super(apiVersion, apiKey);
		// TODO Auto-generated constructor stub
	}

	/**
	 * Gets the cRR for make model year.
	 *
	 * @param make the make
	 * @param model the model
	 * @param year the year
	 * @return the cRR for make model year
	 */
	public VehicleRatingResult getCRRForMakeModelYear(String make, String model, String year)
	{
		Map<String, String> args = new HashMap<String, String>();
		args.put("make", make);
		args.put("model", model);
		args.put("year", year);

		VehicleRatingResult result = (VehicleRatingResult)getJSON("getcrrformakemodelyear", 
				VehicleRatingResult.class, args);

		return result;
	}

	/* (non-Javadoc)
	 * @see com.timothyimhof.edmunds.BaseRepositoryManager#getRequestRepository()
	 */
	protected String getRequestRepository() {

		return "crrrepository";
	}

}
