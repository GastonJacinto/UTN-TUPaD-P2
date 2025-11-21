package u8.Ej1;

import java.util.ArrayList;
import java.util.List;

public class Pedido implements Pagable {
    private List<Producto> productos = new ArrayList<>();
    private String estado;
    private Notificable cliente;

    public Pedido(Notificable cliente) {
        this.cliente = cliente;
        this.estado = "CREADO";
    }

    public void agregarProducto(Producto p) {
        productos.add(p);
    }

    public void cambiarEstado(String nuevoEstado) {
        this.estado = nuevoEstado;
        cliente.notificar("El pedido cambió de estado a: " + nuevoEstado);
    }

    @Override
    public double calcularTotal() {
        double total = 0;
        for (Producto p : productos) {
            total += p.calcularTotal();
        }
        return total;
    }
}
