package u6.java.main.Ej2;

import java.util.ArrayList;
import java.util.List;

public class Biblioteca {

    private String nombre;
    private List<Libro> libros = new ArrayList<>();

    public Biblioteca(String nombre) {
        this.nombre = nombre;
    }

    public void agregarLibro(String isbn, String titulo, int anio, Autor autor) {
        libros.add(new Libro(isbn, titulo, anio, autor));
    }

    public void listarLibros() {
        for (Libro l : libros) l.mostrarInfo();
    }

    public Libro buscarLibroPorIsbn(String isbn) {
        for (Libro l : libros) {
            if (l.getIsbn().equals(isbn)) return l;
        }
        return null;
    }

    public void eliminarLibro(String isbn) {
        libros.removeIf(l -> l.getIsbn().equals(isbn));
    }

    public int obtenerCantidadLibros() { return libros.size(); }

    public List<Libro> filtrarLibrosPorAnio(int anio) {
        List<Libro> list = new ArrayList<>();
        for (Libro l : libros) if (l.getAnioPublicacion() == anio) list.add(l);
        return list;
    }

    public void mostrarAutoresDisponibles() {
        for (Libro l : libros) System.out.println(l.getAutor().getId());
    }
}
