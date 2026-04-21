package com.Proyecto.libreria.Controlador;

import com.Proyecto.libreria.Modelo.MLibros;
import com.Proyecto.libreria.Servicios.SLibros;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/libros")
@CrossOrigin(origins = "*")
public class CLibros {

    @Autowired
    private SLibros servicio;

    @GetMapping("/listar")
    public List<MLibros> listar() {
        return servicio.listarTodos();
    }

    @PostMapping("/guardar")
    public String guardar(@RequestBody MLibros libro) {
        servicio.guardar(libro);
        return "Libro registrado exitosamente";
    }

    @DeleteMapping("/eliminar/{id}")
    public String eliminar(@PathVariable Integer id) {
        servicio.eliminar(id);
        return "Libro eliminado";
    }
}
