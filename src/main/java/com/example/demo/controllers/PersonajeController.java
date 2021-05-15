package com.example.demo.controllers;

import java.util.ArrayList;

import com.example.demo.services.PersonajeService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.models.PersonajeModel;

@RestController
@RequestMapping("/characters")
public class PersonajeController {
    @Autowired
    PersonajeService personajeService;

    @GetMapping()
    public ArrayList<PersonajeModel> getPersonaje() {
        return personajeService.getPersonajes();
    }

    @PostMapping()
    public PersonajeModel savePersonaje(@RequestBody PersonajeModel personaje) {
        return personajeService.savePersonaje(personaje);
    }

    @DeleteMapping(path = "/{id}")
    public String deleteById(@PathVariable("id") Long id) {
        boolean ok = personajeService.deletePersonaje(id);
        if (ok) {
            return "Se elimino personaje";
        } else {
            return "No se pudo eliminar personaje";
        }
    }
}
