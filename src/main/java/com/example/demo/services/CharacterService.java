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
    public ArrayList<CharacterModel> getCharacterByName(String nombre){
        ArrayList<CharacterModel> characters = new ArrayList<>();
        ArrayList<CharacterModel> charactersTot = (ArrayList <CharacterModel>)characterRepository.findAll();
        for (CharacterModel character : charactersTot) {
            String aux = character.getNombre();
            boolean ok = aux.equals(nombre);
            if(ok){
                characters.add(character);
            }
        }
        return characters;
    }
    public ArrayList<CharacterModel> getCharacterByAge(Integer age){
        ArrayList<CharacterModel> characters = new ArrayList<>();
        ArrayList<CharacterModel> charactersTot = (ArrayList <CharacterModel>)characterRepository.findAll();
        for (CharacterModel character : charactersTot) {
            if(character.getEdad() == age){
                characters.add(character);
            }
        }
        return characters;
    }
    public ArrayList<CharacterModel> getCharactersInMovie(Long id){
        ArrayList<CharacterModel> characters = new ArrayList<>();
        ArrayList<CharacterModel> charactersTot = (ArrayList <CharacterModel>)characterRepository.findAll();
        for (CharacterModel character : charactersTot) {
            for (MovieModel movie : character.getMovies()) {
                if(movie.getId()==id){
                    characters.add(character);
                }
            }
        }
        return characters;
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
