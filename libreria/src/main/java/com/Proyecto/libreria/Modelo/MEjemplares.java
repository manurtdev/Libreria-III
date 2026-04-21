package com.Proyecto.libreria.Modelo;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Ejemplares")
public class MEjemplares {
    @Id
    @Column(name="idEjemplares", length = 15, nullable = false)
    Integer idEjemplares;
    @Column(name="idLibro", length = 15, nullable = false)
    Integer idLibro;
    @Column(name="estadoEjemplar", length = 15, nullable = false)
    String estadoEjemplar;

    //Constructores
    MEjemplares(){}

    public MEjemplares(String estadoEjemplar, Integer idEjemplares, Integer idLibro) {
        this.estadoEjemplar = estadoEjemplar;
        this.idEjemplares = idEjemplares;
        this.idLibro = idLibro;
    }

    //Encapsulamiento
    public String getEstadoEjemplar() {
        return estadoEjemplar;
    }

    public void setEstadoEjemplar(String estadoEjemplar) {
        this.estadoEjemplar = estadoEjemplar;
    }

    public Integer getIdEjemplares() {
        return idEjemplares;
    }

    public void setIdEjemplares(Integer idEjemplares) {
        this.idEjemplares = idEjemplares;
    }

    public Integer getIdLibro() {
        return idLibro;
    }

    public void setIdLibro(Integer idLibro) {
        this.idLibro = idLibro;
    }
}
