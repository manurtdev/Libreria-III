package com.Proyecto.libreria.Repositorio;

import com.Proyecto.libreria.Modelo.MEjemplares;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IEjemplares extends JpaRepository<MEjemplares, Integer> {
    List<MEjemplares>findByidejemplar(Integer idejemplar);
    List<MEjemplares>findByidlibro(Integer idlibro);
}
