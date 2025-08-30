package u1;//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {


        System.out.println("¡Hola, Java!");

        // Variable declaration
        String name = "Gastón";
        int edad = 25;
        double height = 176.5;
        boolean student = true;
        System.out.printf("Nombre: %s, Edad: %d, Altura: %.1f, Estudiante: %b%n",
                name, edad, height, student);
       // exFour();
        exSix();
    }

    public static void exFour() {

        Scanner sc =  new Scanner(System.in);
        System.out.println("Ingresa tu edad: ");
        int age = sc.nextInt();
        sc.nextLine(); // Limpiar el buffer
        System.out.println("Dime tu nombre: ");
        String name = sc.nextLine();

        System.out.println("Name: "+name+", age: "+age);

    }
    public static void exFive() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa dos números enteros: ");
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();

        int sum = n1 + n2;
        int res = n1 - n2;
        int mult = n1*n2;

        String div = n2 != 0 ? String.valueOf(n1 / n2) : "Can't divide by 0.";
        System.out.println("Suma: "+ sum+", Resta: "+res+", Mult: "+mult+", Div: "+ div);

    }  public static void exSix() {
       String name = "Juan Pérez";
       int age = 30;
       String address = "Calle Falsa 123";

        System.out.println("Nombre: "+ name+ "\nEdad: "+age+"\nDirección: "+ address
        );


    }
    public static void exSeven() {

       int x = 10; // Esto es una instrucción.
       x = x+5; //Esto es una expresión.
        System.out.println(x); //Esto es una instrucción.
        // La diferencia es que una expresión por si sola no realiza una acción, sino que solo calcula un resultado, mientras que una instrucción puede tener una o más expresiones.

    }

        public static void exEightA() {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Ingresa el primer número entero: ");
            int num1 = scanner.nextInt();

            System.out.print("Ingresa el segundo número entero: ");
            int num2 = scanner.nextInt();

            // División entera: se trunca el decimal
            int resultado = num1 / num2;

            System.out.println("Resultado (división entera): " + resultado);
        }
        public static void exEightB() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa el primer número (double): ");
        double num1 = scanner.nextDouble();

        System.out.print("Ingresa el segundo número (double): ");
        double num2 = scanner.nextDouble();

        // División con decimales
        double resultado = num1 / num2;

        System.out.println("Resultado (división con decimales): " + resultado);
        }
        public static void exNine() {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Ingresa tu nombre: ");
           // String badName = scanner.nextInt(); // ERROR: nextIt se usa para leer enteros, no texto.
            String goodName = scanner.nextLine(); // Esto sería lo correcto
            System.out.println("Hola, " + goodName);
        }
        public static void exTen() {
        int a = 5;
        int b = 2;
        int resultado = a / b;
        System.out.println("Resultado: " + resultado); // En este caso el resultado es 2 porque se mantiene el entero, no la parte decimal.
        }
}


