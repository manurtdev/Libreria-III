package com.Proyecto.libreria.Servicios;

import com.Proyecto.libreria.Modelo.MLibros;
import com.Proyecto.libreria.Repositorio.ILibros;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SLibros {

    @Autowired
    ILibros iLibros;

    public SLibros(ILibros iLibros) {
        this.iLibros = iLibros;
    }

    //Adicionar un registro de libro
    public MLibros adicionarRegistroLibro(MLibros mLibros) throws Exception{
        try {
            return iLibros.save(mLibros);
        }catch (Exception error){
            throw new Exception(error.getMessage());
        }
    }

    //Consulta de todos los registros de libros
    public List<MLibros>consultaGeneralLibros(Integer idlibro) throws Exception{
        try {
            return iLibros.findAll();
        }catch (Exception error){
            throw new Exception(error.getMessage());
        }
    }
    //Modificara un registro de libro
    public MLibros modificarLibro(Integer idlibro, MLibros mLibros) throws Exception{
        try {
            Optional<MLibros>registroEncontrado=iLibros.findById(idlibro);
            if (registroEncontrado.isPresent()){
                MLibros nuevoRegistro=registroEncontrado.get();
                nuevoRegistro.setIdlibro(mLibros.getIdlibro());
                nuevoRegistro.setTitulolibro(mLibros.getTitulolibro());
                nuevoRegistro.setIdgenero(mLibros.getIdgenero());
                return  iLibros.save(nuevoRegistro);
            }else
                throw new Exception("No se pued modificar porque el libro no está registrado");
        }catch (Exception error){
            throw new Exception(error.getMessage());
        }

    }

    //Eliminar un registro de libro
    public Boolean eliminarLibro(Integer idlibro) throws Exception{
        try{
            Optional<MLibros>registroEncontrado=iLibros.findById(idlibro);
            if (registroEncontrado.isPresent()){
                iLibros.deleteById(idlibro);
                return true;
            }else {
                throw new Exception("No se pudo eliminar porque el cliente no está registrado");
            }
        }catch (Exception error){
            throw new Exception(error.getMessage());
        }
    }
}
