package com.example.demo;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.time.Month;
import java.util.List;

import com.example.demo.models.*;
import com.example.demo.repositories.*;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication

public class DemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

    @Bean
    public CommandLineRunner mappingDemo(MovieRepository movieRepository, CharacterRepository characterRepository,
            GeneroRepository generoRepository) {
        return args -> {
            Path ruta = Paths.get("src/main/resources/img");
            String rutaS = ruta.toString();
            MovieModel frozen = new MovieModel(rutaS + "/frozen.jpeg", "Frozen", LocalDate.of(2020, Month.OCTOBER, 21));
            // MovieModel highSchool = new MovieModel(rutaS + "/hs.jpeg", "High School musical",
            //         LocalDate.of(2020, Month.OCTOBER, 21));
            // MovieModel mulan = new MovieModel(rutaS + "/mulan.jpeg", "Mulan", LocalDate.of(2020, Month.OCTOBER, 21));
            // MovieModel toyStory = new MovieModel(rutaS + "/toy.jpeg", "Toy Story",
            //         LocalDate.of(2020, Month.OCTOBER, 21));

            GeneroModel terror = new GeneroModel("Terror", rutaS + "/terror.jpeg");
            // GeneroModel comedia = new GeneroModel("Comedia", rutaS + "/comedia.jpeg");
            // GeneroModel cF = new GeneroModel("Ciencia Ficcion", rutaS + "/cF.jpeg");
            // GeneroModel drama = new GeneroModel("Drama", rutaS + "/drama.jpeg");

            CharacterModel mickey = new CharacterModel("Mickey Mouse", rutaS + "/mickey", 90, 12,
                    "Mickey Mouse es un character ficticio de la serie del mismo nombre, emblema de la compañía Disney. Creado el 18 de noviembre de 1928, este ratón tiene un origen disputado.");
            // CharacterModel pluto = new CharacterModel("Pluto", rutaS + "/pluto", 90, 12,
            //         "Pluto es un character de ficción que se hizo famoso mediante los cortos de animación de The Walt Disney Company.");
            // CharacterModel mini = new CharacterModel("Minie", rutaS + "/minie", 90, 12,
            // "Minnie is sweet in nature and fun-loving. She is widely recognized by her pink or red polka-dot hair bow.");
            // CharacterModel pato = new CharacterModel("Pato Donald", rutaS + "/pato", 90, 12,
            //         "El Pato Donald es un personaje de Disney, caracterizado como un pato blanco antropomórfico de ojos celestes, pico, piernas y pies anaranjados.");
            // generoRepository.saveAll(List.of(terror, comedia,drama,cF));
            // movieRepository.saveAll(List.of(frozen, highSchool, toyStory,mulan));
            // characterRepository.saveAll(List.of(mickey, pluto,mickey,mini));
            movieRepository.saveAll(List.of(frozen));
            characterRepository.saveAll(List.of(mickey));
            generoRepository.saveAll(List.of(terror));
        };
    }

}
