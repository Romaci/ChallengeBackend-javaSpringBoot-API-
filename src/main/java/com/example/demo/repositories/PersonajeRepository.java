package com.example.demo.repositories;

import com.example.demo.models.PersonajeModel;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonajeRepository extends CrudRepository<PersonajeModel, Long>{
    
}
