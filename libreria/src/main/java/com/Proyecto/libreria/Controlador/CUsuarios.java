package com.Proyecto.libreria.Controlador;

import com.Proyecto.libreria.Modelo.MUsuarios;
import com.Proyecto.libreria.Servicios.SUsuarios;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/usuarios")
@CrossOrigin(origins = "*")
public class CUsuarios {

    @Autowired
    SUsuarios sUsuarios;

    // Adicionar un registro usuario
    @PostMapping
    public ResponseEntity<?> adicionarRegistroUsuario(@RequestBody MUsuarios mUsuarios) throws Exception {
        try {
            return ResponseEntity
                    .status(HttpStatus.CREATED)
                    .body(this.sUsuarios.adicionarRegistroUsuario(mUsuarios));
        } catch (Exception error) {
            return ResponseEntity
                    .status(HttpStatus.BAD_REQUEST)
                    .body(error.getMessage());
        }
    }

    // Consulta de todos los registros
    @GetMapping
    public ResponseEntity<?> consultaGeneralUsuarios() throws Exception {
        try {
            return ResponseEntity
                    .status(HttpStatus.OK)
                    .body(this.sUsuarios.consultaGeneralUsuarios());
        } catch (Exception error) {
            return ResponseEntity
                    .status(HttpStatus.BAD_REQUEST)
                    .body(error.getMessage());
        }
    }

    // Consulta individual por ID
    @GetMapping("/{idUsuario}")
    public ResponseEntity<?> consultaIndividualID(@PathVariable Integer idUsuario) throws Exception {
        try {
            return ResponseEntity
                    .status(HttpStatus.OK)
                    .body(this.sUsuarios.consultaIndividualID(idUsuario));
        } catch (Exception error) {
            return ResponseEntity
                    .status(HttpStatus.BAD_REQUEST)
                    .body(error.getMessage());
        }
    }

    // Eliminar un registro
    @DeleteMapping("/{idUsuario}")
    public ResponseEntity<?> eliminarUsuario(@PathVariable Integer idUsuario) throws Exception {
        try {
            return ResponseEntity
                    .status(HttpStatus.OK)
                    .body(this.sUsuarios.eliminarUsuario(idUsuario));
        } catch (Exception error) {
            return ResponseEntity
                    .status(HttpStatus.BAD_REQUEST)
                    .body(error.getMessage());
        }
    }
}