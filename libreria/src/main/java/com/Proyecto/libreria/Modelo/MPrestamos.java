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
    @Column(name="idprestamo", length = 15, nullable = false)
    Integer idprestamo;
    @Column(name = "idusuario",length = 20,nullable = false)
    Integer idusuario;
    @Column(name = "fechaprestamo",length = 20,nullable = false)
    LocalDateTime fechaprestamo;
    @Column(name = "fechadevolucionesperada",length = 20,nullable = false)
    LocalDateTime fechadevolucionesperada;
    @Column(name = "estadoprestamo",length = 20,nullable = false)
    String estadoprestamo;

    //RELACIONES AQUIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIII




    //Constructores
    MPrestamos(){}

    public MPrestamos(Integer idprestamo, Integer idusuario, LocalDateTime fechaprestamo, LocalDateTime fechaDevolucionEsperada, String estadoPrestamo) {
        this.idprestamo = idprestamo;
        this.idusuario = idusuario;
        this.fechaprestamo = fechaprestamo;
        this.fechadevolucionesperada = fechaDevolucionEsperada;
        this.estadoprestamo = estadoPrestamo;
    }

    //Encapsulamiento
    public Integer getIdprestamo() {
        return idprestamo;
    }

    public void setIdprestamo(Integer idprestamo) {
        this.idprestamo = idprestamo;
    }

    public Integer getIdusuario() {
        return idusuario;
    }

    public void setIdusuario(Integer idusuario) {
        this.idusuario = idusuario;
    }

    public LocalDateTime getFechaprestamo() {
        return fechaprestamo;
    }

    public void setFechaprestamo(LocalDateTime fechaprestamo) {
        this.fechaprestamo = fechaprestamo;
    }

    public LocalDateTime getFechadevolucionesperada() {
        return fechadevolucionesperada;
    }

    public void setFechadevolucionesperada(LocalDateTime fechadevolucionesperada) {
        this.fechadevolucionesperada = fechadevolucionesperada;
    }

    public String getEstadoprestamo() {
        return estadoprestamo;
    }

    public void setEstadoprestamo(String estadoprestamo) {
        this.estadoprestamo = estadoprestamo;
    }
}
