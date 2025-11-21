package u8.Ej1;

public class PayPal implements Pago {
    @Override
    public void procesarPago(double monto) {
        System.out.println("Procesando pago vía PayPal: " + monto);
    }
}
