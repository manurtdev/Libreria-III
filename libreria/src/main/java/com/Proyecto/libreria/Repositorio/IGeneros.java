package com.Proyecto.libreria.Repositorio;

import com.Proyecto.libreria.Modelo.MGeneros;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IGeneros extends JpaRepository<MGeneros, Integer> {
    List<MGeneros> findByidgenero (Integer idgenero);
}