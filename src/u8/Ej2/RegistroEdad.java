package u8.Ej2;

public class RegistroEdad {
    public static void validarEdad(int edad) throws EdadInvalidaException {
        if (edad < 0 || edad > 120) {
            throw new EdadInvalidaException("Edad fuera de rango permitido.");
        }
    }

    public static void main(String[] args) {
        try {
            validarEdad(40);
        } catch (EdadInvalidaException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
