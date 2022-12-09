package com.example.mongodbjpa.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.mongodbjpa.entity.Movie;
import com.example.mongodbjpa.service.MovieService;

@RestController
@CrossOrigin("http://localhost:3000")
public class MovieController {
	
	@Autowired
	private MovieService movieService;
	
	@GetMapping("/movies")
	public List<Movie> getAllMovies(){
		return movieService.getAllMovies();
	}
	
	@GetMapping("/movie/{movieId}")
	public Movie getMovieById(@PathVariable String movieId) {
		return movieService.getMovieById(movieId);
	}
	
	@PostMapping("/movie")
	public ResponseEntity<String> addMovie(@RequestBody Movie movie){
		movieService.addMovie(movie);
		return new ResponseEntity<String>("Movie added Successfully ..!!",HttpStatus.CREATED);
	}
	
	@DeleteMapping("/movie/{movieId}")
	public ResponseEntity<String> deleteMovieById(@PathVariable String movieId) {
		movieService.deleteMovieById(movieId);
		return new ResponseEntity<String>("Movie Deleted Successfully ..!!",HttpStatus.CREATED);
	}
	
	@PutMapping("/movie/{movieId}")
	public ResponseEntity<String> updateMovie(@PathVariable String movieId,@RequestBody Movie updatedMovie){
		if(!movieId.equals(updatedMovie.getMovieId())) {
			return new ResponseEntity<String>("Movie ID Mismatch..!!",HttpStatus.BAD_REQUEST);
		}else {
		movieService.updateMovie(movieId, updatedMovie);
		return new ResponseEntity<String>("Movie Updated Successfully ..!!",HttpStatus.CREATED);
		}
	}

	
	
	
	
	
	
	
}
