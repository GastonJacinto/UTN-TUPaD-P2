package u6.java.main.Ej3;

import java.util.ArrayList;
import java.util.List;
public class Profesor {

    private String id;
    private String nombre;
    private String especialidad;
    List<Curso> cursos = new ArrayList<>();

    public Profesor(String id, String nombre, String especialidad) {
        this.id = id;
        this.nombre = nombre;
        this.especialidad = especialidad;
    }

    // llamado SOLO desde Curso
    void agregarCursoInterno(Curso c) {
        if (!cursos.contains(c)) cursos.add(c);
    }

    // llamado SOLO desde Curso
    void quitarCursoInterno(Curso c) {
        cursos.remove(c);
    }

    public void agregarCurso(Curso c) {
        c.setProfesor(this);
    }

    public void eliminarCurso(Curso c) {
        c.setProfesor(null);
    }

    public void listarCursos() {
        for (Curso c : cursos)
            System.out.println(c.getCodigo() + " - " + c.getNombre());
    }

    public String getId() {
        return id;
    }

    public void mostrarInfo() {
        System.out.println(nombre + " (" + especialidad + ") Cursos: " + cursos.size());
    }
}
