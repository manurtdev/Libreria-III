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
    @Column(name="idgenero", length = 15, nullable = false)
    Integer idgenero;
    @Column (name="nombregenero", length = 100, nullable = false)
    String nombregenero;

    //RELACIONES AQUIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIII




    //Constructores
    MGeneros(){}

    public MGeneros(Integer idgenero, String nombregenero) {
        this.idgenero = idgenero;
        this.nombregenero = nombregenero;
    }

    //Encapsulamiento
    public Integer getIdgenero() {
        return idgenero;
    }

    public void setIdgenero(Integer idgenero) {
        this.idgenero = idgenero;
    }

    public String getNombregenero() {
        return nombregenero;
    }

    public void setNombregenero(String nombregenero) {
        this.nombregenero = nombregenero;
    }
}
