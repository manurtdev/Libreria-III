package com.Proyecto.libreria.Servicios;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SEscuelas {

    @Autowired
    private IEscuelas repositorio;

    public List<MEscuelas> listarTodas() {
        return repositorio.findAll();
    }

    public void guardar(MEscuelas escuela) {
        repositorio.save(escuela);
    }

    public MEscuelas buscarPorId(Integer id) {
        return repositorio.findById(id).orElse(null);
    }

    public void eliminar(Integer id) {
        repositorio.deleteById(id);
    }
}