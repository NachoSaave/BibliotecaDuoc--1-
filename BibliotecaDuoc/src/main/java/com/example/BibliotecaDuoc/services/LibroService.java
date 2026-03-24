package com.example.BibliotecaDuoc.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.BibliotecaDuoc.model.Libro;
import com.example.BibliotecaDuoc.repository.LibroRepository;

@Service
public class LibroService {
    
    @Autowired
    private LibroRepository libroRepository;
    
    public List<Libro> getLibro(){
        return libroRepository.obtenerLibro();
    }

    public Libro saveLibro(Libro libro){
        return libroRepository.guardar(libro);
    }    

    public Libro getLibroID(int id){
        return libroRepository.buscarPorId(id);
    }

    public Libro updateLibro(Libro libro){
        return libroRepository.actualizar(libro);
    }

    public String deleteLibro(int id){
        libroRepository.eliminar(id);
        return "Producto Eliminado";
    }

}
