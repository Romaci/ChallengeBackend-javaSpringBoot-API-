package com.example.demo.models;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.*;

@Entity
@Table(name = "characters")
public class CharacterModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "character_id",unique = true, nullable = false)
    private Long id;
    private String img;
    private String nombre;
    private Integer edad;
    private Integer peso;
    private String historia;

    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(name = "characters_movies",
            joinColumns = {
                    @JoinColumn(name = "character_id", referencedColumnName = "character_id")},
            inverseJoinColumns = {
                    @JoinColumn(name = "movie_id", referencedColumnName = "movie_id")})
    private Set<MovieModel> moviesCollection = new HashSet<>();

    public CharacterModel() {
    }

    public CharacterModel(String img, String nombre, int edad, int peso, String historia) {
        this.img = img;
        this.nombre = nombre;
        this.edad = edad;
        this.peso = peso;
        this.historia = historia;
    }


    public void addMovie(MovieModel movie){
        moviesCollection.add(movie);
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

    public Integer getPeso() {
        return peso;
    }

    public void setPeso(Integer peso) {
        this.peso = peso;
    }

    public String getHistoria() {
        return historia;
    }

    public void setHistoria(String historia) {
        this.historia = historia;
    }

    public Set<MovieModel> getMovies() {
        return moviesCollection;
    }

    public void setMovies(Set<MovieModel> movies) {
        this.moviesCollection = movies;
    }

}
