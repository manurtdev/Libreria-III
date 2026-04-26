package com.Proyecto.libreria.Controlador;

import com.Proyecto.libreria.Modelo.MEjemplares;
import com.Proyecto.libreria.Servicios.SEjemplares;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/ejemplares")
@CrossOrigin(origins = "*")
public class CEjemplares {
    @Autowired
    SEjemplares sEjemplares;

    @PostMapping
    public ResponseEntity<?> adicionarEjemplar(@RequestBody MEjemplares mEjemplares) {
        try {
            return ResponseEntity.status(HttpStatus.CREATED).body(this.sEjemplares.adicionarEjemplar(mEjemplares));
        } catch (Exception error) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(error.getMessage());
        }
    }

    @GetMapping
    public ResponseEntity<?> consultaGeneralEjemplares() {
        try {
            return ResponseEntity.status(HttpStatus.OK).body(this.sEjemplares.consultaGeneralEjemplares());
        } catch (Exception error) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(error.getMessage());
        }
    }
}