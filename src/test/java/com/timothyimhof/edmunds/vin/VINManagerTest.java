/*
 * Edmunds API Client Library
 * @author Timothy Imhof
 * @email timothyimhof@gmail.com
 */
package com.timothyimhof.edmunds.vin;

import java.util.List;

import org.junit.Test;

import com.timothyimhof.edmunds.BaseManagerTest;
import com.timothyimhof.edmunds.BaseRepositoryManager;
import com.timothyimhof.edmunds.styles.bean.Style;
import com.timothyimhof.edmunds.vin.bean.VINResult;

public class VINManagerTest extends BaseManagerTest {

	private String vin = "JTEBU17R848028574";

	@Test
	public void testDecodeVIN() {

		VINManager vinManager = (VINManager) getManager();
		VINResult result = vinManager.decodeVIN(vin);

		List<Style> styleHolder = result.getStyleHolder();
		for (Style style : styleHolder) {
			System.out.format("%s\t%s\n", style.getId(), style.getName());
		}

	}

	@Override
	protected BaseRepositoryManager getManager() {
		return new VINManager(properties.getProperty("api_version"),
				properties.getProperty("vehicle_api_key"));
	}
}
