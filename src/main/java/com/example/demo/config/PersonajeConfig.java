// package com.example.demo.config;

 
// import java.util.List;

// import com.example.demo.models.PersonajeModel;
// import com.example.demo.repositories.PersonajeRepository;

// import org.springframework.boot.CommandLineRunner;
// import org.springframework.context.annotation.Bean;
// import org.springframework.context.annotation.Configuration;

// @Configuration
// public class PersonajeConfig {
    
//     @Bean
//     CommandLineRunner commandLineRunner(PersonajeRepository repository){
//         return arg -> {
//            PersonajeModel mickey = new  PersonajeModel("Mickey Mouse", 90, (float)12.00, "Mickey Mouse es un personaje ficticio de la serie del mismo nombre, emblema de la compañía Disney. Creado el 18 de noviembre de 1928, este ratón tiene un origen disputado.","../../../../../../../img/mickey");
//            PersonajeModel pluto = new  PersonajeModel("Pluto", 90, (float)12.00, "Pluto es un personaje de ficción que se hizo famoso mediante los cortos de animación de The Walt Disney Company.", "../../../../../../../img/pluto");
//            repository.saveAll(List.of(mickey,pluto));
//         };
//     }
// }