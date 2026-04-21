package com.Proyecto.libreria.Modelo;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Libros")
public class MLibros {
    @Id
    @Column(name="idlibro", length = 15, nullable = false)
    Integer idlibro;
    @Column (name="titulolibro", length = 50, nullable = false)
    String titulolibro;
    @Column(name="idgenero", length = 15, nullable = false)
    Integer idgenero;

    //RELACIONES AQUIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIII




    //Constructores
    MLibros(){}
    public MLibros(Integer idlibro, String titulolibro, Integer idgenero) {
        this.idlibro = idlibro;
        this.titulolibro = titulolibro;
        this.idgenero = idgenero;
    }

    //Encapsulamiento
    public Integer getIdlibro() {
        return idlibro;
    }

    public void setIdlibro(Integer idlibro) {
        this.idlibro = idlibro;
    }

    public String getTitulolibro() {
        return titulolibro;
    }

    public void setTitulolibro(String titulolibro) {
        this.titulolibro = titulolibro;
    }

    public Integer getIdgenero() {
        return idgenero;
    }

    public void setIdgenero(Integer idgenero) {
        this.idgenero = idgenero;
    }
}
