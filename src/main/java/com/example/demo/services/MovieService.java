package com.example.demo.services;

import java.util.ArrayList;
import java.util.Optional;

import com.example.demo.models.MovieModel;
import com.example.demo.repositories.MovieRepository;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class MovieService {
    @Autowired
    MovieRepository movieRepository;

    public ArrayList<MovieModel> getMovies(){
        return (ArrayList<MovieModel>)movieRepository.findAll();
    }
    
    public MovieModel saveMovie(MovieModel movie){
        return movieRepository.save(movie);
    }



    public boolean deleteMovie(Long id){
        try {
            movieRepository.deleteById(id);
            return true; 
        } catch (Exception e) {
            return false;
        }
    }
}
