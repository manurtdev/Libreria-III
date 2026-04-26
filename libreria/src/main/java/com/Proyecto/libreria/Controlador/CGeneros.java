package com.Proyecto.libreria.Controlador;

import com.Proyecto.libreria.Modelo.MGeneros;
import com.Proyecto.libreria.Servicios.SGeneros;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/generos")
@CrossOrigin(origins = "*")
public class CGeneros {
    @Autowired
    SGeneros sGeneros;

    @PostMapping
    public ResponseEntity<?> adicionarGenero(@RequestBody MGeneros mGeneros) {
        try {
            return ResponseEntity.status(HttpStatus.CREATED).body(this.sGeneros.adicionarGenero(mGeneros));
        } catch (Exception error) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(error.getMessage());
        }
    }

    @GetMapping
    public ResponseEntity<?> consultaGeneros() {
        try {
            return ResponseEntity.status(HttpStatus.OK).body(this.sGeneros.consultaGeneros());
        } catch (Exception error) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(error.getMessage());
        }
    }
}
