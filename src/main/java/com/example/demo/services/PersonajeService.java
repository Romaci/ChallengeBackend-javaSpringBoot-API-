package com.example.demo.services;

import java.util.ArrayList;

import com.example.demo.models.PersonajeModel;
import com.example.demo.repositories.PersonajeRepository;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonajeService {

    @Autowired
    PersonajeRepository personajeRepository;

    public ArrayList<PersonajeModel> getPersonajes(){
        return (ArrayList<PersonajeModel>)personajeRepository.findAll();
    }

    public PersonajeModel savePersonaje(PersonajeModel personaje){
        return personajeRepository.save(personaje);

    }

    public boolean deletePersonaje(Long id){
        try {
            personajeRepository.deleteById(id);
            return true;
        } catch (Exception e) {
            return false;
        }
    }
}
