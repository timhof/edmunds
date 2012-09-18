/*
 * Edmunds API Client Library
 * @author Timothy Imhof
 * @email timothyimhof@gmail.com
 */
package com.timothyimhof.edmunds.tco;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.timothyimhof.edmunds.BaseRepositoryManager;
import com.timothyimhof.edmunds.tco.bean.TCOResult;

/**
 * The Class TCOManager.
 */
public class TCOManager extends BaseRepositoryManager{

	/**
	 * Instantiates a new tCO manager.
	 *
	 * @param apiVersion the api version
	 * @param apiKey the api key
	 */
	public TCOManager(String apiVersion, String apiKey){
		super(apiVersion, apiKey);
	}

	/**
	 * New true cost to own by style id and zip.
	 *
	 * @param styleId the style id
	 * @param zip the zip
	 * @return the tCO result
	 */
	public TCOResult newTrueCostToOwnByStyleIdAndZip(String styleId, String zip){

		List<String> args = new ArrayList<String>();
		args.add(styleId);
		args.add(zip);

		TCOResult result = (TCOResult)getJSON("newtruecosttoownbystyleidandzip", 
				TCOResult.class, args);

		return result;
	}

	/**
	 * Used true cost to own by style id and zip.
	 *
	 * @param styleId the style id
	 * @param zip the zip
	 * @return the tCO result
	 */
	public TCOResult usedTrueCostToOwnByStyleIdAndZip(String styleId, String zip){

		List<String> args = new ArrayList<String>();
		args.add(styleId);
		args.add(zip);

		TCOResult result = (TCOResult)getJSON("usedtruecosttoownbystyleidandzip", 
				TCOResult.class, args);

		return result;
	}

	/**
	 * Resale value by style id and zip.
	 *
	 * @param styleId the style id
	 * @param zip the zip
	 * @return the tCO result
	 */
	public TCOResult resaleValueByStyleIdAndZip(String styleId, String zip){

		List<String> args = new ArrayList<String>();
		args.add(styleId);
		args.add(zip);

		TCOResult result = (TCOResult)getJSON("resalevaluesbystyleidandzip", 
				TCOResult.class, args);

		return result;
	}

	/**
	 * Used rates by style id and zip.
	 *
	 * @param styleId the style id
	 * @param zip the zip
	 * @return the tCO result
	 */
	public TCOResult usedRatesByStyleIdAndZip(String styleId, String zip){

		List<String> args = new ArrayList<String>();
		args.add(styleId);
		args.add(zip);

		TCOResult result = (TCOResult)getJSON("depreciation/usedratesbystyleidandzip", 
				TCOResult.class, args);

		return result;
	}

	/**
	 * New rates by style id and zip.
	 *
	 * @param styleId the style id
	 * @param zip the zip
	 * @return the tCO result
	 */
	public TCOResult newRatesByStyleIdAndZip(String styleId, String zip){

		List<String> args = new ArrayList<String>();
		args.add(styleId);
		args.add(zip);

		TCOResult result = (TCOResult)getJSON("depreciation/newratesbystyleidandzip", 
				TCOResult.class, args);

		return result;
	}	
	
	/**
	 * New total cash price by style id and zip.
	 *
	 * @param styleId the style id
	 * @param zip the zip
	 * @return the tCO result
	 */
	public TCOResult newTotalCashPriceByStyleIdAndZip(String styleId, String zip){

		List<String> args = new ArrayList<String>();
		args.add(styleId);
		args.add(zip);

		TCOResult result = (TCOResult)getJSON("newtotalcashpricebystyleidandzip", 
				TCOResult.class, args);

		return result;
	}	
	
	/**
	 * Used total cash price by style id and zip.
	 *
	 * @param styleId the style id
	 * @param zip the zip
	 * @return the tCO result
	 */
	public TCOResult usedTotalCashPriceByStyleIdAndZip(String styleId, String zip){

		List<String> args = new ArrayList<String>();
		args.add(styleId);
		args.add(zip);

		TCOResult result = (TCOResult)getJSON("usedtotalcashpricebystyleidandzip", 
				TCOResult.class, args);

		return result;
	}	
	
	/**
	 * Gets the makes with tco data.
	 *
	 * @return the makes with tco data
	 */
	public TCOResult getMakesWithTCOData(){

		TCOResult result = (TCOResult)getJSON("getmakeswithtcodata", 
				TCOResult.class);

		return result;
	}
	
	/**
	 * Gets the models with tco data.
	 *
	 * @param makeId the make id
	 * @return the models with tco data
	 */
	public TCOResult getModelsWithTCOData(String makeId){

		Map<String, String> args = new HashMap<String, String>();
		args.put("makeid", makeId);
		TCOResult result = (TCOResult)getJSON("getmodelswithtcodata", 
				TCOResult.class, args);

		return result;
	}
	
	/**
	 * Gets the styles with tco data by sub model.
	 *
	 * @param make the make
	 * @param model the model
	 * @param year the year
	 * @param subModel the sub model
	 * @param makeYear the make year
	 * @return the styles with tco data by sub model
	 */
	public TCOResult getStylesWithTCODataBySubModel(String make, String model, String year, String subModel, String makeYear){
		Map<String, String> args = new HashMap<String, String>();
		args.put("make", make);
		args.put("model", model);
		args.put("year", year);
		args.put("subModel", subModel);
		args.put("makeYear", makeYear);
		TCOResult result = (TCOResult)getJSON("getstyleswithtcodatabysubmodel", 
				TCOResult.class, args);

		return result;
	}

	/* (non-Javadoc)
	 * @see com.timothyimhof.edmunds.BaseRepositoryManager#getRequestRepository()
	 */
	@Override
	protected String getRequestRepository() {
		return "tco";
	}

}
