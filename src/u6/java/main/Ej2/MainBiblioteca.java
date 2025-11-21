package u6.java.main.Ej2;

public class MainBiblioteca {

    public static void main(String[] args) {

        Biblioteca b = new Biblioteca("Central");

        Autor a1 = new Autor("A01","Borges","Argentina");
        Autor a2 = new Autor("A02","Rowling","UK");
        Autor a3 = new Autor("A03","García Márquez","Colombia");

        b.agregarLibro("L01","El Aleph",1949,a1);
        b.agregarLibro("L02","Harry Potter 1",1997,a2);
        b.agregarLibro("L03","Harry Potter 2",1998,a2);
        b.agregarLibro("L04","Cien años de soledad",1967,a3);
        b.agregarLibro("L05","El amor en los tiempos del cólera",1985,a3);

        b.listarLibros();
        System.out.println();

        b.buscarLibroPorIsbn("L02").mostrarInfo();
        System.out.println();

        for (Libro l : b.filtrarLibrosPorAnio(1997)) l.mostrarInfo();
        System.out.println();

        b.eliminarLibro("L03");

        System.out.println("Cant total: " + b.obtenerCantidadLibros());

        b.mostrarAutoresDisponibles();
    }
}
