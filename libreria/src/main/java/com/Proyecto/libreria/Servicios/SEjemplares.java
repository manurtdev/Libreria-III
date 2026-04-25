package com.Proyecto.libreria.Servicios;

import com.Proyecto.libreria.Modelo.MEjemplares;
import com.Proyecto.libreria.Repositorio.IEjemplares;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SEjemplares {

    @Autowired
    IEjemplares iEjemplares;

    public SEjemplares(IEjemplares iEjemplares) {
        this.iEjemplares = iEjemplares;
    }

    //Adicionar un ejemplar
    public  MEjemplares adicionarEjemplar(MEjemplares mEjemplares) throws Exception{
        try{
            return iEjemplares.save(mEjemplares);
        }catch (Exception error){
            throw new Exception(error.getMessage());
        }
    }
//Consulta de todos los ejemplares
    public List<MEjemplares>consultaGeneralEjemplares() throws Exception{
        try{
            return iEjemplares.findAll();
        }catch (Exception error){
            throw new Exception(error.getMessage());
        }
    }

    //Consulta individual por llave primaria
    public MEjemplares consultaIndividualID(Integer idejemplar) throws Exception{
        try{
            Optional<MEjemplares>registroEncontrado=iEjemplares.findById((idejemplar));

            if (registroEncontrado.isPresent())
                return registroEncontrado.get();
            else throw new Exception("Ejemplar no registrado");
        }catch (Exception error){
            throw new Exception(error.getMessage());
        }
    }

    //Consulta individual por LIBRO(es una obra en general)
    public List<MEjemplares>consultaIndividualIDLibro(Integer idlibro) throws Exception{
        try{
            return iEjemplares.findByidlibro(idlibro);
        }catch (Exception error){
            throw new Exception(error.getMessage()
            );
        }
    }

    //Modificar un registro de usuario
    public MEjemplares modificarEjemplar (Integer idejemplar, MEjemplares mEjemplares) throws Exception{
        try {
            Optional<MEjemplares> registroEncontrado= iEjemplares.findById(idejemplar);
            if (registroEncontrado.isPresent()){
                MEjemplares nuevoRegistro = registroEncontrado.get();
                nuevoRegistro.setIdejemplar(mEjemplares.getIdejemplar());
                nuevoRegistro.setIdlibro(mEjemplares.getIdlibro());
                nuevoRegistro.setEstadoejemplar(mEjemplares.getEstadoejemplar());
                return iEjemplares.save(nuevoRegistro);
            }else
                throw new Exception("No se puede modificar el ejemplar porque no está registrado");
        } catch (Exception error) {
            throw new Exception(error.getMessage());
        }
    }

    //Eliminar un ejemplar
    public Boolean eliminarEjemplar(Integer idejemplar) throws Exception{
        try {
            Optional<MEjemplares>registroEncontrado=iEjemplares.findById(idejemplar);
            if (registroEncontrado.isPresent()){
                iEjemplares.deleteById(idejemplar);
                return true;
            }else{
                throw new Exception("No se pudo eliminar porque el ejemplar no está registrado");
            }
        } catch (Exception error) {
            throw new Exception(error.getMessage());
        }
    }

}