package com.example.mongodbjpa.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Movie {
	@Id
	private String movieId;
	private String title;
	private double imdb;
	private String imageUrl;
	private String description;
		
	public Movie() {
	}

	public Movie(String movieId, String title, double imdb, String imageUrl, String description) {
		this.movieId = movieId;
		this.title = title;
		this.imdb = imdb;
		this.imageUrl = imageUrl;
		this.description = description;
	}

	public String getMovieId() {
		return movieId;
	}

	public void setMovieId(String movieId) {
		this.movieId = movieId;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public double getImdb() {
		return imdb;
	}

	public void setImdb(double imdb) {
		this.imdb = imdb;
	}

	public String getImageUrl() {
		return imageUrl;
	}

	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Override
	public String toString() {
		return "Movie [movieId=" + movieId + ", title=" + title + ", imdb=" + imdb + ", imageUrl=" + imageUrl
				+ ", description=" + description + "]";
	}
	
	
	

}
