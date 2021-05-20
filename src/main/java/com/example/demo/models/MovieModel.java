package com.example.demo.models;


import java.time.LocalDate;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.*;




@Entity
@Table(name = "movies")
public class MovieModel {
   
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "movie_id",unique = true, nullable = false)
    private Long id;




    public void setId(Long id) {
        this.id = id;
    }

    private String img;
    private String titulo;
    private LocalDate fechaCreacion;
    

    @ManyToMany(mappedBy = "moviesCollection", fetch = FetchType.LAZY)
    private Set<CharacterModel> charactersCollection = new HashSet<>(); 

    public MovieModel() {
    }


    public MovieModel(String img, String titulo, LocalDate fC) {
        this.img = img;
        this.titulo = titulo;
        this.fechaCreacion = fC;
        
    }
    public Long getId() {
        return id;
    }
    public void addCharacter(CharacterModel character){
        this.charactersCollection.add(character);
    }


    public Set<CharacterModel> getCharacters() {
        return charactersCollection;
    }


    public void setCharacters(Set<CharacterModel> characters) {
        this.charactersCollection = characters;
    }

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
