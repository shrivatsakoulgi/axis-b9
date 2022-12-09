package com.example.mongodbjpa.service;

import java.util.List;

import com.example.mongodbjpa.entity.Movie;

public interface MovieService {
	
	Movie getMovieById(String movieId);
	List<Movie> getAllMovies();
	void addMovie(Movie movie);
	void deleteMovieById(String movieId);
	void updateMovie(String movieId,Movie movie);

}
