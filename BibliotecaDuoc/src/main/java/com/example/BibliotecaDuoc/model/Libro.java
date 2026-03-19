package com.example.BibliotecaDuoc.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Libro {
    private int id, fechaPublicacion;
    private String isbn, titulo, editorial, editor;


}
