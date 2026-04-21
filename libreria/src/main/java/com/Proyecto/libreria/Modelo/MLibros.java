package com.Proyecto.libreria.Modelo;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Libros")
public class MLibros {
    @Id
    @Column(name="idLibro", length = 15, nullable = false)
    Integer idLibro;
    @Column (name="tituloLibro", length = 50, nullable = false)
    String tituloLibro;
    @Column(name="idGenero", length = 15, nullable = false)
    Integer idGenero;

    //Constructores
    MLibros(){}

    public MLibros(Integer idGenero, Integer idLibro, String tituloLibro) {
        this.idGenero = idGenero;
        this.idLibro = idLibro;
        this.tituloLibro = tituloLibro;
    }

    //Encapsulamiento
    public Integer getIdGenero() {
        return idGenero;
    }

    public void setIdGenero(Integer idGenero) {
        this.idGenero = idGenero;
    }

    public Integer getIdLibro() {
        return idLibro;
    }

    public void setIdLibro(Integer idLibro) {
        this.idLibro = idLibro;
    }

    public String getTituloLibro() {
        return tituloLibro;
    }

    public void setTituloLibro(String tituloLibro) {
        this.tituloLibro = tituloLibro;
    }
}
