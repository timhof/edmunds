/*
 * Edmunds API Client Library
 * @author Timothy Imhof
 * @email timothyimhof@gmail.com
 */
package com.timothyimhof.edmunds.vehicle_ratings;

import org.junit.Test;

import com.timothyimhof.edmunds.BaseManagerTest;
import com.timothyimhof.edmunds.BaseRepositoryManager;
import com.timothyimhof.edmunds.vehicle_ratings.bean.Review;
import com.timothyimhof.edmunds.vehicle_ratings.bean.VehicleRatingResult;

public class VehicleRatingManagerTest extends BaseManagerTest {

	private String make = "toyota";
	private String year = "1998";
	private String model = "tacoma";

	@Test
	public void testGetMakesWithTCOData() {

		VehicleRatingManager vehicleRatingsManager = (VehicleRatingManager) getManager();
		VehicleRatingResult result = vehicleRatingsManager
				.getCRRForMakeModelYear(make, model, year);

		for (Review review : result.getReviews()) {
			System.out.format("%s\t%s\n", review.getTotalRating(),
					review.getTitle());
		}
	}

	@Override
	protected BaseRepositoryManager getManager() {
		return new VehicleRatingManager(properties.getProperty("api_version"),
				properties.getProperty("vehicle_api_key"));
	}
}
