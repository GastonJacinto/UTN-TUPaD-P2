package u7.Ej2;
public class MainFiguras {
    public static void main(String[] args) {
        Figura[] figuras = {
                new Circulo(4),
                new Rectangulo(5, 3)
        };

        for (Figura f : figuras) {
            System.out.println(f.nombre + " → Area: " + f.calcularArea());
        }
    }
}