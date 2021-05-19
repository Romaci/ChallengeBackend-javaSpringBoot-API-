package com.example.demo.controllers;

import java.util.ArrayList;

import com.example.demo.models.PeliculaModel;
import com.example.demo.services.PeliculaService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/movies")
public class PeliculaController {
    
    @Autowired
    PeliculaService peliculaService;

    @GetMapping()
    public ArrayList<PeliculaModel> getPeliculas(){
       return peliculaService.getPeliculas();
    }

    @PostMapping()
    public PeliculaModel savePelicula(@RequestBody PeliculaModel pelicula){
        return peliculaService.savePelicula(pelicula);
    }

    


    @DeleteMapping(path = "/{id}")
    public String deletePelicula(@PathVariable("id") Long id){
        boolean ok = peliculaService.deletePelicula(id);
        if (ok) {
            return "Se elimino pelicula";
        } else {
            return "No se pudo eliminar pelicula";
        }
        
    }
 }
