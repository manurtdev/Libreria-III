package com.Proyecto.libreria.Servicios;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SRoles {

    @Autowired
    private IRoles repositorio;

    public List<MRoles> listarRoles() {
        return repositorio.findAll();
    }

    public void guardarRol(MRoles rol) {
        repositorio.save(rol);
    }

    public MRoles buscarPorId(Integer id) {
        return repositorio.findById(id).orElse(null);
    }

    public void eliminarRol(Integer id) {
        repositorio.deleteById(id);
    }
}
