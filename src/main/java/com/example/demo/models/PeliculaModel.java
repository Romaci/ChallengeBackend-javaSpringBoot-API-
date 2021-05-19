package com.example.demo.models;


import java.time.LocalDate;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.*;

@Entity
@Table(name = "pelicula")
public class PeliculaModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "pelicula_id",unique = true, nullable = false)
    private Long id;

    private String img;
    private String titulo;
    private LocalDate fechaCreacion;
    

    // @OneToMany
    // private Set<PersonajeModel> personajes = new HashSet<>(); 

    public PeliculaModel() {
    }

    public PeliculaModel(String img, String titulo, LocalDate fechaCreacion) {
        this.img = img;
        this.titulo = titulo;
        this.fechaCreacion = fechaCreacion;
    }

    // public Set<PersonajeModel> getPersonajes() {
    //     return personajes;
    // }


    // public void setPersonajes(Set<PersonajeModel> personajes) {
    //     this.personajes = personajes;
    // }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public LocalDate getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(LocalDate fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

}
