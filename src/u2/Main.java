package u2;//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
import java.util.Scanner;

public class Main {

    static Scanner sc = new Scanner(System.in);

    public static void exOne() {
        System.out.print("Ingrese un año: ");
        int year = sc.nextInt();
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            System.out.println("El año " + year + " es bisiesto.");
        } else {
            System.out.println("El año " + year + " no es bisiesto.");
        }
    }


    public static void exTwo() {
        System.out.print("Ingrese el primer número: ");
        int a = sc.nextInt();
        System.out.print("Ingrese el segundo número: ");
        int b = sc.nextInt();
        System.out.print("Ingrese el tercer número: ");
        int c = sc.nextInt();
        int mayor = a;
        if (b > mayor) mayor = b;
        if (c > mayor) mayor = c;
        System.out.println("El mayor es: " + mayor);
    }


    public static void exThree() {
        System.out.print("Ingrese su edad: ");
        int edad = sc.nextInt();
        if (edad < 12) System.out.println("Eres un Niño.");
        else if (edad <= 17) System.out.println("Eres un Adolescente.");
        else if (edad <= 59) System.out.println("Eres un Adulto.");
        else System.out.println("Eres un Adulto mayor.");
    }

    public static void exFour() {
        System.out.print("Ingrese el precio del producto: ");
        double precio = sc.nextDouble();
        System.out.print("Ingrese la categoría del producto (A, B o C): ");
        char cat = sc.next().toUpperCase().charAt(0);
        double descuento = 0;
        switch (cat) {
            case 'A': descuento = 0.10; break;
            case 'B': descuento = 0.15; break;
            case 'C': descuento = 0.20; break;
            default: System.out.println("Categoría inválida"); return;
        }
        double precioFinal = precio - (precio * descuento);
        System.out.println("Descuento aplicado: " + (descuento * 100) + "%");
        System.out.println("Precio final: " + precioFinal);
    }

    public static void exFive() {
        int suma = 0, num;
        do {
            System.out.print("Ingrese un número (0 para terminar): ");
            num = sc.nextInt();
            if (num % 2 == 0) suma += num;
        } while (num != 0);
        System.out.println("La suma de los números pares es: " + suma);
    }

    public static void exSix() {
        int positivos = 0, negativos = 0, ceros = 0;
        for (int i = 1; i <= 10; i++) {
            System.out.print("Ingrese el número " + i + ": ");
            int num = sc.nextInt();
            if (num > 0) positivos++;
            else if (num < 0) negativos++;
            else ceros++;
        }
        System.out.println("Resultados:");
        System.out.println("Positivos: " + positivos);
        System.out.println("Negativos: " + negativos);
        System.out.println("Ceros: " + ceros);
    }

    public static void exSeven() {
        int nota;
        do {
            System.out.print("Ingrese una nota (0-10): ");
            nota = sc.nextInt();
            if (nota < 0 || nota > 10)
                System.out.println("Error: Nota inválida. Ingrese una nota entre 0 y 10.");
        } while (nota < 0 || nota > 10);
        System.out.println("Nota guardada correctamente.");
    }

    public static void exEight() {
        System.out.print("Ingrese el precio base del producto: ");
        double base = sc.nextDouble();
        System.out.print("Ingrese el impuesto en porcentaje: ");
        double imp = sc.nextDouble() / 100;
        System.out.print("Ingrese el descuento en porcentaje: ");
        double desc = sc.nextDouble() / 100;
        double precioFinal = calcularPrecioFinal(base, imp, desc);
        System.out.println("El precio final del producto es: " + precioFinal);
    }

    public static double calcularPrecioFinal(double base, double impuesto, double descuento) {
        return base + (base * impuesto) - (base * descuento);
    }

    public static void exNine() {
        System.out.print("Ingrese el precio del producto: ");
        double precio = sc.nextDouble();
        System.out.print("Ingrese el peso del paquete en kg: ");
        double peso = sc.nextDouble();
        System.out.print("Ingrese la zona de envío (Nacional/Internacional): ");
        String zona = sc.next();
        double costoEnvio = calcularCostoEnvio(peso, zona);
        double total = calcularTotalCompra(precio, costoEnvio);
        System.out.println("El costo de envío es: " + costoEnvio);
        System.out.println("El total a pagar es: " + total);
    }

    public static double calcularCostoEnvio(double peso, String zona) {
        if (zona.equalsIgnoreCase("Nacional")) return peso * 5;
        else return peso * 10;
    }

    public static double calcularTotalCompra(double precioProducto, double costoEnvio) {
        return precioProducto + costoEnvio;
    }

    public static void exTen() {
        System.out.print("Ingrese el stock actual del producto: ");
        int stockActual = sc.nextInt();
        System.out.print("Ingrese la cantidad vendida: ");
        int vendida = sc.nextInt();
        System.out.print("Ingrese la cantidad recibida: ");
        int recibida = sc.nextInt();
        int nuevoStock = actualizarStock(stockActual, vendida, recibida);
        System.out.println("El nuevo stock del producto es: " + nuevoStock);
    }

    public static int actualizarStock(int stockActual, int vendida, int recibida) {
        return stockActual - vendida + recibida;
    }

    static double descuentoGlobal = 0.10;

    public static void exEleven() {
        System.out.print("Ingrese el precio del producto: ");
        double precio = sc.nextDouble();
        calcularDescuentoEspecial(precio);
    }

    public static void calcularDescuentoEspecial(double precio) {
        double descuentoAplicado = precio * descuentoGlobal;
        double precioFinal = precio - descuentoAplicado;
        System.out.println("El descuento especial aplicado es: " + descuentoAplicado);
        System.out.println("El precio final con descuento es: " + precioFinal);
    }

    public static void exTwelve() {
        double[] precios = {199.99, 299.5, 149.75, 399.0, 89.99};
        System.out.println("Precios originales:");
        for (double p : precios) System.out.println("Precio: $" + p);
        precios[2] = 129.99;
        System.out.println("Precios modificados:");
        for (double p : precios) System.out.println("Precio: $" + p);
    }

    public static void exThirteen() {
        double[] precios = {199.99, 299.5, 149.75, 399.0, 89.99};
        System.out.println("Precios originales:");
        imprimirRecursivo(precios, 0);
        precios[2] = 129.99;
        System.out.println("Precios modificados:");
        imprimirRecursivo(precios, 0);
    }

    public static void imprimirRecursivo(double[] arr, int index) {
        if (index >= arr.length) return;
        System.out.println("Precio: $" + arr[index]);
        imprimirRecursivo(arr, index + 1);
    }

    public static void main(String[] args) {
//        exOne();
//        exTwo();
//        exThree();
//        exFour();
//        exFive();
//        exSix();
//        exSeven();
//        exEight();
//        exNine();
//        exTen();
//        exEleven();
//        exTwelve();
        exThirteen();
    }
}
