/*
 * Edmunds API Client Library
 * @author Timothy Imhof
 * @email timothyimhof@gmail.com
 */
package com.timothyimhof.edmunds.styles.bean;

// TODO: Auto-generated Javadoc
/**
 * The Class Transmission.
 */
public class Transmission {

	/** The transmission type. */
	private String transmissionType;
	
	/** The number of speeds. */
	private String numberOfSpeeds;
	
	/**
	 * Gets the transmission type.
	 *
	 * @return the transmission type
	 */
	public String getTransmissionType() {
		return transmissionType;
	}
	
	/**
	 * Sets the transmission type.
	 *
	 * @param transmissionType the new transmission type
	 */
	public void setTransmissionType(String transmissionType) {
		this.transmissionType = transmissionType;
	}
	
	/**
	 * Gets the number of speeds.
	 *
	 * @return the number of speeds
	 */
	public String getNumberOfSpeeds() {
		return numberOfSpeeds;
	}
	
	/**
	 * Sets the number of speeds.
	 *
	 * @param numberOfSpeeds the new number of speeds
	 */
	public void setNumberOfSpeeds(String numberOfSpeeds) {
		this.numberOfSpeeds = numberOfSpeeds;
	}
	
}
