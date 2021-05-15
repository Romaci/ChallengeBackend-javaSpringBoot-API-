package com.example.demo.models;


import javax.persistence.*;

@Entity
@Table(name = "personaje")
public class PersonajeModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true, nullable = false)
    private Long id;


    private String nombre;
    private Integer edad;
    private Float peso; 
    private String historia;

    // @ManyToMany
    // @JoinTable(name="personajes_peliculas", joinColumns = @JoinColumn(name="pesonaje_id"),inverseJoinColumns = @JoinColumn(name="pelicula_id")))
    // private ArrayList<PeliculaModel> peliculas;
    
    
    
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
    // public ArrayList<PeliculaModel> getPeliculas() {
    //     return peliculas;
    // }
    // public void setPeliculas(ArrayList<PeliculaModel> peliculas) {
    //     this.peliculas = peliculas;
    // }

    
}
