package com.example.demo.services;

import java.util.ArrayList;
import java.util.Optional;

import com.example.demo.models.GeneroModel;
import com.example.demo.models.MovieModel;
import com.example.demo.repositories.GeneroRepository;
import com.example.demo.repositories.MovieRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GeneroService {

    @Autowired
    GeneroRepository generoRepository;
    @Autowired
    MovieRepository movieRepository;

    public ArrayList<GeneroModel> getGeneros(){
        return (ArrayList<GeneroModel>)generoRepository.findAll();
    }    

    public GeneroModel saveGenero(GeneroModel genero){
        return generoRepository.save(genero);
    }

    public boolean deleteGenero (Long id){
        try {
            generoRepository.deleteById(id);
            return true;
        } catch (Exception e) {
            return false;
        }
    }
    public boolean addMovie(Long idCharacter, Long idMovie){
        try {
            Optional <GeneroModel> genero = generoRepository.findById(idCharacter);
            Optional <MovieModel> movie = movieRepository.findById(idMovie);
            genero.get().addMovie(movie.get());
            generoRepository.save(genero.get());
            return true;
        } catch (Exception e) {
            return false;
        }
    }
}
