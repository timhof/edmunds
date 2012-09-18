/*
 * Edmunds API Client Library
 * @author Timothy Imhof
 * @email timothyimhof@gmail.com
 */
package com.timothyimhof.edmunds.vehicle_ratings.bean;

import java.util.Map;

// TODO: Auto-generated Javadoc
/**
 * The Class Review.
 */
public class Review {

	/** The consumer name. */
	private String consumerName;
	
	/** The style id. */
	private String styleId;
	
	/** The title. */
	private String title;
	
	/** The likes. */
	private String likes;
	
	/** The total rating. */
	private String totalRating;
	
	/** The favorites. */
	private String favorites;
	
	/** The suggestions. */
	private String suggestions;
    
    /** The ratings. */
    private Map<String, String> ratings;
    
    /** The review. */
    private String review;
    
	/**
	 * Gets the consumer name.
	 *
	 * @return the consumer name
	 */
	public String getConsumerName() {
		return consumerName;
	}
	
	/**
	 * Sets the consumer name.
	 *
	 * @param consumerName the new consumer name
	 */
	public void setConsumerName(String consumerName) {
		this.consumerName = consumerName;
	}
	
	/**
	 * Gets the style id.
	 *
	 * @return the style id
	 */
	public String getStyleId() {
		return styleId;
	}
	
	/**
	 * Sets the style id.
	 *
	 * @param styleId the new style id
	 */
	public void setStyleId(String styleId) {
		this.styleId = styleId;
	}
	
	/**
	 * Gets the title.
	 *
	 * @return the title
	 */
	public String getTitle() {
		return title;
	}
	
	/**
	 * Sets the title.
	 *
	 * @param title the new title
	 */
	public void setTitle(String title) {
		this.title = title;
	}
	
	/**
	 * Gets the likes.
	 *
	 * @return the likes
	 */
	public String getLikes() {
		return likes;
	}
	
	/**
	 * Sets the likes.
	 *
	 * @param likes the new likes
	 */
	public void setLikes(String likes) {
		this.likes = likes;
	}
	
	/**
	 * Gets the total rating.
	 *
	 * @return the total rating
	 */
	public String getTotalRating() {
		return totalRating;
	}
	
	/**
	 * Sets the total rating.
	 *
	 * @param totalRating the new total rating
	 */
	public void setTotalRating(String totalRating) {
		this.totalRating = totalRating;
	}
	
	/**
	 * Gets the favorites.
	 *
	 * @return the favorites
	 */
	public String getFavorites() {
		return favorites;
	}
	
	/**
	 * Sets the favorites.
	 *
	 * @param favorites the new favorites
	 */
	public void setFavorites(String favorites) {
		this.favorites = favorites;
	}
	
	/**
	 * Gets the suggestions.
	 *
	 * @return the suggestions
	 */
	public String getSuggestions() {
		return suggestions;
	}
	
	/**
	 * Sets the suggestions.
	 *
	 * @param suggestions the new suggestions
	 */
	public void setSuggestions(String suggestions) {
		this.suggestions = suggestions;
	}
	
	/**
	 * Gets the ratings.
	 *
	 * @return the ratings
	 */
	public Map<String, String> getRatings() {
		return ratings;
	}
	
	/**
	 * Sets the ratings.
	 *
	 * @param ratings the ratings
	 */
	public void setRatings(Map<String, String> ratings) {
		this.ratings = ratings;
	}
	
	/**
	 * Gets the review.
	 *
	 * @return the review
	 */
	public String getReview() {
		return review;
	}
	
	/**
	 * Sets the review.
	 *
	 * @param review the new review
	 */
	public void setReview(String review) {
		this.review = review;
	}
    
}
