package u7.Ej3;

public class EmpleadoPlanta extends Empleado {
    private double salarioMensual;

    public EmpleadoPlanta(String nombre, double salarioMensual) {
        super(nombre);
        this.salarioMensual = salarioMensual;
    }

    @Override
    public double calcularSueldo() {
        return salarioMensual;
    }
}