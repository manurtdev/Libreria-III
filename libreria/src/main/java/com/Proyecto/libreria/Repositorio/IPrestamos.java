package com.Proyecto.libreria.Repositorio;

import com.Proyecto.libreria.Modelo.MPrestamos;
import com.Proyecto.libreria.Modelo.MUsuarios;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IPrestamos extends JpaRepository<MPrestamos, Integer> {
    List<MPrestamos> findByidprestamo (Integer idprestamo);
    List<MPrestamos> findByidusuario (Integer idusuario);
}