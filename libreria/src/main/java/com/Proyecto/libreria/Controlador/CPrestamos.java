package com.Proyecto.libreria.Controlador;

import com.Proyecto.libreria.Modelo.MPrestamos;
import com.Proyecto.libreria.Servicios.SPrestamo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/prestamos")
@CrossOrigin(origins = "*")
public class CPrestamos {
    @Autowired
    SPrestamo sPrestamo;

    @PostMapping
    public ResponseEntity<?> adicionarRegistroPrestamo(@RequestBody MPrestamos mPrestamos) {
        try {
            return ResponseEntity.status(HttpStatus.CREATED).body(this.sPrestamo.adicionarRegistroPrestamo(mPrestamos));
        } catch (Exception error) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(error.getMessage());
        }
    }

    @GetMapping
    public ResponseEntity<?> consultaGeneralPrestamos() {
        try {
            return ResponseEntity.status(HttpStatus.OK).body(this.sPrestamo.consultaGeneralPrestamos());
        } catch (Exception error) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(error.getMessage());
        }
    }
}