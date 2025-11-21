package u8.Ej1;

public class MainEcommerce {
    public static void main(String[] args) {
        Cliente cliente = new Cliente("Gaston");

        Pedido pedido = new Pedido(cliente);
        pedido.agregarProducto(new Producto("Mouse", 5000));
        pedido.agregarProducto(new Producto("Teclado", 15000));

        double total = pedido.calcularTotal();
        System.out.println("Total del pedido: " + total);

        // Pago con tj con descuento
        TarjetaCredito tarjeta = new TarjetaCredito();
        double conDescuento = tarjeta.aplicarDescuento(total);
        tarjeta.procesarPago(conDescuento);

        // Notificacin por cambio de estado
        pedido.cambiarEstado("ENVIADO");
    }
}
