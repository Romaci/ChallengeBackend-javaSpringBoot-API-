package com.example.demo.services;

import java.util.ArrayList;

import com.example.demo.models.PeliculaModel;
import com.example.demo.repositories.PeliculaRepository;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class PeliculaService {
    @Autowired
    PeliculaRepository peliculaRepository;

    public ArrayList<PeliculaModel> getPeliculas(){
        return (ArrayList<PeliculaModel>)peliculaRepository.findAll();
    }
    
    public PeliculaModel savePelicula(PeliculaModel pelicula){
        return peliculaRepository.save(pelicula);
    }

    public boolean deletePelicula(Long id){
        try {
            peliculaRepository.deleteById(id);
            return true; 
        } catch (Exception e) {
            return false;
        }
    }
}
