package com.example.demo.repositories;


import com.example.demo.models.CharacterModel;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CharacterRepository extends CrudRepository<CharacterModel, Long>{
    
}
