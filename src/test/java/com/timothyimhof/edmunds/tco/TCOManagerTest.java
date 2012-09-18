/*
 * Edmunds API Client Library
 * @author Timothy Imhof
 * @email timothyimhof@gmail.com
 */
package com.timothyimhof.edmunds.tco;

import java.util.Map;
import org.junit.Test;

import com.timothyimhof.edmunds.BaseManagerTest;
import com.timothyimhof.edmunds.BaseRepositoryManager;
import com.timothyimhof.edmunds.tco.bean.Make;
import com.timothyimhof.edmunds.tco.bean.Model;
import com.timothyimhof.edmunds.tco.bean.Style;
import com.timothyimhof.edmunds.tco.bean.TCOResult;

public class TCOManagerTest extends BaseManagerTest {

	private String styleId = "3136";
	private String makeId = "200003381";
	private String make = "toyota";
	private String year = "1998";
	private String model = "tacoma";
	private String modelyearid = "1289";
	private String subModel = "0";
	private String zip = "11746";

	@Test
	public void testGetMakesWithTCOData() {

		TCOManager tcoManager = (TCOManager) getManager();
		TCOResult result = tcoManager.getMakesWithTCOData();

		for (Map.Entry<String, Make> entry : result.getMakes().entrySet()) {
			Make make = entry.getValue();
			System.out.format("%s\t%s\n", make.getId(), make.getName());
		}
	}

	@Test
	public void testGetModelsWithTCOData() {

		TCOManager tcoManager = (TCOManager) getManager();
		TCOResult result = tcoManager.getModelsWithTCOData(makeId);

		for (Map.Entry<String, Model> entry : result.getModels().entrySet()) {
			Model model = entry.getValue();
			System.out.format("%s\t%s\n", model.getId(), model.getName());
		}
	}

	@Test
	public void testGetStylesWithTCODataBySubModel() {

		TCOManager tcoManager = (TCOManager) getManager();
		TCOResult result = tcoManager.getStylesWithTCODataBySubModel(make,
				model, year, subModel, modelyearid);

		for (Map.Entry<String, Style> entry : result.getStyles().entrySet()) {
			Style style = entry.getValue();
			System.out.format("%s\t%s\n", style.getId(), style.getPrice());
		}
	}

	@Test
	public void testNewRatesByStyleIdAndZip() {

		TCOManager tcoManager = (TCOManager) getManager();
		TCOResult result = tcoManager.newRatesByStyleIdAndZip(styleId, zip);

		for (Map.Entry<String, Model> entry : result.getModels().entrySet()) {
			Model model = entry.getValue();
			System.out.format("%s\t%s\n", model.getId(), model.getName());
		}
	}

	@Test
	public void testNewTotalCashPriceByStyleIdAndZip() {

		TCOManager tcoManager = (TCOManager) getManager();
		TCOResult result = tcoManager.newTotalCashPriceByStyleIdAndZip(styleId,
				zip);

		for (Map.Entry<String, Model> entry : result.getModels().entrySet()) {
			Model model = entry.getValue();
			System.out.format("%s\t%s\n", model.getId(), model.getName());
		}
	}

	@Test
	public void testNewTrueCostToOwnByStyleIdAndZip() {

		TCOManager tcoManager = (TCOManager) getManager();
		TCOResult result = tcoManager.newTrueCostToOwnByStyleIdAndZip(styleId,
				zip);

		for (Map.Entry<String, Model> entry : result.getModels().entrySet()) {
			Model model = entry.getValue();
			System.out.format("%s\t%s\n", model.getId(), model.getName());
		}
	}

	@Test
	public void testResaleValueByStyleIdAndZip() {

		TCOManager tcoManager = (TCOManager) getManager();
		TCOResult result = tcoManager.resaleValueByStyleIdAndZip(styleId, zip);

		for (Map.Entry<String, Model> entry : result.getModels().entrySet()) {
			Model model = entry.getValue();
			System.out.format("%s\t%s\n", model.getId(), model.getName());
		}
	}

	@Test
	public void testUsedRatesByStyleIdAndZip() {

		TCOManager tcoManager = (TCOManager) getManager();
		TCOResult result = tcoManager.usedRatesByStyleIdAndZip(styleId, zip);

		for (String value : result.getValues()) {
			System.out.format("VALUE:\t%s\n", value);
		}
		System.out.format("TOTAL:\t%s\n", result.getTotal());
	}

	@Test
	public void testUsedTotalCashPriceByStyleIdAndZip() {

		TCOManager tcoManager = (TCOManager) getManager();
		TCOResult result = tcoManager.usedTotalCashPriceByStyleIdAndZip(
				styleId, zip);

		System.out.format("VALUE:\t%s\n", result.getValue());
	}

	@Test
	public void testUsedTrueCostToOwnByStyleIdAndZip() {

		TCOManager tcoManager = (TCOManager) getManager();
		TCOResult result = tcoManager.usedTrueCostToOwnByStyleIdAndZip(styleId,
				zip);

		for (Map.Entry<String, Model> entry : result.getModels().entrySet()) {
			Model model = entry.getValue();
			System.out.format("%s\t%s\n", model.getId(), model.getName());
		}
	}

	@Override
	protected BaseRepositoryManager getManager() {
		return new TCOManager(properties.getProperty("api_version"),
				properties.getProperty("vehicle_api_key"));
	}
}
