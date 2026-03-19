package com.example.BibliotecaDuoc.repository;

import org.springframework.stereotype.Repository;
import java.util.List;
import java.util.ArrayList; 
import com.example.BibliotecaDuoc.model.Libro;

@Repository
public class LibroRepository {

    private List<Libro>  listaLibros = new ArrayList<>();

    public List<Libro> obtenerLibro(){
        return listaLibros;
    }
}
