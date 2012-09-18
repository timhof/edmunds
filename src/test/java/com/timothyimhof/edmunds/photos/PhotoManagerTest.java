/*
 * Edmunds API Client Library
 * @author Timothy Imhof
 * @email timothyimhof@gmail.com
 */
package com.timothyimhof.edmunds.photos;

import java.util.List;

import org.junit.Test;

import com.timothyimhof.edmunds.BaseManagerTest;
import com.timothyimhof.edmunds.BaseRepositoryManager;
import com.timothyimhof.edmunds.photos.bean.Photo;

public class PhotoManagerTest extends BaseManagerTest {

	private String styleId = "100336294";

	@Test
	public void testFindPhotosByStyleId() {

		PhotoManager photoManager = (PhotoManager) getManager();
		List<Photo> photos = photoManager.findPhotosByStyleId(styleId);

		for (Photo photo : photos) {
			System.out.format("%s\t%s\n", photo.getId(), photo.getSource());
		}

	}

	@Override
	protected BaseRepositoryManager getManager() {
		return new PhotoManager(properties.getProperty("api_version"),
				properties.getProperty("vehicle_api_key"));
	}
}
