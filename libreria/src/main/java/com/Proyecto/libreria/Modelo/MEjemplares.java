package com.Proyecto.libreria.Modelo;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Ejemplares")
public class MEjemplares {
    @Id
    @Column(name="idejemplar", length = 15, nullable = false)
    Integer idejemplar;
    @Column(name="idlibro", length = 15, nullable = false)
    Integer idlibro;
    @Column(name="estadoejemplar", length = 15, nullable = false)
    String estadoejemplar;

    //RELACIONES AQUIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIII



    //Constructores
    MEjemplares(){}

    public MEjemplares(Integer idejemplar, Integer idlibro, String estadoejemplar) {
        this.idejemplar = idejemplar;
        this.idlibro = idlibro;
        this.estadoejemplar = estadoejemplar;
    }

    //Encapsulamiento
    public Integer getIdejemplar() {
        return idejemplar;
    }

    public void setIdejemplar(Integer idejemplar) {
        this.idejemplar = idejemplar;
    }

    public Integer getIdlibro() {
        return idlibro;
    }

    public void setIdlibro(Integer idlibro) {
        this.idlibro = idlibro;
    }

    public String getEstadoejemplar() {
        return estadoejemplar;
    }

    public void setEstadoejemplar(String estadoejemplar) {
        this.estadoejemplar = estadoejemplar;
    }
}
