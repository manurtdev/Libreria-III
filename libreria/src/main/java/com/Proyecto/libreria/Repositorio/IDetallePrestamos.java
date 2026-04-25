package com.Proyecto.libreria.Repositorio;

import com.Proyecto.libreria.Modelo.MDetallePrestamos;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IDetallePrestamos extends JpaRepository<MDetallePrestamos, Integer> {
    List<MDetallePrestamos> findByiddetalle (Integer iddetalle);
    }