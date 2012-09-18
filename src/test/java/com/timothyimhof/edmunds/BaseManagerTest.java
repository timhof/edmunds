/*
 * Edmunds API Client Library
 * @author Timothy Imhof
 * @email timothyimhof@gmail.com
 */
package com.timothyimhof.edmunds;

import static org.junit.Assert.assertTrue;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.net.URL;
import java.util.Properties;

import org.junit.Before;
import org.junit.Test;

public abstract class BaseManagerTest {

	protected Properties properties;

	protected abstract BaseRepositoryManager getManager();

	@Before
	public void readProperties() throws FileNotFoundException, IOException {
		URL url = this.getClass().getResource("/edmunds.properties");
		File propertiesFile = new File(url.getFile());
		properties = new Properties();
		properties.load(new FileReader(propertiesFile));
	}

	@Test
	public void testGetRequestRepository() {
		BaseRepositoryManager manager = getManager();
		assertTrue(manager.hasRequestRepository());
	}
}
