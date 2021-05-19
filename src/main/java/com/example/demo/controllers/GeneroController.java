package com.example.demo.controllers;

import java.util.ArrayList;

import com.example.demo.models.GeneroModel;
import com.example.demo.services.GeneroService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "generos")
public class GeneroController {
    
    @Autowired
    GeneroService generoService;

    @GetMapping()
    public ArrayList<GeneroModel> getGeneros(){
        return generoService.getGeneros();
    }

    @PostMapping()
    public GeneroModel saveGenero(@RequestBody GeneroModel genero){
        return generoService.saveGenero(genero);
    }

    

    @DeleteMapping(path = "/{id}")
    public String deleteGenero(@PathVariable("id") Long id){
        boolean ok = generoService.deleteGenero(id);
        if (ok) {
            return "Se elimino genero";
        } else {
            return "No se pudo eliminar genero";
        }
    }
}
