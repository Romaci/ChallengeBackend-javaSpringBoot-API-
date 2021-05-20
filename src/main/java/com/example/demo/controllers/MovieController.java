package com.example.demo.controllers;

import java.util.ArrayList;

import com.example.demo.models.MovieModel;
import com.example.demo.services.MovieService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path ="movies")
public class MovieController {
    
    @Autowired
    MovieService movieService;

    @GetMapping()
    public ArrayList<MovieModel> getMovies(){
       return movieService.getMovies();
    }

    @GetMapping(path = "/{id}")
    public MovieModel getMovie(@PathVariable("id") Long id){
        return movieService.getMovie(id);
    }

    @PostMapping()
    public MovieModel saveMovie(@RequestBody MovieModel movie){
        return movieService.saveMovie(movie);
    }

    


    @DeleteMapping(path = "/{id}")
    public String deleteMovie(@PathVariable("id") Long id){
        boolean ok = movieService.deleteMovie(id);
        if (ok) {
            return "Se elimino movie";
        } else {
            return "No se pudo eliminar movie";
        }
        
    }
 }
