/*
 * Edmunds API Client Library
 * @author Timothy Imhof
 * @email timothyimhof@gmail.com
 */
package com.timothyimhof.edmunds.tmv.bean;

import java.util.Map;

// TODO: Auto-generated Javadoc
/**
 * The Class TMV.
 */
public class TMV {

	/** The color adjustment. */
	private Map<String, String> colorAdjustment;
	
	/** The destination change. */
	private String destinationChange;
	
	/** The estimated tmv. */
	private String estimatedTmv;
	
	/** The gas guzzler tax. */
	private String gasGuzzlerTax;
	
	/** The incentives and rebates. */
	private String incentivesAndRebates;
	
	/** The national base price. */
	private Map<String, String> nationalBasePrice;
    
    /** The offer price. */
    private String offerPrice;
    
    /** The option tmv prices. */
    private String optionTMVPrices;
    
    /** The regional adjustment. */
    private Map<String, String> regionalAdjustment;
    
    /** The total with options. */
    private String totalWithOptions;
    
	/**
	 * Gets the color adjustment.
	 *
	 * @return the color adjustment
	 */
	public Map<String, String> getColorAdjustment() {
		return colorAdjustment;
	}
	
	/**
	 * Sets the color adjustment.
	 *
	 * @param colorAdjustment the color adjustment
	 */
	public void setColorAdjustment(Map<String, String> colorAdjustment) {
		this.colorAdjustment = colorAdjustment;
	}
	
	/**
	 * Gets the destination change.
	 *
	 * @return the destination change
	 */
	public String getDestinationChange() {
		return destinationChange;
	}
	
	/**
	 * Sets the destination change.
	 *
	 * @param destinationChange the new destination change
	 */
	public void setDestinationChange(String destinationChange) {
		this.destinationChange = destinationChange;
	}
	
	/**
	 * Gets the estimated tmv.
	 *
	 * @return the estimated tmv
	 */
	public String getEstimatedTmv() {
		return estimatedTmv;
	}
	
	/**
	 * Sets the estimated tmv.
	 *
	 * @param estimatedTmv the new estimated tmv
	 */
	public void setEstimatedTmv(String estimatedTmv) {
		this.estimatedTmv = estimatedTmv;
	}
	
	/**
	 * Gets the gas guzzler tax.
	 *
	 * @return the gas guzzler tax
	 */
	public String getGasGuzzlerTax() {
		return gasGuzzlerTax;
	}
	
	/**
	 * Sets the gas guzzler tax.
	 *
	 * @param gasGuzzlerTax the new gas guzzler tax
	 */
	public void setGasGuzzlerTax(String gasGuzzlerTax) {
		this.gasGuzzlerTax = gasGuzzlerTax;
	}
	
	/**
	 * Gets the incentives and rebates.
	 *
	 * @return the incentives and rebates
	 */
	public String getIncentivesAndRebates() {
		return incentivesAndRebates;
	}
	
	/**
	 * Sets the incentives and rebates.
	 *
	 * @param incentivesAndRebates the new incentives and rebates
	 */
	public void setIncentivesAndRebates(String incentivesAndRebates) {
		this.incentivesAndRebates = incentivesAndRebates;
	}
	
	/**
	 * Gets the national base price.
	 *
	 * @return the national base price
	 */
	public Map<String, String> getNationalBasePrice() {
		return nationalBasePrice;
	}
	
	/**
	 * Sets the national base price.
	 *
	 * @param nationalBasePrice the national base price
	 */
	public void setNationalBasePrice(Map<String, String> nationalBasePrice) {
		this.nationalBasePrice = nationalBasePrice;
	}
	
	/**
	 * Gets the offer price.
	 *
	 * @return the offer price
	 */
	public String getOfferPrice() {
		return offerPrice;
	}
	
	/**
	 * Sets the offer price.
	 *
	 * @param offerPrice the new offer price
	 */
	public void setOfferPrice(String offerPrice) {
		this.offerPrice = offerPrice;
	}
	
	/**
	 * Gets the option tmv prices.
	 *
	 * @return the option tmv prices
	 */
	public String getOptionTMVPrices() {
		return optionTMVPrices;
	}
	
	/**
	 * Sets the option tmv prices.
	 *
	 * @param optionTMVPrices the new option tmv prices
	 */
	public void setOptionTMVPrices(String optionTMVPrices) {
		this.optionTMVPrices = optionTMVPrices;
	}
	
	/**
	 * Gets the regional adjustment.
	 *
	 * @return the regional adjustment
	 */
	public Map<String, String> getRegionalAdjustment() {
		return regionalAdjustment;
	}
	
	/**
	 * Sets the regional adjustment.
	 *
	 * @param regionalAdjustment the regional adjustment
	 */
	public void setRegionalAdjustment(Map<String, String> regionalAdjustment) {
		this.regionalAdjustment = regionalAdjustment;
	}
	
	/**
	 * Gets the total with options.
	 *
	 * @return the total with options
	 */
	public String getTotalWithOptions() {
		return totalWithOptions;
	}
	
	/**
	 * Sets the total with options.
	 *
	 * @param totalWithOptions the new total with options
	 */
	public void setTotalWithOptions(String totalWithOptions) {
		this.totalWithOptions = totalWithOptions;
	}
}
