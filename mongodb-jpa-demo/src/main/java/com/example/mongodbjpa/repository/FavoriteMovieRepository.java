package com.example.mongodbjpa.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.mongodbjpa.entity.FavoriteMovie;

@Repository
public interface FavoriteMovieRepository extends MongoRepository<FavoriteMovie, String> {

	@Query("{userName:?0}")
	List<FavoriteMovie> favoriteMoviesByUserName(String userName);
}
