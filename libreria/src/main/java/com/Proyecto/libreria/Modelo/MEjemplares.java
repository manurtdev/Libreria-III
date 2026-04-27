package com.Proyecto.libreria.Modelo;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;

import java.util.List;

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
@ManyToOne
@JoinColumn(name = "pkejemplares", referencedColumnName = "idlibro")
@JsonManagedReference
MLibros mLibros;

@OneToMany(mappedBy = "mLibros")
@JoinColumn
List<MDetallePrestamos>mDetallePrestamos;


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
