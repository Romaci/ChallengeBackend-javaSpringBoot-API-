package com.example.demo.models;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.*;

@Entity
@Table(name = "personaje")
public class PersonajeModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true, nullable = false)
    private Long id;
    private String img;
    private String nombre;
    private Integer edad;
    private Float peso;
    private String historia;

    // @OneToMany(mappedBy = "personajes")
    // private Set<PeliculaModel> peliculas = new HashSet<>();

    

    public PersonajeModel() {
    }

    public PersonajeModel(String nombre, Integer edad, Float peso, String historia, String img) {
        this.nombre = nombre;
        this.edad = edad;
        this.peso = peso;
        this.historia = historia;
        this.img = img;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public Float getPeso() {
        return peso;
    }

    public void setPeso(Float peso) {
        this.peso = peso;
    }

    public String getHistoria() {
        return historia;
    }

    public void setHistoria(String historia) {
        this.historia = historia;
    }

    // public Set<PeliculaModel> getPeliculas() {
    //     return peliculas;
    // }

    // public void setPeliculas(Set<PeliculaModel> peliculas) {
    //     this.peliculas = peliculas;
    // }

}
