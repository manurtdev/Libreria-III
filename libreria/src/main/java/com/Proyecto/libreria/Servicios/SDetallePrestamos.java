package com.Proyecto.libreria.Servicios;

import com.Proyecto.libreria.Modelo.MDetallePrestamos;
import com.Proyecto.libreria.Repositorio.IDetallePrestamos;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SDetallePrestamos {
    @Autowired
    IDetallePrestamos iDetallePrestamos;

    public SDetallePrestamos(IDetallePrestamos iDetallePrestamos) {
        this.iDetallePrestamos = iDetallePrestamos;
    }

    //Adicionar un registro al detalle de los prestamos
    public MDetallePrestamos adicionarRegistroDetallePrestamos(MDetallePrestamos mDetallePrestamos) throws Exception{
        try{
            return iDetallePrestamos.save(mDetallePrestamos);
        }catch (Exception error){
            throw new Exception(error);
        }
    }

    //Consulta de todos los detalles registrados
    public List<MDetallePrestamos>consultaGeneralDetallePrestamos()throws Exception{
        try {
            return iDetallePrestamos.findAll();
        } catch (Exception error) {
            throw new Exception(error);
        }
    }

    //Consulta individual por la llave primaria del detalle
    public MDetallePrestamos consultaPorIDDetalle(Integer iddetalle) throws Exception{
        try {
            Optional<MDetallePrestamos>registroEncontrado=iDetallePrestamos.findById(iddetalle);
            if (registroEncontrado.isPresent())
                return registroEncontrado.get();
            else
                throw new Exception("Detalle de Prestamo no registrado");
        } catch (Exception error) {
            throw new Exception(error);
        }
    }

    //Modificar un detalle de prestamo
    public MDetallePrestamos modificarDetallePrestamos(Integer iddetalle, MDetallePrestamos mDetallePrestamos) throws Exception {
        try {
            Optional<MDetallePrestamos> registroEncontrado = iDetallePrestamos.findById(iddetalle);
            if (registroEncontrado.isPresent()) {
                MDetallePrestamos nuevoRegistro = registroEncontrado.get();
                nuevoRegistro.setIddetalle(mDetallePrestamos.getIddetalle());
                nuevoRegistro.setIdprestamo(mDetallePrestamos.getIdprestamo());
                nuevoRegistro.setIdejemplar(mDetallePrestamos.getIdejemplar());
                nuevoRegistro.setFechadevolucionreal(mDetallePrestamos.getFechadevolucionreal());

                return iDetallePrestamos.save(nuevoRegistro);
            } else
                throw new Exception("No se puede modificar porque el detalle del prestamo no está registrado");

        } catch (Exception error) {
            throw new Exception(error);
        }
    }

            //Eliminar un registro de prestamo
            public Boolean eliminarDetallePrestamo(Integer iddetalle) throws Exception {
                try {
                    Optional<MDetallePrestamos> registroEncontrado=iDetallePrestamos.findById(iddetalle);
                    if (registroEncontrado.isPresent()) {
                        iDetallePrestamos.deleteById(iddetalle);
                        return true;
                    }else{
                        throw new Exception("No se puede eliminar porque el registro no existe");
                    }
                } catch (Exception error) {
                    throw new RuntimeException(error);
                }
            }







}
