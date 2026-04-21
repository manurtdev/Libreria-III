package com.Proyecto.libreria.Repositorio;

import com.Proyecto.libreria.Modelo.MPrestamos;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IPrestamos extends JpaRepository<MPrestamos, Integer> {
}