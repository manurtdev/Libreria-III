package com.Proyecto.libreria.Controlador;

import com.Proyecto.libreria.Modelo.MUsuarios;
import com.Proyecto.libreria.Servicios.SUsuarios;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/usuarios")
@CrossOrigin(origins = "*")
public class CUsuarios {

    @Autowired
    private SUsuarios servicio;
    @GetMapping("/listar")
    public List<MUsuarios> listar() {
        return servicio.listarUsuarios();
    }


    @PostMapping("/guardar")
    public String guardar(@RequestBody MUsuarios usuario) {
        servicio.guardarUsuario(usuario);
        return "¡Usuario guardado correctamente!";
    }


    @GetMapping("/buscar/{id}")
    public MUsuarios buscarPorId(@PathVariable Integer id) {
        return servicio.buscarPorId(id);
    }


    @DeleteMapping("/eliminar/{id}")
    public String eliminar(@PathVariable Integer id) {
        servicio.eliminarUsuario(id);
        return "Usuario eliminado con éxito";
    }
}