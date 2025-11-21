package u6.java.main.Ej3;

public class MainUniversidad {

    public static void main(String[] args) {

        Universidad u = new Universidad("UTN");

        Profesor p1 = new Profesor("P01","Ana","Sistemas");
        Profesor p2 = new Profesor("P02","Luis","Matemática");
        Profesor p3 = new Profesor("P03","Carlos","Física");

        u.agregarProfesor(p1);
        u.agregarProfesor(p2);
        u.agregarProfesor(p3);

        Curso c1 = new Curso("C01","Programación I");
        Curso c2 = new Curso("C02","BD I");
        Curso c3 = new Curso("C03","Álgebra");
        Curso c4 = new Curso("C04","Física I");
        Curso c5 = new Curso("C05","Análisis I");

        u.agregarCurso(c1);
        u.agregarCurso(c2);
        u.agregarCurso(c3);
        u.agregarCurso(c4);
        u.agregarCurso(c5);

        u.asignarProfesorACurso("C01","P01");
        u.asignarProfesorACurso("C02","P01");
        u.asignarProfesorACurso("C03","P02");
        u.asignarProfesorACurso("C04","P03");

        u.listarCursos();
        System.out.println();

        u.listarProfesores();
        System.out.println();

        u.asignarProfesorACurso("C01","P02");

        u.eliminarCurso("C03");

        u.eliminarProfesor("P03");

        u.listarCursos();
    }
}
