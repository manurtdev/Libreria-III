package com.Proyecto.libreria.Controlador;

import com.Proyecto.libreria.Modelo.MDetallePrestamos;
import com.Proyecto.libreria.Servicios.SDetallePrestamos;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/detalles")
@CrossOrigin(origins = "*")
public class CDetallePrestamos {
    @Autowired
    SDetallePrestamos sDetallePrestamos;

    @PostMapping
    public ResponseEntity<?> adicionarRegistroDetallePrestamos(@RequestBody MDetallePrestamos mDetalle) {
        try {
            return ResponseEntity.status(HttpStatus.CREATED).body(this.sDetallePrestamos.adicionarRegistroDetallePrestamos(mDetalle));
        } catch (Exception error) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(error.getMessage());
        }
    }

    @GetMapping
    public ResponseEntity<?> consultaGeneralDetallesPrestamos() {
        try {
            return ResponseEntity.status(HttpStatus.OK).body(this.sDetallePrestamos.consultaGeneralDetallePrestamos());
        } catch (Exception error) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(error.getMessage());
        }
    }
}