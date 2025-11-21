package u6.java.main.Ej2;

public class Autor {

    private String id;
    private String nombre;
    private String nacionalidad;

    public Autor(String id, String nombre, String nacionalidad) {
        this.id = id;
        this.nombre = nombre;
        this.nacionalidad = nacionalidad;
    }

    public String getId() { return id; }

    public void mostrarInfo() {
        System.out.println(nombre + " (" + nacionalidad + ")");
    }
}
