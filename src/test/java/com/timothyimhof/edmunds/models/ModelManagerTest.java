/*
 * Edmunds API Client Library
 * @author Timothy Imhof
 * @email timothyimhof@gmail.com
 */
package com.timothyimhof.edmunds.models;

import org.junit.Test;

import com.timothyimhof.edmunds.BaseManagerTest;
import com.timothyimhof.edmunds.BaseRepositoryManager;
import com.timothyimhof.edmunds.models.ModelManager;
import com.timothyimhof.edmunds.models.bean.Model;
import com.timothyimhof.edmunds.models.bean.ModelsResult;

public class ModelManagerTest extends BaseManagerTest {

	private String modelId = "Toyota_Tacoma";
	private String makeId = "200003381";
	private String make = "Toyota";
	private String year = "1998";
	private String model = "Tacoma";
	private String state = "future";

	@Test
	public void testFindById() {

		ModelManager modelManager = (ModelManager) getManager();
		ModelsResult modelsResult = modelManager.findById(modelId);

		for (Model model : modelsResult.getMakeHolder()) {
			System.out.format("%s\t%s\n", model.getId(), model.getName());
		}
	}

	@Test
	public void testFindByMakeId() {

		ModelManager modelManager = (ModelManager) getManager();
		ModelsResult modelsResult = modelManager.findByMakeId(makeId);

		for (Model model : modelsResult.getMakeHolder()) {
			System.out.format("%s\t%s\n", model.getId(), model.getName());
		}
	}

	@Test
	public void findFutureModelsByMakeId() {

		ModelManager modelManager = (ModelManager) getManager();
		ModelsResult modelsResult = modelManager
				.findFutureModelsByMakeId(makeId);

		for (Model model : modelsResult.getMakeHolder()) {
			System.out.format("%s\t%s\n", model.getId(), model.getName());
		}
	}

	@Test
	public void findModelByMakeModelName() {

		ModelManager modelManager = (ModelManager) getManager();
		ModelsResult modelsResult = modelManager.findModelByMakeModelName(make,
				model);

		for (Model model : modelsResult.getMakeHolder()) {
			System.out.format("%s\t%s\n", model.getId(), model.getName());
		}
	}

	@Test
	public void findModelsByMake() {

		ModelManager modelManager = (ModelManager) getManager();
		ModelsResult modelsResult = modelManager.findModelsByMake(make);

		for (Model model : modelsResult.getMakeHolder()) {
			System.out.format("%s\t%s\n", model.getId(), model.getName());
		}
	}

	@Test
	public void findModelsByMakeAndPublicationState() {

		ModelManager modelManager = (ModelManager) getManager();
		ModelsResult modelsResult = modelManager
				.findModelsByMakeAndPublicationState(make, state);

		for (Model model : modelsResult.getMakeHolder()) {
			System.out.format("%s\t%s\n", model.getId(), model.getName());
		}
	}

	@Test
	public void findModelsByMakeAndYear() {

		ModelManager modelManager = (ModelManager) getManager();
		ModelsResult modelsResult = modelManager.findModelsByMakeAndYear(make,
				year);

		for (Model model : modelsResult.getMakeHolder()) {
			System.out.format("%s\t%s\n", model.getId(), model.getName());
		}
	}

	@Test
	public void findNewAndUsedModelsByMakeId() {

		ModelManager modelManager = (ModelManager) getManager();
		ModelsResult modelsResult = modelManager
				.findNewAndUsedModelsByMakeId(makeId);

		for (Model model : modelsResult.getMakeHolder()) {
			System.out.format("%s\t%s\n", model.getId(), model.getName());
		}
	}

	@Test
	public void findNewModelsByMakeId() {

		ModelManager modelManager = (ModelManager) getManager();
		ModelsResult modelsResult = modelManager.findNewModelsByMakeId(makeId);

		for (Model model : modelsResult.getMakeHolder()) {
			System.out.format("%s\t%s\n", model.getId(), model.getName());
		}
	}

	@Test
	public void findUsedModelsByMakeId() {

		ModelManager modelManager = (ModelManager) getManager();
		ModelsResult modelsResult = modelManager.findUsedModelsByMakeId(makeId);

		for (Model model : modelsResult.getMakeHolder()) {
			System.out.format("%s\t%s\n", model.getId(), model.getName());
		}
	}

	@Override
	protected BaseRepositoryManager getManager() {
		return new ModelManager(properties.getProperty("api_version"),
				properties.getProperty("vehicle_api_key"));
	}

}
