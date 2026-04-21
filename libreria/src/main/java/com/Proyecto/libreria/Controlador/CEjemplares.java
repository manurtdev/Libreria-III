package com.Proyecto.libreria.Controlador;

import com.Proyecto.libreria.Modelo.MEjemplares;
import com.Proyecto.libreria.Servicios.SEjemplares;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/ejemplares")
@CrossOrigin(origins = "*")
public class CEjemplares {

    @Autowired
    private SEjemplares servicio;

    @GetMapping("/listar")
    public List<MEjemplares> listar() {
        return servicio.listarTodos();
    }

    @PostMapping("/guardar")
    public String guardar(@RequestBody MEjemplares ejemplar) {
        servicio.guardar(ejemplar);
        return "Ejemplar registrado exitosamente";
    }

    @DeleteMapping("/eliminar/{id}")
    public String eliminar(@PathVariable Integer id) {
        servicio.eliminar(id);
        return "Ejemplar eliminado correctamente";
    }
}
