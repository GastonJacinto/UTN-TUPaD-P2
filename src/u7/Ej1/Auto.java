package u7.Ej1;

public class Auto extends Vehiculo {
    private int cantidadPuertas;

    public Auto(String marca, String modelo, int cantidadPuertas) {
        super(marca, modelo); // llama al constructor de Vehiculo
        this.cantidadPuertas = cantidadPuertas;
    }

    @Override
    public void mostrarInfo() {
        super.mostrarInfo(); // reutiliza comportamiento de la superclase
        System.out.println("Puertas: " + cantidadPuertas);
    }
}