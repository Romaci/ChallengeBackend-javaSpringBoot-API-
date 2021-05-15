package com.example.demo.repositories;

import com.example.demo.models.PeliculaModel;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PeliculaRepository extends CrudRepository<PeliculaModel, Long> {

}
