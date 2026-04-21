package com.Proyecto.libreria.Servicios;

import com.Proyecto.libreria.Modelo.MUsuarios;
import com.Proyecto.libreria.Repositorio.IUsuarios;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SUsuarios {

    @Autowired
    private IUsuarios repositorio; // Inyectamos tu interfaz


    public List<MUsuarios> listarUsuarios() {
        return repositorio.findAll();
    }


    public void guardarUsuario(MUsuarios usuario) {
        repositorio.save(usuario);
    }


    public MUsuarios buscarPorId(Integer id) {
        return repositorio.findById(id).orElse(null);
    }


    public void eliminarUsuario(Integer id) {
        repositorio.deleteById(id);
    }
}
