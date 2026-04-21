package com.Proyecto.libreria.Controlador;

import com.Proyecto.libreria.Modelo.MPrestamos;
import com.Proyecto.libreria.Servicios.SPrestamos;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/prestamos")
@CrossOrigin(origins = "*")
public class CPrestamos {

    @Autowired
    private SPrestamos servicio;

    @GetMapping("/listar")
    public List<MPrestamos> listar() {
        return servicio.listarTodos();
    }

    @PostMapping("/guardar")
    public String guardar(@RequestBody MPrestamos prestamo) {
        servicio.guardar(prestamo);
        return "Préstamo registrado correctamente";
    }
}