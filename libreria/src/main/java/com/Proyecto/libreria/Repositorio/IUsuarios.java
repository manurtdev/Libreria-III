package com.Proyecto.libreria.Repositorio;

import com.Proyecto.libreria.Modelo.MUsuarios;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IUsuarios extends JpaRepository<MUsuarios, Integer> {

}
