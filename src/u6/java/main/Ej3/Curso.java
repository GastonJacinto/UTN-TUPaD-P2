package u6.java.main.Ej3;

public class Curso {

    private String codigo;
    private String nombre;
    private Profesor profesor;

    public Curso(String codigo, String nombre) {
        this.codigo = codigo;
        this.nombre = nombre;
    }

    public String getCodigo() { return codigo; }

    public String getNombre() { return nombre; }

    public Profesor getProfesor() { return profesor; }

    public void setProfesor(Profesor nuevo) {
        if (profesor == nuevo) return;

        Profesor anterior = profesor;
        profesor = nuevo;

        if (anterior != null) {
            anterior.quitarCursoInterno(this);
        }

        if (nuevo != null) {
            nuevo.agregarCursoInterno(this);
        }
    }

    public void mostrarInfo() {
        System.out.println(codigo + " - " + nombre +
                (profesor != null ? " Profesor: " + profesor.getId() : " Sin profesor"));
    }
}

