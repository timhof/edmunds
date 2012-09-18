/*
 * Edmunds API Client Library
 * @author Timothy Imhof
 * @email timothyimhof@gmail.com
 */
package com.timothyimhof.edmunds.model_years;

import org.junit.Test;

import com.timothyimhof.edmunds.BaseManagerTest;
import com.timothyimhof.edmunds.BaseRepositoryManager;
import com.timothyimhof.edmunds.model_years.ModelYearManager;
import com.timothyimhof.edmunds.model_years.bean.ModelYear;
import com.timothyimhof.edmunds.model_years.bean.ModelYearResult;

public class ModelYearManagerTest extends BaseManagerTest {

	private String id = "1289";
	private String modelId = "Toyota_Tacoma";
	private String makeId = "200003381";
	private String make = "Toyota";
	private String year = "1998";
	private String model = "Tacoma";
	private String state = "future";
	private String category = "sedan";

	@Test
	public void testFindById() {

		ModelYearManager modelYearManager = (ModelYearManager) getManager();
		ModelYearResult result = modelYearManager.findById(id);

		for (ModelYear modelYear : result.getModelYearHolder()) {
			System.out.format("%s\t%s\n", modelYear.getId(),
					modelYear.getName());
		}
	}

	@Test
	public void findDistinctYearWithNew() {

		ModelYearManager modelYearManager = (ModelYearManager) getManager();
		ModelYearResult result = modelYearManager.findDistinctYearWithNew();

		for (ModelYear modelYear : result.getModelYearHolder()) {
			System.out.format("%s\t%s\n", modelYear.getId(),
					modelYear.getName());
		}
	}

	@Test
	public void findDistinctYearWithNewOrUsed() {

		ModelYearManager modelYearManager = (ModelYearManager) getManager();
		ModelYearResult result = modelYearManager
				.findDistinctYearWithNewOrUsed();

		for (ModelYear modelYear : result.getModelYearHolder()) {
			System.out.format("%s\t%s\n", modelYear.getId(),
					modelYear.getName());
		}
	}

	@Test
	public void findDistinctYearWithUsed() {

		ModelYearManager modelYearManager = (ModelYearManager) getManager();
		ModelYearResult result = modelYearManager
				.findDistinctYearWithUsed(year);

		for (ModelYear modelYear : result.getModelYearHolder()) {
			System.out.format("%s\t%s\n", modelYear.getId(),
					modelYear.getName());
		}
	}

	@Test
	public void findFutureModelYearsByModelId() {

		ModelYearManager modelYearManager = (ModelYearManager) getManager();
		ModelYearResult result = modelYearManager
				.findFutureModelYearsByModelId(modelId);

		for (ModelYear modelYear : result.getModelYearHolder()) {
			System.out.format("%s\t%s\n", modelYear.getId(),
					modelYear.getName());
		}
	}

	@Test
	public void findModelYearsByMakeAndYear() {

		ModelYearManager modelYearManager = (ModelYearManager) getManager();
		ModelYearResult result = modelYearManager.findModelYearsByMakeAndYear(
				make, year);

		for (ModelYear modelYear : result.getModelYearHolder()) {
			System.out.format("%s\t%s\n", modelYear.getId(),
					modelYear.getName());
		}
	}

	@Test
	public void findModelYearsByMakeModel() {

		ModelYearManager modelYearManager = (ModelYearManager) getManager();
		ModelYearResult result = modelYearManager.findModelYearsByMakeModel(
				make, model);

		for (ModelYear modelYear : result.getModelYearHolder()) {
			System.out.format("%s\t%s\n", modelYear.getId(),
					modelYear.getName());
		}
	}

	@Test
	public void findNewAndUsedModelYearsByMakeIdAndYear() {

		ModelYearManager modelYearManager = (ModelYearManager) getManager();
		ModelYearResult result = modelYearManager
				.findNewAndUsedModelYearsByMakeIdAndYear(makeId, year);

		for (ModelYear modelYear : result.getModelYearHolder()) {
			System.out.format("%s\t%s\n", modelYear.getId(),
					modelYear.getName());
		}
	}

	@Test
	public void findNewModelYearsByModelId() {

		ModelYearManager modelYearManager = (ModelYearManager) getManager();
		ModelYearResult result = modelYearManager
				.findNewModelYearsByModelId(modelId);

		for (ModelYear modelYear : result.getModelYearHolder()) {
			System.out.format("%s\t%s\n", modelYear.getId(),
					modelYear.getName());
		}
	}

	@Test
	public void findUsedModelYearsByModelId() {

		ModelYearManager modelYearManager = (ModelYearManager) getManager();
		ModelYearResult result = modelYearManager
				.findUsedModelYearsByModelId(modelId);

		for (ModelYear modelYear : result.getModelYearHolder()) {
			System.out.format("%s\t%s\n", modelYear.getId(),
					modelYear.getName());
		}
	}

	@Test
	public void findYearsByCategoryAndPublicationState() {

		ModelYearManager modelYearManager = (ModelYearManager) getManager();
		ModelYearResult result = modelYearManager
				.findYearsByCategoryAndPublicationState(category, state);

		for (ModelYear modelYear : result.getModelYearHolder()) {
			System.out.format("%s\t%s\n", modelYear.getId(),
					modelYear.getName());
		}
	}

	@Test
	public void forModelId() {

		ModelYearManager modelYearManager = (ModelYearManager) getManager();
		ModelYearResult result = modelYearManager.forModelId(modelId);

		for (ModelYear modelYear : result.getModelYearHolder()) {
			System.out.format("%s\t%s\n", modelYear.getId(),
					modelYear.getName());
		}
	}

	@Test
	public void forYearMakeModel() {

		ModelYearManager modelYearManager = (ModelYearManager) getManager();
		ModelYearResult result = modelYearManager.forYearMakeModel(make, model,
				year);

		for (ModelYear modelYear : result.getModelYearHolder()) {
			System.out.format("%s\t%s\n", modelYear.getId(),
					modelYear.getName());
		}
	}

	@Override
	protected BaseRepositoryManager getManager() {
		return new ModelYearManager(properties.getProperty("api_version"),
				properties.getProperty("vehicle_api_key"));
	}
}
