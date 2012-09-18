/*
 * Edmunds API Client Library
 * @author Timothy Imhof
 * @email timothyimhof@gmail.com
 */
package com.timothyimhof.edmunds.styles;

import java.util.Properties;

import org.junit.Test;

import com.timothyimhof.edmunds.BaseManagerTest;
import com.timothyimhof.edmunds.BaseRepositoryManager;
import com.timothyimhof.edmunds.styles.bean.Style;
import com.timothyimhof.edmunds.styles.bean.StyleResult;

public class StyleManagerTest extends BaseManagerTest {

	private Properties properties;
	private String id = "12587";
	private String make = "Toyota";
	private String year = "1998";
	private String model = "Tacoma";
	private String modelyearid = "1289";

	@Test
	public void testFindAll() {

		StyleManager styleManager = (StyleManager) getManager();
		StyleResult result = styleManager.findById(id);

		for (Style style : result.getStyleHolder()) {
			System.out.format("%s\t%s\n", style.getId(), style.getName());
		}
	}

	@Test
	public void testFindStylesByMakeModelYear() {

		StyleManager styleManager = (StyleManager) getManager();
		StyleResult result = styleManager.findStylesByMakeModelYear(make,
				model, year);

		for (Style style : result.getStyleHolder()) {
			System.out.format("%s\t%s\n", style.getId(), style.getName());
		}
	}

	@Test
	public void testFindStylesByModelYearId() {

		StyleManager styleManager = (StyleManager) getManager();
		StyleResult result = styleManager.findStylesByModelYearId(modelyearid);

		for (Style style : result.getStyleHolder()) {
			System.out.format("%s\t%s\n", style.getId(), style.getName());
		}
	}

	@Override
	protected BaseRepositoryManager getManager() {

		return new StyleManager(properties.getProperty("api_version"),
				properties.getProperty("vehicle_api_key"));
	}
}
