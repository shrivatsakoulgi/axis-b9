package com.example.mongodbjpa.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class FavoriteMovie {

	@Id
	private String serialNumber;
	private String userName;
	private String favoriteMovieId;
	
	public FavoriteMovie() {
	}

	public FavoriteMovie(String serialNumber, String userName, String favoriteMovieId) {
		this.serialNumber = serialNumber;
		this.userName = userName;
		this.favoriteMovieId = favoriteMovieId;
	}

	public String getSerialNumber() {
		return serialNumber;
	}

	public void setSerialNumber(String serialNumber) {
		this.serialNumber = serialNumber;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getFavoriteMovieId() {
		return favoriteMovieId;
	}

	public void setFavoriteMovieId(String favoriteMovieId) {
		this.favoriteMovieId = favoriteMovieId;
	}

	@Override
	public String toString() {
		return "FavoriteMovie [serialNumber=" + serialNumber + ", userName=" + userName + ", favoriteMovieId="
				+ favoriteMovieId + "]";
	}
	
	
	
	
}
