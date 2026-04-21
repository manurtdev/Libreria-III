package com.Proyecto.libreria.Controlador;

import com.Proyecto.libreria.Modelo.MDetallePrestamos;
import com.Proyecto.libreria.Servicios.SDetallePrestamos;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/detalles")
@CrossOrigin(origins = "*")
public class CDetallePrestamos {

    @Autowired
    private SDetallePrestamos servicio;

    @GetMapping("/listar")
    public List<MDetallePrestamos> listar() {
        return servicio.listarTodos();
    }

    @PostMapping("/guardar")
    public String guardar(@RequestBody MDetallePrestamos detalle) {
        servicio.guardar(detalle);
        return "Detalle de préstamo guardado correctamente";
    }
}
