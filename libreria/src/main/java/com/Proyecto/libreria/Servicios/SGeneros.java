package com.Proyecto.libreria.Servicios;

import com.Proyecto.libreria.Modelo.MGeneros;
import com.Proyecto.libreria.Repositorio.IGeneros;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SGeneros {

    @Autowired
    private IGeneros repositorio;

    public List<MGeneros> listarTodos() {
        return repositorio.findAll();
    }

    public void guardar(MGeneros genero) {
        repositorio.save(genero);
    }

    public MGeneros buscarPorId(Integer id) {
        return repositorio.findById(id).orElse(null);
    }

    public void eliminar(Integer id) {
        repositorio.deleteById(id);
    }
}
