package com.example.demo.config;


import java.time.LocalDate;
import java.time.Month;
import java.util.List;


import com.example.demo.models.GeneroModel;
import com.example.demo.models.PeliculaModel;
import com.example.demo.models.PersonajeModel;
import com.example.demo.repositories.GeneroRepository;
import com.example.demo.repositories.PeliculaRepository;
import com.example.demo.repositories.PersonajeRepository;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class Config {

    @Bean
    CommandLineRunner commandLineRunner(PersonajeRepository personajeRepository, PeliculaRepository peliculaRepository,
            GeneroRepository generoRepository) {
        return arg -> {
           
            PeliculaModel frozen = new PeliculaModel("../../../../../../../img/frozen.jpeg", "Frozen",
                    LocalDate.of(2020, Month.OCTOBER, 21));
            PeliculaModel highSchool = new PeliculaModel("../../../../../../../img/hs.jpeg", "High School musical",
                    LocalDate.of(2020, Month.OCTOBER, 21));
            peliculaRepository.saveAll(List.of(frozen, highSchool));

            GeneroModel terror = new GeneroModel("Terror", "../../../../../../../img/terror.jpeg");
            GeneroModel comedia = new GeneroModel("Comedia", "../../../../../../../img/comedia.jpeg");
            generoRepository.saveAll(List.of(terror, comedia));

            PersonajeModel mickey = new PersonajeModel("Mickey Mouse", 90, (float) 12.00,
                    "Mickey Mouse es un personaje ficticio de la serie del mismo nombre, emblema de la compañía Disney. Creado el 18 de noviembre de 1928, este ratón tiene un origen disputado.",
                    "../../../../../../../img/mickey");
            PersonajeModel pluto = new PersonajeModel("Pluto", 90, (float) 12.00,
                    "Pluto es un personaje de ficción que se hizo famoso mediante los cortos de animación de The Walt Disney Company.",
                    "../../../../../../../img/pluto");
            personajeRepository.saveAll(List.of(mickey, pluto));

        };
    }
}
