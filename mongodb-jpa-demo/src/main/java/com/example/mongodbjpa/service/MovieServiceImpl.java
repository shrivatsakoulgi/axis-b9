package com.example.mongodbjpa.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.mongodbjpa.entity.Movie;
import com.example.mongodbjpa.repository.MovieRepository;
@Service
public class MovieServiceImpl implements MovieService {

	@Autowired
	private MovieRepository movieRepository;
	
	@Override
	public Movie getMovieById(String movieId) {	
		return movieRepository.findById(movieId).get();
	}

	@Override
	public List<Movie> getAllMovies() {
		return movieRepository.findAll();
	}

	@Override
	public void addMovie(Movie movie) {	
		movieRepository.save(movie);
	}

	@Override
	public void deleteMovieById(String movieId) {		
		movieRepository.deleteById(movieId);
	}

	@Override
	public void updateMovie(String movieId, Movie movie) {
		// Call Save() method to overwrite existing MongoDB Document
		movieRepository.save(movie);
	}

}
