package com.Proyecto.libreria.Servicios;

import com.Proyecto.libreria.Modelo.MPrestamos;
import com.Proyecto.libreria.Repositorio.IPrestamos;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SPrestamos {

    @Autowired
    private IPrestamos repositorio;

    public List<MPrestamos> listarTodos() {
        return repositorio.findAll();
    }

    public void guardar(MPrestamos prestamo) {
        repositorio.save(prestamo);
    }

    public MPrestamos buscarPorId(Integer id) {
        return repositorio.findById(id).orElse(null);
    }

    public void eliminar(Integer id) {
        repositorio.deleteById(id);
    }
}