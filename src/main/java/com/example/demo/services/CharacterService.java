package com.example.demo.services;

import java.util.ArrayList;
import java.util.Optional;

import com.example.demo.models.CharacterModel;
import com.example.demo.models.MovieModel;
import com.example.demo.repositories.CharacterRepository;
import com.example.demo.repositories.MovieRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CharacterService {

    @Autowired
    CharacterRepository characterRepository;
    @Autowired
    MovieRepository movieRepository;

    public ArrayList<CharacterModel> getCharacters(){
        return (ArrayList<CharacterModel>) characterRepository.findAll();
    }

    public CharacterModel saveCharacter(CharacterModel character){
        return characterRepository.save(character);

    }

    public boolean deleteCharacter(Long id){
        try {
            characterRepository.deleteById(id);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public boolean addMovie(Long idCharacter, Long idMovie){
        try {
            Optional <CharacterModel> character = characterRepository.findById(idCharacter);
            Optional <MovieModel> movie = movieRepository.findById(idMovie);
            character.get().addMovie(movie.get());
            movie.get().addCharacter(character.get());
            characterRepository.save(character.get());
            movieRepository.save(movie.get());
            return true;
        } catch (Exception e) {
            return false;
        }
    }
}
