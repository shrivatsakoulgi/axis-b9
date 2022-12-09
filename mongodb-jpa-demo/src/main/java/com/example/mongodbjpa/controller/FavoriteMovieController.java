package com.example.mongodbjpa.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.mongodbjpa.entity.FavoriteMovie;
import com.example.mongodbjpa.service.FavoriteMovieService;

@RestController
@CrossOrigin("http://localhost:3000")
public class FavoriteMovieController {
	
	@Autowired
	private FavoriteMovieService favoriteMovieService;
	
	@GetMapping("/favorite-movies")
	public List<FavoriteMovie> getAllMovies(){
		return favoriteMovieService.getAllMovies();
	}
	
	@GetMapping("/favorite-movie/{userName}")
	public List<FavoriteMovie> getMovieById(@PathVariable String userName) {
		return favoriteMovieService.favoriteMoviesByUserName(userName);
	}
	
	@PostMapping("/favorite-movie")
	public ResponseEntity<String> addMovie(@RequestBody FavoriteMovie favoriteMovie){
		favoriteMovieService.addMovie(favoriteMovie);
		return new ResponseEntity<String>("Favorite Movie added Successfully ..!!",HttpStatus.CREATED);
	}

}
