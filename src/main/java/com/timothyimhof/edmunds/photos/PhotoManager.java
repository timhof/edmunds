/*
 * Edmunds API Client Library
 * @author Timothy Imhof
 * @email timothyimhof@gmail.com
 */
package com.timothyimhof.edmunds.photos;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.google.gson.reflect.TypeToken;
import com.timothyimhof.edmunds.BaseRepositoryManager;
import com.timothyimhof.edmunds.photos.bean.Photo;

/**
 * The Class PhotoManager.
 */
public class PhotoManager extends BaseRepositoryManager {

	/**
	 * Instantiates a new photo manager.
	 *
	 * @param apiVersion the api version
	 * @param apiKey the api key
	 */
	public PhotoManager(String apiVersion, String apiKey) {
		super(apiVersion, apiKey);
	}
	
	/**
	 * Find photos by style id.
	 *
	 * @param styleId the style id
	 * @return the list
	 */
	@SuppressWarnings("unchecked")
	public List<Photo> findPhotosByStyleId(String styleId){
		
		Map<String, String> args = new HashMap<String, String>();
		args.put("styleId", styleId);

		Type type = new TypeToken<List<Photo>>() {}.getType();
		List<Photo> photos = (List<Photo>)getJSON("findphotosbystyleid", 
				type, args);
		
		return photos;
	}

	/* (non-Javadoc)
	 * @see com.timothyimhof.edmunds.BaseRepositoryManager#getRequestRepository()
	 */
	@Override
	protected String getRequestRepository() {

		return "vehiclephoto/service";
	}

}
