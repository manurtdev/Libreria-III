package com.Proyecto.libreria.Servicios;

import com.Proyecto.libreria.Modelo.MDetallePrestamos;
import com.Proyecto.libreria.Repositorio.IDetallePrestamos;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SDetallePrestamos {

    @Autowired
    private IDetallePrestamos repositorio;

    public List<MDetallePrestamos> listarTodos() {
        return repositorio.findAll();
    }

    public void guardar(MDetallePrestamos detalle) {
        repositorio.save(detalle);
    }

    public MDetallePrestamos buscarPorId(Integer id) {
        return repositorio.findById(id).orElse(null);
    }

    public void eliminar(Integer id) {
        repositorio.deleteById(id);
    }
}
