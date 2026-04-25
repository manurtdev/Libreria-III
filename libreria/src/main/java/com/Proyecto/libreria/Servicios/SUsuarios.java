package com.Proyecto.libreria.Servicios;

import com.Proyecto.libreria.Modelo.MUsuarios;
import com.Proyecto.libreria.Repositorio.IUsuarios;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class SUsuarios {
    @Autowired
    IUsuarios iUsuarios;

    public SUsuarios(IUsuarios iUsuarios) {
        this.iUsuarios = iUsuarios;
    }

    //Adicionar un registro de usuario
    public MUsuarios adicionarRegistroUsuario(MUsuarios mUsuarios) throws Exception {
        try {
            return iUsuarios.save(mUsuarios);
        } catch (Exception error) {
            throw new Exception(error.getMessage());
        }
    }

    // Consulta de todos los registros del usuario
    public List<MUsuarios> consultaGeneralUsuarios() throws Exception {
        try {
            return iUsuarios.findAll();
        } catch (Exception error) {
            throw new Exception(error.getMessage());
        }
    }

    // Consulta individial por llave primaria
    public MUsuarios consultaIndividualID(Integer idusuario) throws Exception {
        try {
            Optional<MUsuarios> registroEncontrado = iUsuarios.findById(idusuario);
            if (registroEncontrado.isPresent())
                return registroEncontrado.get();
            else
                throw new Exception("Usuario no registrado");
        } catch (Exception error) {
            throw new Exception(error.getMessage());
        }
    }

    // Consulta individual por nombre
    public List<MUsuarios> consultaIndividualNombre(String nombreusuario) throws Exception {
        try {
            return iUsuarios.findBynombreusuario(nombreusuario);
        } catch (Exception error) {
            throw new Exception(error.getMessage());
        }
    }

    // Modificar un registro de un usuario
    public MUsuarios modificarUsuario(Integer idusuario, MUsuarios mUsuarios) throws Exception {
        try {
            Optional<MUsuarios> registroEncontrado = iUsuarios.findById(idusuario);
            if (registroEncontrado.isPresent()) {
                MUsuarios nuevoRegistro = registroEncontrado.get();
                nuevoRegistro.setIdusuario(mUsuarios.getIdusuario());
                nuevoRegistro.setNombreusuario(mUsuarios.getNombreusuario());
                nuevoRegistro.setEmailusuario(mUsuarios.getEmailusuario());
                nuevoRegistro.setTelusuario(mUsuarios.getTelusuario());
                return iUsuarios.save(nuevoRegistro);
            } else
                throw new Exception("No se puede modificar porque el usuario no está registrado");
        } catch (Exception error) {
            throw new Exception(error.getMessage());
        }
    }

    // Eliminar un registro un usuario
    public Boolean eliminarUsuario(Integer idusuario) throws Exception {
        try {
            Optional<MUsuarios> registroEncontrado = iUsuarios.findById(idusuario);
            if (registroEncontrado.isPresent()) {
                iUsuarios.deleteById(idusuario);
                return true;
            } else {
                throw new Exception("No se pudo eliminar porque el cliente no está registrado");
            }
        } catch (Exception error) {
            throw new Exception(error.getMessage());
        }
    }
}



