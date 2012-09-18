/*
 * Edmunds API Client Library
 * @author Timothy Imhof
 * @email timothyimhof@gmail.com
 */
package com.timothyimhof.edmunds.styles.bean;

import java.util.List;

// TODO: Auto-generated Javadoc
/**
 * The Class SquishVin.
 */
public class SquishVin {
	
	/** The squish vin. */
	private String squishVin;
	
	/** The engine names. */
	private List<String> engineNames;
	
	/** The squish vin transmissions. */
	private List<Transmission> squishVinTransmissions;
	
	/**
	 * Gets the squish vin.
	 *
	 * @return the squish vin
	 */
	public String getSquishVin() {
		return squishVin;
	}
	
	/**
	 * Sets the squish vin.
	 *
	 * @param squishVin the new squish vin
	 */
	public void setSquishVin(String squishVin) {
		this.squishVin = squishVin;
	}
	
	/**
	 * Gets the engine names.
	 *
	 * @return the engine names
	 */
	public List<String> getEngineNames() {
		return engineNames;
	}
	
	/**
	 * Sets the engine names.
	 *
	 * @param engineNames the new engine names
	 */
	public void setEngineNames(List<String> engineNames) {
		this.engineNames = engineNames;
	}
	
	/**
	 * Gets the squish vin transmissions.
	 *
	 * @return the squish vin transmissions
	 */
	public List<Transmission> getSquishVinTransmissions() {
		return squishVinTransmissions;
	}
	
	/**
	 * Sets the squish vin transmissions.
	 *
	 * @param squishVinTransmissions the new squish vin transmissions
	 */
	public void setSquishVinTransmissions(List<Transmission> squishVinTransmissions) {
		this.squishVinTransmissions = squishVinTransmissions;
	}
	
	
}
