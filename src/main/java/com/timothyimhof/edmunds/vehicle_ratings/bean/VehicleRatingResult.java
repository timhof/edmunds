/*
 * Edmunds API Client Library
 * @author Timothy Imhof
 * @email timothyimhof@gmail.com
 */
package com.timothyimhof.edmunds.vehicle_ratings.bean;

import java.util.List;

// TODO: Auto-generated Javadoc
/**
 * The Class VehicleRatingResult.
 */
public class VehicleRatingResult {

	/** The reviews. */
	private List<Review> reviews;

	/**
	 * Gets the reviews.
	 *
	 * @return the reviews
	 */
	public List<Review> getReviews() {
		return reviews;
	}

	/**
	 * Sets the reviews.
	 *
	 * @param reviews the new reviews
	 */
	public void setReviews(List<Review> reviews) {
		this.reviews = reviews;
	}
}
