package com.example.mongodbjpa.service;

import java.util.List;

import com.example.mongodbjpa.entity.FavoriteMovie;

public interface FavoriteMovieService {

	List<FavoriteMovie> getAllMovies();
	void addMovie(FavoriteMovie favoriteMovie);
	//void deleteMovieByFavoriteMovieId(String favoriteMovieId);
	List<FavoriteMovie> favoriteMoviesByUserName(String userName);

}
