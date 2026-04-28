package com.Proyecto.libreria.Modelo;

import com.fasterxml.jackson.annotation.JsonBackReference;
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

    @ManyToOne
    @JoinColumn(name = "idlibro", referencedColumnName = "idlibro", insertable = false, updatable = false)
    @JsonBackReference
    MLibros mLibros;

    @OneToMany(mappedBy = "mEjemplares")
    @JsonManagedReference
    List<MDetallePrestamos> mDetallePrestamos;

    MEjemplares(){}
    public MEjemplares(Integer idejemplar, Integer idlibro, String estadoejemplar) {
        this.idejemplar = idejemplar;
        this.idlibro = idlibro;
        this.estadoejemplar = estadoejemplar;
    }
    public Integer getIdejemplar() { return idejemplar; }
    public void setIdejemplar(Integer idejemplar) { this.idejemplar = idejemplar; }
    public Integer getIdlibro() { return idlibro; }
    public void setIdlibro(Integer idlibro) { this.idlibro = idlibro; }
    public String getEstadoejemplar() { return estadoejemplar; }
    public void setEstadoejemplar(String estadoejemplar) { this.estadoejemplar = estadoejemplar; }
}