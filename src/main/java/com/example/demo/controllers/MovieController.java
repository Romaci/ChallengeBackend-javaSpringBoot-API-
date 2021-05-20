package com.example.demo.controllers;

import java.util.ArrayList;
import java.util.Set;

import com.example.demo.models.MovieModel;
import com.example.demo.services.MovieService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping()
public class MovieController {
    
    @Autowired
    MovieService movieService;

    @GetMapping(path ="/movies")
    public ArrayList<MovieModel> getMovies(){
       return movieService.getMovies();
    }

    @GetMapping(path = "/movies/{id}")
    public MovieModel getMovie(@PathVariable("id") Long id){
        return movieService.getMovie(id);
    }

    @PostMapping(path = { "/moviesByName/movies{name}" }) 
    public ArrayList<MovieModel> getMovieByName(@RequestParam("name") String nombre){
        return movieService.getMovieByName(nombre);
    }

    @PostMapping(path ="moviesByGenero/movies{genre}")
    public Set<MovieModel> getMoviesByGenero(@RequestParam("genre")Long idGenero){
        return movieService.getMoviesByGenero(idGenero);
    }

    // @PostMapping(path ="movieInOrder/movies?order=ASC}")
    // public ArrayList<MovieModel> getMoviesInOrderAsc(){
   
    
    // }
    // @PostMapping(path ="movieInOrder/movies?order=DESC}")
    // public ArrayList<MovieModel> getMoviesInOrderDesc(){
   
    // }

    @PostMapping(path = "/movies")
    public MovieModel saveMovie(@RequestBody MovieModel movie){
        return movieService.saveMovie(movie);
    }

    


    @DeleteMapping(path = "/movies/{id}")
    public String deleteMovie(@PathVariable("id") Long id){
        boolean ok = movieService.deleteMovie(id);
        if (ok) {
            return "Se elimino movie";
        } else {
            return "No se pudo eliminar movie";
        }
        
    }
 }
