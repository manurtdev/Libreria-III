package com.Proyecto.libreria.Modelo;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name="Usuarios")
public class MUsuarios {
    @Id
    @Column(name = "idusuario",length = 20,nullable = false)
    Integer idusuario;
    @Column(name = "nombreusuario",length = 20,nullable = false)
    String nombreusuario;
    @Column(name = "telusuario",length = 20,nullable = false)
    String telusuario;
    @Column(name = "emailusuario",length = 50,nullable = false)
    String emailusuario;

    //RELACIONES AQUIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIII
    @OneToMany(mappedBy = "mUsuarios")
    @JsonManagedReference
    List<MPrestamos> mPrestamos;


    //Constructores
    MUsuarios(){}

    public MUsuarios(Integer idusuario, String nombreusuario, String telusuario, String emailusuario) {
        this.idusuario = idusuario;
        this.nombreusuario = nombreusuario;
        this.telusuario = telusuario;
        this.emailusuario = emailusuario;
    }

    //Encapsulamiento

    public Integer getIdusuario() {
        return idusuario;
    }

    public void setIdusuario(Integer idusuario) {
        this.idusuario = idusuario;
    }

    public String getNombreusuario() {
        return nombreusuario;
    }

    public void setNombreusuario(String nombreusuario) {
        this.nombreusuario = nombreusuario;
    }

    public String getTelusuario() {
        return telusuario;
    }

    public void setTelusuario(String telusuario) {
        this.telusuario = telusuario;
    }

    public String getEmailusuario() {
        return emailusuario;
    }

    public void setEmailusuario(String emailusuario) {
        this.emailusuario = emailusuario;
    }
}
