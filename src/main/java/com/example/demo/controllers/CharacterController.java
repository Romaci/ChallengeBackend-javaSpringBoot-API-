package com.example.demo.controllers;

import java.util.ArrayList;
import java.util.Optional;

import com.example.demo.services.CharacterService;
import com.example.demo.services.MovieService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.models.CharacterModel;
import com.example.demo.models.MovieModel;

@RestController
@RequestMapping(path = "characters")
public class CharacterController {
    @Autowired
    CharacterService characterService;
    MovieService movieService;
    @GetMapping()
    public ArrayList<CharacterModel> getCharacter() {
        return characterService.getCharacters();
    }

    @PostMapping()
    public CharacterModel saveCharacter(@RequestBody CharacterModel character) {
        return characterService.saveCharacter(character);
    }

    @DeleteMapping(path = "/{id}")
    public String deleteById(@PathVariable("id") Long id) {
        boolean ok = characterService.deleteCharacter(id);
        if (ok) {
            return "Se elimino character";
        } else {
            return "No se pudo eliminar character";
        }
    }

    @PutMapping(path = "/query")
    public String addMovie(@RequestParam("id_character") Long idCharacter, @RequestParam("id_movie") Long idMovie){
       boolean ok = characterService.addMovie(idCharacter, idMovie);
        if(ok){
           return "Se cargó movie con exito";
       }
       else{
           return "No se pudo cargar movie";
       }
    }



}
