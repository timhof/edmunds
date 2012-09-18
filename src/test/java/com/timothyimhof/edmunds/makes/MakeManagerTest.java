/*
 * Edmunds API Client Library
 * @author Timothy Imhof
 * @email timothyimhof@gmail.com
 */
package com.timothyimhof.edmunds.makes;

import org.junit.Test;

import com.timothyimhof.edmunds.BaseManagerTest;
import com.timothyimhof.edmunds.BaseRepositoryManager;
import com.timothyimhof.edmunds.makes.bean.Make;
import com.timothyimhof.edmunds.makes.bean.MakesResult;
import com.timothyimhof.edmunds.makes.MakeManager;

public class MakeManagerTest extends BaseManagerTest {

	@Test
	public void testFindAll() {

		MakeManager makeManager = (MakeManager) getManager();
		MakesResult makesResult = makeManager.findAll();

		for (Make make : makesResult.getMakeHolder()) {
			System.out.format("%s\t%s\n", make.getId(), make.getName());
		}
	}

	@Test
	public void testFindById() {

		MakeManager makeManager = (MakeManager) getManager();
		MakesResult makesResult = makeManager.findById("200003381");

		for (Make make : makesResult.getMakeHolder()) {
			System.out.format("%s\t%s\n", make.getId(), make.getName());
		}
	}

	@Test
	public void testFindFutureMakes() {

		MakeManager makeManager = (MakeManager) getManager();
		MakesResult makesResult = makeManager.findFutureMakes();

		for (Make make : makesResult.getMakeHolder()) {
			System.out.format("%s\t%s\n", make.getId(), make.getName());
		}
	}

	@Test
	public void testFindMakeByName() {

		MakeManager makeManager = (MakeManager) getManager();
		MakesResult makesResult = makeManager.findMakeByName("Toyota");

		for (Make make : makesResult.getMakeHolder()) {
			System.out.format("%s\t%s\n", make.getId(), make.getName());
		}
	}

	@Test
	public void testFindMakesByModelYear() {

		MakeManager makeManager = (MakeManager) getManager();
		MakesResult makesResult = makeManager.findMakesByModelYear("1998");

		for (Make make : makesResult.getMakeHolder()) {
			System.out.format("%s\t%s\n", make.getId(), make.getName());
		}
	}

	@Test
	public void testFindMakesByPublicationState() {

		MakeManager makeManager = (MakeManager) getManager();
		MakesResult makesResult = makeManager
				.findMakesByPublicationState("future");

		for (Make make : makesResult.getMakeHolder()) {
			System.out.format("%s\t%s\n", make.getId(), make.getName());
		}
	}

	@Test
	public void testFindNewAndUsed() {

		MakeManager makeManager = (MakeManager) getManager();
		MakesResult makesResult = makeManager.findNewAndUsed();

		for (Make make : makesResult.getMakeHolder()) {
			System.out.format("%s\t%s\n", make.getId(), make.getName());
		}
	}

	@Test
	public void testFindNewAndUsedMakesByModelYear() {

		MakeManager makeManager = (MakeManager) getManager();
		MakesResult makesResult = makeManager
				.findNewAndUsedMakesByModelYear("1998");

		for (Make make : makesResult.getMakeHolder()) {
			System.out.format("%s\t%s\n", make.getId(), make.getName());
		}
	}

	@Test
	public void testFindNewMakes() {

		MakeManager makeManager = (MakeManager) getManager();
		MakesResult makesResult = makeManager.findNewMakes();

		for (Make make : makesResult.getMakeHolder()) {
			System.out.format("%s\t%s\n", make.getId(), make.getName());
		}
	}

	@Test
	public void testFindUsedMakes() {

		MakeManager makeManager = (MakeManager) getManager();
		MakesResult makesResult = makeManager.findUsedMakes();

		for (Make make : makesResult.getMakeHolder()) {
			System.out.format("%s\t%s\n", make.getId(), make.getName());
		}
	}

	@Override
	protected BaseRepositoryManager getManager() {

		return new MakeManager(properties.getProperty("api_version"),
				properties.getProperty("vehicle_api_key"));
	}
}
