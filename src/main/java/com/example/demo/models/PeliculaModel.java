package com.example.demo.models;

import java.util.Date;

import javax.persistence.*;

@Entity
@Table(name = "pelicula")
public class PeliculaModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true, nullable = false)
    private Long id;

    private String img;
    private String titulo;
        private Date fechaCreacion;
    // private ArrayList<PersonajeModel> personajes;

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
    public Date getFechaCreacion() {
        return fechaCreacion;
    }
    public void setFechaCreacion(Date fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

}
