package com.Proyecto.libreria.Servicios;


import com.Proyecto.libreria.Repositorio.IPrestamos;
import com.Proyecto.libreria.Modelo.MPrestamos;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SPrestamo {
    @Autowired
    IPrestamos iPrestamos;

    public SPrestamo(IPrestamos iPrestamos){
        this.iPrestamos=iPrestamos;
    }


    //Adicionar un registro a prestamo
    public MPrestamos adicionarRegistroPrestamo(MPrestamos mprestamos) throws Exception{
        try{
            return iPrestamos.save(mprestamos);
        } catch (Exception error) {
            throw new Exception(error);
        }
    }

    //Consulta de todos los prestamos registrados
    public List<MPrestamos>consultaGeneralPrestamos() throws Exception{
        try {
            return iPrestamos.findAll();
        } catch (Exception error) {
            throw new Exception(error);
        }
    }

    //Consulta individual por llave primaria del prestamo
    public MPrestamos consultaPorIDPrestamo(Integer idprestamo) throws Exception{
        try {
            Optional<MPrestamos>registroEncontrado=iPrestamos.findById(idprestamo);
            if (registroEncontrado.isPresent())
                return registroEncontrado.get();
            else
                throw new Exception("Prestamo no registrado");
        } catch (Exception error) {
            throw new Exception(error);
        }
    }

    //Modificar un prestamo
    public MPrestamos modificarPrestamo(Integer idprestamo, MPrestamos mPrestamos) throws Exception {
        try {
            Optional<MPrestamos> registroEncontrado = iPrestamos.findById(idprestamo);
            if (registroEncontrado.isPresent()) {
                MPrestamos nuevoRegistro = registroEncontrado.get();
                nuevoRegistro.setIdprestamo(mPrestamos.getIdprestamo());
                nuevoRegistro.setIdusuario(mPrestamos.getIdusuario());
                nuevoRegistro.setFechaprestamo(mPrestamos.getFechaprestamo());
                nuevoRegistro.setFechadevolucionesperada(mPrestamos.getFechadevolucionesperada());
                nuevoRegistro.setEstadoprestamo(mPrestamos.getEstadoprestamo());

                return iPrestamos.save(nuevoRegistro);
            }else
                throw new Exception("No se puede modificar porque el prestamo no está registrado");
        } catch (Exception error) {
            throw new Exception(error);
        }
    }

    // Eliminar un registro de prestamo
    public Boolean eliminarPrestamo(Integer idprestamo) throws Exception {
        try {
            Optional<MPrestamos> registroEncontrado = iPrestamos.findById(idprestamo);

            if (registroEncontrado.isPresent()) {
                iPrestamos.deleteById(idprestamo);
                return true;
            } else {
                throw new Exception("No se puede eliminar porque no existe el préstamo");
            }
        } catch (Exception error) {
            throw new Exception(error.getMessage());
        }
    }
}
