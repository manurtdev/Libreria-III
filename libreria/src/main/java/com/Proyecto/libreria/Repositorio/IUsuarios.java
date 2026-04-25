package com.Proyecto.libreria.Repositorio;

import com.Proyecto.libreria.Modelo.MUsuarios;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IUsuarios extends JpaRepository<MUsuarios, Integer> {
    List<MUsuarios> findBynombreusuario (String nombreusuario);
    List<MUsuarios> findByidusuario (Integer idusuario);
}
