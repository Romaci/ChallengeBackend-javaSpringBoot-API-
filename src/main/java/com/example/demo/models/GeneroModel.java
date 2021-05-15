package com.example.demo.models;



import javax.persistence.*;

@Entity
@Table(name = "genero")
public class GeneroModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true, nullable = false)
    private Long id;

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
    private String nombre;
    private String img;


    // private ArrayList<PeliculaModel> peliculas;
    
}
