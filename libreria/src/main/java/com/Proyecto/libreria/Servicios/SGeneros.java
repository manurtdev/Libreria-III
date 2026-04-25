package com.Proyecto.libreria.Servicios;

import com.Proyecto.libreria.Modelo.MGeneros;
import com.Proyecto.libreria.Repositorio.IGeneros;
import com.Proyecto.libreria.Repositorio.IPrestamos;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SGeneros {

    @Autowired
    IGeneros iGeneros;

    public SGeneros(IGeneros iGeneros) {
        this.iGeneros = iGeneros;
    }

   //Adicionar un registro de genero
   public MGeneros adicionarGenero(MGeneros mGeneros) throws Exception{
        try{
            return iGeneros.save(mGeneros);
        } catch (Exception error){
            throw new Exception(error);
        }
   }


   //Consulta de todos los generos registrados
    public List<MGeneros>consultaGeneros()throws Exception{
        try {
            return iGeneros.findAll();
        }catch (Exception error){
            throw new Exception(error);
        }
    }

    //Consulta individual por llave primaria
    public MGeneros consultaporIDGenero(Integer idgenero) throws Exception{
        try {
            Optional<MGeneros>registroEncontrado=iGeneros.findById(idgenero);
            if (registroEncontrado.isPresent())
                return registroEncontrado.get();
            else
                throw new Exception("Género no registrado");
        }catch (Exception error){
            throw new Exception(error);
        }
    }

    //Modificar un genero
    public MGeneros modificarGenero(Integer idgenero, MGeneros mgeneros) throws Exception{
        try {
            Optional<MGeneros>registroEncontrado=iGeneros.findById(idgenero);
            if (registroEncontrado.isPresent()){
                MGeneros nuevoRegistro = registroEncontrado.get();
                nuevoRegistro.setIdgenero(mgeneros.getIdgenero());
                nuevoRegistro.setNombregenero(mgeneros.getNombregenero());

                return iGeneros.save(nuevoRegistro);
            }else
                throw new Exception("No se puede modificar porque el género no ha sido registrado");
        } catch (Exception error) {
            throw new Exception(error);
        }
    }

    //Eliminar un registro de genero
    public Boolean eliminarGenero(Integer idgenero) throws Exception{
        try{
            Optional<MGeneros>registroEncontrado=iGeneros.findById(idgenero);

            if (registroEncontrado.isPresent()){
                iGeneros.deleteById(idgenero);
                return true;
            }else{
                throw new Exception("No se puede eliminar el género porque no está registrado");
            }
        } catch (Exception error) {
            throw new Exception(error);
        }
    }
}
