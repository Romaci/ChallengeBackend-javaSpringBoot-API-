package com.example.demo.services;

import java.util.ArrayList;
import java.util.Set;

import com.example.demo.models.GeneroModel;
import com.example.demo.models.MovieModel;
import com.example.demo.repositories.GeneroRepository;
import com.example.demo.repositories.MovieRepository;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class MovieService {
    @Autowired
    MovieRepository movieRepository;

    @Autowired
    GeneroRepository generoRepository;

    public ArrayList<MovieModel> getMovies(){
        return (ArrayList<MovieModel>)movieRepository.findAll();
    }
    public MovieModel getMovie(Long id){
        return movieRepository.findById(id).get();
    }

    public ArrayList<MovieModel> getMovieByName(String nombre){
        ArrayList<MovieModel> movies = new ArrayList<>();
        ArrayList<MovieModel> moviesTot = (ArrayList <MovieModel>)movieRepository.findAll();
        for (MovieModel movie : moviesTot) {
            String aux = movie.getTitulo();
            boolean ok = aux.equals(nombre);
            if(ok){
                movies.add(movie);
            }
        }
        return movies;
    }

    public  Set<MovieModel> getMoviesByGenero(Long idGenero){
       
        GeneroModel genero = generoRepository.findById(idGenero).get();
        Set<MovieModel> movies = genero.getMoviesCollection();
        return movies;
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
