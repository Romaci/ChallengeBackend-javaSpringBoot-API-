package com.example.demo.models;



import java.util.HashSet;
import java.util.Set;

import javax.persistence.*;

@Entity
@Table(name = "generos")
public class GeneroModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "genero_id",unique = true, nullable = false)
    private Long id;

    private String nombre;
    private String img;

    @OneToMany
    private Set<MovieModel> moviesCollection = new HashSet<>();
    
    public GeneroModel() {
    }
    public GeneroModel(String nombre, String img) {
        this.nombre = nombre;
        this.img = img;
    }

    public void addMovie(MovieModel movie){
        moviesCollection.add(movie);
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
