package com.Proyecto.libreria.Controlador;

import com.Proyecto.libreria.Modelo.MGeneros;
import com.Proyecto.libreria.Servicios.SGeneros;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/generos")
@CrossOrigin(origins = "*")
public class CGeneros {

    @Autowired
    private SGeneros servicio;

    @GetMapping("/listar")
    public List<MGeneros> listar() {
        return servicio.listarTodos();
    }

    @PostMapping("/guardar")
    public String guardar(@RequestBody MGeneros genero) {
        servicio.guardar(genero);
        return "Género guardado correctamente";
    }
}
