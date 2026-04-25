package com.Proyecto.libreria.Repositorio;

import com.Proyecto.libreria.Modelo.MLibros;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ILibros extends JpaRepository<MLibros, Integer> {
    // Aquí puedes añadir métodos personalizados más adelante,
    // como buscar por título o por género.

    List<MLibros> findByidlibro(Integer idlibro);
    List<MLibros>findByidgenero(Integer idgenero);
}