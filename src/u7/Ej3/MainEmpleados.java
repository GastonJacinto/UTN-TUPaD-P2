package u7.Ej3;

public class MainEmpleados {
    public static void main(String[] args) {
        Empleado[] empleados = {
                new EmpleadoPlanta("Juan", 350000),
                new EmpleadoTemporal("Ana", 80, 1800)
        };

        for (Empleado e : empleados) {
            System.out.println(e.nombre + " → Sueldo: " + e.calcularSueldo());

            // Clasificacion con instanceof
            if (e instanceof EmpleadoPlanta) {
                System.out.println("Tipo: Planta");
            } else if (e instanceof EmpleadoTemporal) {
                System.out.println("Tipo: Temporal");
            }
        }
    }
}