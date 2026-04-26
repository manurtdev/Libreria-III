package com.Proyecto.libreria.Controlador;

import com.Proyecto.libreria.Modelo.MLibros;
import com.Proyecto.libreria.Servicios.SLibros;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/libros")
@CrossOrigin(origins = "*")
public class CLibros {

    @Autowired
    private SLibros sLibros;

    @PostMapping
    public ResponseEntity<?> adicionarRegistroLibro(@RequestBody MLibros mLibros) throws Exception {
        try {
            return ResponseEntity
                    .status(HttpStatus.CREATED)
                    .body(this.sLibros.adicionarRegistroLibro(mLibros));
        } catch (Exception error) {
            return ResponseEntity
                    .status(HttpStatus.BAD_REQUEST)
                    .body(error.getMessage());
        }
    }

    @GetMapping
    public ResponseEntity<?> consultaGeneralLibros() throws Exception {
        try {
            return ResponseEntity
                    .status(HttpStatus.OK)
                    .body(this.sLibros.consultaGeneralLibros());
        } catch (Exception error) {
            return ResponseEntity
                    .status(HttpStatus.BAD_REQUEST)
                    .body(error.getMessage());
        }
    }
}