package com.example.BibliotecaDuoc.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Libro {
    
    private int id;
    private String isbn;
    private String titulo;
    private String editorial;
    private int FechaPublicacion;
    private String autor;

}

