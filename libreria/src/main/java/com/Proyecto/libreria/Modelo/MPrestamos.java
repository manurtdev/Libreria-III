package com.Proyecto.libreria.Modelo;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.time.LocalDateTime;

@Entity
@Table(name="Prestamos")
public class MPrestamos {
    @Id
    @Column(name="idPrestamo", length = 15, nullable = false)
    Integer idPrestamo;
    @Column(name = "idUsuario",length = 20,nullable = false)
    Integer idUsuario;
    @Column(name = "fechaPrestamo",length = 20,nullable = false)
    LocalDateTime fechaPrestamo;
    @Column(name = "fechaDevolucionEsperada",length = 20,nullable = false)
    LocalDateTime fechaDevolucionEsperada;
    @Column(name = "estadoPrestamo",length = 20,nullable = false)
    String estadoPrestamo;

    //Constructores
    MPrestamos(){}

    public MPrestamos(String estadoPrestamo, LocalDateTime fechaDevolucionEsperada, LocalDateTime fechaPrestamo, Integer idPrestamo, Integer idUsuario) {
        this.estadoPrestamo = estadoPrestamo;
        this.fechaDevolucionEsperada = fechaDevolucionEsperada;
        this.fechaPrestamo = fechaPrestamo;
        this.idPrestamo = idPrestamo;
        this.idUsuario = idUsuario;
    }

    //Encapsulamiento
    public String getEstadoPrestamo() {
        return estadoPrestamo;
    }

    public void setEstadoPrestamo(String estadoPrestamo) {
        this.estadoPrestamo = estadoPrestamo;
    }

    public LocalDateTime getFechaDevolucionEsperada() {
        return fechaDevolucionEsperada;
    }

    public void setFechaDevolucionEsperada(LocalDateTime fechaDevolucionEsperada) {
        this.fechaDevolucionEsperada = fechaDevolucionEsperada;
    }

    public LocalDateTime getFechaPrestamo() {
        return fechaPrestamo;
    }

    public void setFechaPrestamo(LocalDateTime fechaPrestamo) {
        this.fechaPrestamo = fechaPrestamo;
    }

    public Integer getIdPrestamo() {
        return idPrestamo;
    }

    public void setIdPrestamo(Integer idPrestamo) {
        this.idPrestamo = idPrestamo;
    }

    public Integer getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(Integer idUsuario) {
        this.idUsuario = idUsuario;
    }
}
