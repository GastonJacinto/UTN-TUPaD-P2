package u7.Ej4;

public class MainAnimales {
    public static void main(String[] args) {
        Animal[] animales = {
                new Perro(),
                new Gato(),
                new Vaca()
        };

        for (Animal a : animales) {
            a.hacerSonido(); // polimorfismo
        }
    }
}