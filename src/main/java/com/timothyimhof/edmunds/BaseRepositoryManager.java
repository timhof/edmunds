/*
 * Edmunds API Client Library
 * @author Timothy Imhof
 * @email timothyimhof@gmail.com
 */
package com.timothyimhof.edmunds;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Type;
import java.util.List;
import java.util.Map;

import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;

import com.google.gson.Gson;

/**
 * The Class BaseRepositoryManager.
 */
public abstract class BaseRepositoryManager {

	/** The DEBUG. */
	private static boolean DEBUG = false;
	
	/** The api key. */
	private final String apiKey;
	
	/** The api version. */
	private final String apiVersion;
	
	/**
	 * Instantiates a new base repository manager.
	 *
	 * @param apiVersion the api version
	 * @param apiKey the api key
	 */
	public BaseRepositoryManager(String apiVersion, String apiKey){
		this.apiVersion = apiVersion;
		this.apiKey = apiKey;
	}
	
	/**
	 * Gets the jSON.
	 *
	 * @param requestPath the request path
	 * @param type the type
	 * @return the jSON
	 */
	protected Object getJSON(String requestPath, final Type type){

		String requestURL = getRequestURL(requestPath);

		System.out.println(requestURL);
		
		return getJSONResponse(requestURL, type);
	}
	
	/**
	 * Gets the jSON.
	 *
	 * @param <T> the generic type
	 * @param requestPath the request path
	 * @param type the type
	 * @param args the args
	 * @return the jSON
	 */
	protected <T> Object getJSON(String requestPath, final Type type, Map<String, String> args){

		String requestURL = getRequestURL(requestPath, args);

		System.out.println(requestURL);
		
		return getJSONResponse(requestURL, type);
	}
	
	/**
	 * Gets the jSON.
	 *
	 * @param <T> the generic type
	 * @param requestPath the request path
	 * @param type the type
	 * @param args the args
	 * @return the jSON
	 */
	protected <T> Object getJSON(String requestPath, final Type type, List<String> args){

		String requestURL = getRequestURL(requestPath, args);

		System.out.println(requestURL);
		
		return getJSONResponse(requestURL, type);
	}

	/**
	 * Gets the request url.
	 *
	 * @param requestPath the request path
	 * @return the request url
	 */
	private String getRequestURL(String requestPath){

		StringBuilder requestURL = new StringBuilder();
		requestURL.append("http://api.edmunds.com/");
		requestURL.append(String.format("%s/api/", getApiVersion()));
		requestURL.append(String.format("%s/", getRequestRepository()));
		requestURL.append(requestPath);
		requestURL.append(String.format("?api_key=%s", getApiKey()));
		
		return requestURL.toString();
	}
	
	/**
	 * Gets the request url.
	 *
	 * @param requestPath the request path
	 * @param args the args
	 * @return the request url
	 */
	private String getRequestURL(String requestPath, Map<String, String> args){

		StringBuilder requestURL = new StringBuilder();
		requestURL.append("http://api.edmunds.com/");
		requestURL.append(String.format("%s/api/", getApiVersion()));
		requestURL.append(String.format("%s/", getRequestRepository()));
		requestURL.append(requestPath);
		requestURL.append(String.format("?api_key=%s", getApiKey()));
		
		if(args != null){
		for(Map.Entry<String, String> entry : args.entrySet()){
			requestURL.append(String.format("&%s=%s", entry.getKey(), entry.getValue()));
		}
		}

		return requestURL.toString();
	}
	
	/**
	 * Gets the request url.
	 *
	 * @param requestPath the request path
	 * @param args the args
	 * @return the request url
	 */
	private String getRequestURL(String requestPath, List<String> args){

		StringBuilder requestURL = new StringBuilder();
		requestURL.append("http://api.edmunds.com/");
		requestURL.append(String.format("%s/api/", getApiVersion()));
		requestURL.append(String.format("%s/", getRequestRepository()));
		requestURL.append(requestPath);
		
		if(args != null){
			for(String entry : args){
				requestURL.append(String.format("/%s", entry));
			}
		}

		requestURL.append(String.format("?api_key=%s", getApiKey()));

		return requestURL.toString();
	}

	/**
	 * Gets the jSON response.
	 *
	 * @param <T> the generic type
	 * @param requestURL the request url
	 * @param type the type
	 * @return the jSON response
	 */
	private <T> Object getJSONResponse(String requestURL, final Type type){
		
		try {

			DefaultHttpClient httpClient = new DefaultHttpClient();
			HttpGet getRequest = new HttpGet(requestURL);
			getRequest.addHeader("accept", "application/json");

			HttpResponse response = httpClient.execute(getRequest);

			if (response.getStatusLine().getStatusCode() != 200) {
				throw new RuntimeException("Failed : HTTP error code : "
						+ response.getStatusLine().getStatusCode());
			}

			InputStreamReader in = new InputStreamReader(response.getEntity().getContent());
			
			BufferedReader br = new BufferedReader(in);

			if(DEBUG){
			/********************* DEBUG *********************/
			String sCurrentLine;
			while ((sCurrentLine = br.readLine()) != null) {
				System.out.format("%s\n", sCurrentLine);
			}
			
			/*************************************************/
			}
			else{
			final Gson gson = new Gson();
			Object fromJson = gson.fromJson(br, type);
			
			httpClient.getConnectionManager().shutdown();
			
			return fromJson;
			}
		} catch (ClientProtocolException e) {

			e.printStackTrace();

		} catch (IOException e) {

			e.printStackTrace();
		}
		
		return null;
	}
	
	/**
	 * Gets the request repository.
	 *
	 * @return the request repository
	 */
	abstract protected String getRequestRepository();
	
	/**
	 * Gets the api key.
	 *
	 * @return the api key
	 */
	protected String getApiKey() {
		return apiKey;
	}
	
	/**
	 * Gets the api version.
	 *
	 * @return the api version
	 */
	protected String getApiVersion() {
		return apiVersion;
	}
	
	/**
	 * Checks for request repository.
	 *
	 * @return true, if successful
	 */
	public boolean hasRequestRepository(){
		return getRequestRepository() != null;
	}
}
