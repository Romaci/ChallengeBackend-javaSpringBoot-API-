package com.example.demo.models;



import java.util.HashSet;
import java.util.Set;

import javax.persistence.*;

@Entity
@Table(name = "genero")
public class GeneroModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true, nullable = false)
    private Long id;

    private String nombre;
    private String img;

    // @OneToMany()
    // private Set<PeliculaModel> peliculas = new HashSet<>();
    
    public GeneroModel() {
    }
    // public Set<PeliculaModel> getPeliculas() {
    //     return peliculas;
    // }
    // public void setPeliculas(Set<PeliculaModel> peliculas) {
    //     this.peliculas = peliculas;
    // }
    public GeneroModel(String nombre, String img) {
        this.nombre = nombre;
        this.img = img;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getImg() {
        return img;
    }
    public void setImg(String img) {
        this.img = img;
    }

    
    
}
