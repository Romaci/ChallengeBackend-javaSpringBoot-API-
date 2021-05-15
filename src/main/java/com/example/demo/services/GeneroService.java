package com.example.demo.services;

import java.util.ArrayList;

import com.example.demo.models.GeneroModel;
import com.example.demo.repositories.GeneroRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GeneroService {

    @Autowired
    GeneroRepository generoRepository;

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
}
