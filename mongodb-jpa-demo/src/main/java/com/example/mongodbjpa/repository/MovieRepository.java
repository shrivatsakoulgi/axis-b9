package com.example.mongodbjpa.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.example.mongodbjpa.entity.Movie;

@Repository
public interface MovieRepository extends MongoRepository<Movie, String>{

}
