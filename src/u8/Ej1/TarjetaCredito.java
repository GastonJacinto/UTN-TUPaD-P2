package u8.Ej1;

public class TarjetaCredito implements Pago, PagoConDescuento {
    @Override
    public void procesarPago(double monto) {
        System.out.println("Procesando pago con tarjeta de crédito: " + monto);
    }

    @Override
    public double aplicarDescuento(double monto) {
        return monto * 0.90; // 10% de descuento
    }
}
