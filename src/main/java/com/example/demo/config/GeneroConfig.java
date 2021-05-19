// package com.example.demo.config;

 
// import java.util.List;

// import com.example.demo.models.GeneroModel;

// import com.example.demo.repositories.GeneroRepository;


// import org.springframework.boot.CommandLineRunner;
// import org.springframework.context.annotation.Bean;
// import org.springframework.context.annotation.Configuration;

// @Configuration
// public class GeneroConfig {
    
//     @Bean
//     CommandLineRunner commandLineRunner3(GeneroRepository repository){
//         return arg -> {
//            GeneroModel terror = new GeneroModel("Terror", "../../../../../../../img/terror.jpeg ");
//            GeneroModel comedia = new GeneroModel("Comedia", "../../../../../../../img/comedia.jpeg");
//            repository.saveAll(List.of(terror,comedia));
//         };
//     }
// }