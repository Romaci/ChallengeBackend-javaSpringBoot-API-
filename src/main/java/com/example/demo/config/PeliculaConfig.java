// package com.example.demo.config;

 
// import java.time.LocalDate;
// import java.time.Month;
// import java.util.List;

// import com.example.demo.models.PeliculaModel;
// import com.example.demo.repositories.PeliculaRepository;

// import org.springframework.boot.CommandLineRunner;
// import org.springframework.context.annotation.Bean;
// import org.springframework.context.annotation.Configuration;

// @Configuration
// public class PeliculaConfig {
    
//     @Bean
//     CommandLineRunner commandLineRunner2(PeliculaRepository repository){
//         return arg -> {
//            PeliculaModel frozen = new PeliculaModel("../../../../../../../img/frozen.jpeg","Frozen", LocalDate.of(2020,Month.OCTOBER,21));
//            PeliculaModel highSchool = new PeliculaModel("../../../../../../../img/hs.jpeg","High School musical", LocalDate.of(2020,Month.OCTOBER,21));
//            repository.saveAll(List.of(frozen,highSchool));
//         };
//     }
// }