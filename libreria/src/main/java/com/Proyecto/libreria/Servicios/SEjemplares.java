package com.Proyecto.libreria.Servicios;

import com.Proyecto.libreria.Modelo.MEjemplares;
import com.Proyecto.libreria.Repositorio.IEjemplares;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SEjemplares {

    @Autowired
    private IEjemplares repositorio;

    public List<MEjemplares> listarTodos() {
        return repositorio.findAll();
    }

    public void guardar(MEjemplares ejemplar) {
        repositorio.save(ejemplar);
    }

    public MEjemplares buscarPorId(Integer id) {
        return repositorio.findById(id).orElse(null);
    }

    public void eliminar(Integer id) {
        repositorio.deleteById(id);
    }
}