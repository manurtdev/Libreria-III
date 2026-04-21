package com.Proyecto.libreria.Modelo;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Usuarios")
public class MUsuarios {
    @Id
    @Column(name = "idUsuario",length = 20,nullable = false)
    Integer idUsuario;
    @Column(name = "nombreUsuario",length = 20,nullable = false)
    String nombreUsuario;
    @Column(name = "telUsuario",length = 20,nullable = false)
    String telUsuario;
    @Column(name = "emailUsuario",length = 50,nullable = false)
    String emailUsuario;


    //Constructores
    MUsuarios(){}

    public MUsuarios(Integer idUsuario, String nombreUsuario, String telUsuario, String emailUsuario) {
        this.idUsuario = idUsuario;
        this.nombreUsuario = nombreUsuario;
        this.telUsuario = telUsuario;
        this.emailUsuario = emailUsuario;
    }

    //Encapsulamiento
    public Integer getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(Integer idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public String getTelUsuario() {
        return telUsuario;
    }

    public void setTelUsuario(String telUsuario) {
        this.telUsuario = telUsuario;
    }

    public String getEmailUsuario() {
        return emailUsuario;
    }

    public void setEmailUsuario(String emailUsuario) {
        this.emailUsuario = emailUsuario;
    }
}
