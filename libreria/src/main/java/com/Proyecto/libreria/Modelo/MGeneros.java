package com.Proyecto.libreria.Modelo;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import java.util.List;

@Entity
@Table(name="Generos")
public class MGeneros {
    @Id
    @Column(name="idgenero", length = 15, nullable = false)
    Integer idgenero;
    @Column (name="nombregenero", length = 100, nullable = false)
    String nombregenero;

    @OneToMany(mappedBy = "mGeneros")
    @JsonManagedReference
    List<MLibros> mLibros;

    MGeneros(){}
    public MGeneros(Integer idgenero, String nombregenero) {
        this.idgenero = idgenero;
        this.nombregenero = nombregenero;
    }
    public Integer getIdgenero() { return idgenero; }
    public void setIdgenero(Integer idgenero) { this.idgenero = idgenero; }
    public String getNombregenero() { return nombregenero; }
    public void setNombregenero(String nombregenero) { this.nombregenero = nombregenero; }
}