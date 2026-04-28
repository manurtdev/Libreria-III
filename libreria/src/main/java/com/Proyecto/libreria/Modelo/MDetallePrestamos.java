package com.Proyecto.libreria.Modelo;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table(name="DetallePrestamos")
public class MDetallePrestamos {
    @Id
    @Column(name="iddetalle", length = 15, nullable = false)
    Integer iddetalle;
    @Column(name="idprestamo", length = 15, nullable = false)
    Integer idprestamo;
    @Column(name="idejemplar", length = 15, nullable = false)
    Integer idejemplar;
    @Column(name = "fechadevolucionreal",length = 20,nullable = false)
    LocalDateTime fechadevolucionreal;

    //RELACIONES CORREGIDAS
    @ManyToOne
    @JoinColumn(name = "idejemplar", referencedColumnName = "idejemplar", insertable = false, updatable = false)
    @JsonBackReference
    MEjemplares mEjemplares;

    @ManyToOne
    @JoinColumn(name = "idprestamo", referencedColumnName = "idprestamo", insertable = false, updatable = false)
    @JsonBackReference
    MPrestamos mPrestamos;


    //Constructores
    MDetallePrestamos(){}
    public MDetallePrestamos(Integer iddetalle, Integer idprestamo, Integer idejemplar, LocalDateTime fechadevolucionreal) {
        this.iddetalle = iddetalle;
        this.idprestamo = idprestamo;
        this.idejemplar = idejemplar;
        this.fechadevolucionreal = fechadevolucionreal;
    }

    //Encapsulamiento
    public Integer getIddetalle() {
        return iddetalle;
    }

    public void setIddetalle(Integer iddetalle) {
        this.iddetalle = iddetalle;
    }

    public Integer getIdprestamo() {
        return idprestamo;
    }

    public void setIdprestamo(Integer idprestamo) {
        this.idprestamo = idprestamo;
    }

    public Integer getIdejemplar() {
        return idejemplar;
    }

    public void setIdejemplar(Integer idejemplar) {
        this.idejemplar = idejemplar;
    }

    public LocalDateTime getFechadevolucionreal() {
        return fechadevolucionreal;
    }

    public void setFechadevolucionreal(LocalDateTime fechadevolucionreal) {
        this.fechadevolucionreal = fechadevolucionreal;
    }
}