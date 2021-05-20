package com.example.demo.repositories;

import com.example.demo.models.CharacterModel;
import com.example.demo.models.MovieModel;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MovieRepository extends CrudRepository<MovieModel, Long> {

}
