package com.Proyecto.libreria.Modelo;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.time.LocalDateTime;

@Entity
@Table(name="DetallePrestamos")
public class MDetallePrestamos {
    @Id
    @Column(name="idDetalle", length = 15, nullable = false)
    Integer idDetalle;
    @Column(name="idPrestamo", length = 15, nullable = false)
    Integer idPrestamo;
    @Column(name="idEjemplares", length = 15, nullable = false)
    Integer idEjemplares;
    @Column(name = "fechaDevolucionReal",length = 20,nullable = false)
    LocalDateTime fechaDevolucionReal;

    //Constructores
    MDetallePrestamos(){}

    public MDetallePrestamos(LocalDateTime fechaDevolucionReal, Integer idDetalle, Integer idEjemplares, Integer idPrestamo) {
        this.fechaDevolucionReal = fechaDevolucionReal;
        this.idDetalle = idDetalle;
        this.idEjemplares = idEjemplares;
        this.idPrestamo = idPrestamo;
    }


    //Encapsulamiento
    public LocalDateTime getFechaDevolucionReal() {
        return fechaDevolucionReal;
    }

    public void setFechaDevolucionReal(LocalDateTime fechaDevolucionReal) {
        this.fechaDevolucionReal = fechaDevolucionReal;
    }

    public Integer getIdDetalle() {
        return idDetalle;
    }

    public void setIdDetalle(Integer idDetalle) {
        this.idDetalle = idDetalle;
    }

    public Integer getIdEjemplares() {
        return idEjemplares;
    }

    public void setIdEjemplares(Integer idEjemplares) {
        this.idEjemplares = idEjemplares;
    }

    public Integer getIdPrestamo() {
        return idPrestamo;
    }

    public void setIdPrestamo(Integer idPrestamo) {
        this.idPrestamo = idPrestamo;
    }
}
