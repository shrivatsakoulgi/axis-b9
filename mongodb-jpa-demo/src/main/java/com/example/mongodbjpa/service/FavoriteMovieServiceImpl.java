package com.example.mongodbjpa.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.mongodbjpa.entity.FavoriteMovie;
import com.example.mongodbjpa.repository.FavoriteMovieRepository;

@Service
public class FavoriteMovieServiceImpl implements FavoriteMovieService{

	@Autowired
	private FavoriteMovieRepository favoriteMovieRepository;
	@Override
	public List<FavoriteMovie> getAllMovies() {
	
		return favoriteMovieRepository.findAll();
	}

	@Override
	public void addMovie(FavoriteMovie favoriteMovie) {
		favoriteMovieRepository.save(favoriteMovie);
		
	}

	/*
	 * @Override public void deleteMovieByFavoriteMovieId(String favoriteMovieId) {
	 * favoriteMovieRepository.deleteById(favoriteMovieId);
	 * 
	 * }
	 */

	@Override
	public List<FavoriteMovie> favoriteMoviesByUserName(String userName) {
		return favoriteMovieRepository.favoriteMoviesByUserName(userName);
	}

}
