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

    public Libro buscarPorId(int id){
        for (Libro libro : listaLibros){
            if(libro.getId() == id){
                return libro;
            }
        }
        return null;
    }

    public Libro buscarPorIdbn(String isbn){
        for (Libro libro: listaLibros) {
            if (libro.getIsbn().equals(isbn)){
                return libro;
            }

        }
        return null;
    }

    public Libro guardar(Libro lib){
        listaLibros.add(lib);
        return lib;
    }

    public Libro actualizar(Libro lib){
        int id = 0;
        int idPosicion = 0;

        for (int i = 0; i < listaLibros.size(); i++){
            if (listaLibros.get(i).getId() == lib.getId()){
                id = lib.getId();
                idPosicion = 1;
            }
        }

        Libro libro1 = new Libro();
        libro1.setId(id);
        libro1.setTitulo(lib.getTitulo());
        libro1.setAutor(lib.getAutor());
        libro1.setFechaPublicacion(lib.getFechaPublicacion());
        libro1.setEditorial(lib.getEditorial());
        libro1.setIsbn(lib.getIsbn());

        listaLibros.set(idPosicion, libro1);
        return libro1;
    }

    public void eliminar(int id){
        // //alt 1
        // Libro libro = buscarPorId(id);
        // if (libro != null){
        //     listaLibros.remove(libro);
        // }

        //alt 2
        int idPosicion=0;
        for (int i = 0; i < listaLibros.size(); i++){
            if (listaLibros.get(i).getId()== id){
                idPosicion=i;
                break;
            }
        }
        if (idPosicion > 0) {
            listaLibros.remove(idPosicion);            
        }

        // //alt 3
        // listaLibros.removeIf(x -> x.getId() == id);
    }


}
