package com.Proyecto.libreria.Servicios;

import com.Proyecto.libreria.Modelo.MLibros;
import com.Proyecto.libreria.Repositorio.ILibros;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SLibros {

    @Autowired
    private ILibros repositorio;

    public List<MLibros> listarTodos() {
        return repositorio.findAll();
    }

    public void guardar(MLibros libro) {
        repositorio.save(libro);
    }

    public MLibros buscarPorId(Integer id) {
        return repositorio.findById(id).orElse(null);
    }

    public void eliminar(Integer id) {
        repositorio.deleteById(id);
    }
}
