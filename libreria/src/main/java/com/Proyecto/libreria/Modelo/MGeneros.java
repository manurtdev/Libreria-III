package com.Proyecto.libreria.Modelo;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Generos")
public class MGeneros {

    //Atributos
    @Id
    @Column(name="idGenero", length = 15, nullable = false)
    Integer idGenero;
    @Column (name="nombreGenero", length = 100, nullable = false)
    String nombreGenero;

    //Constructores
    MGeneros(){}

    public MGeneros(Integer idGenero, String nombreGenero) {
        this.idGenero = idGenero;
        this.nombreGenero = nombreGenero;
    }

    //Encapsulamiento
    public Integer getIdGenero() {
        return idGenero;
    }

    public void setIdGenero(Integer idGenero) {
        this.idGenero = idGenero;
    }

    public String getNombreGenero() {
        return nombreGenero;
    }

    public void setNombreGenero(String nombreGenero) {
        this.nombreGenero = nombreGenero;
    }
}
