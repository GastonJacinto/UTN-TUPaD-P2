package u8.Ej2;

import java.util.Scanner;

public class DivisionSegura {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Ingrese numerador: ");
            int n = sc.nextInt();

            System.out.print("Ingrese denominador: ");
            int d = sc.nextInt();

            int resultado = n / d;
            System.out.println("Resultado: " + resultado);

        } catch (ArithmeticException e) {
            System.out.println("Error: No se puede dividir por cero.");
        }
    }
}

