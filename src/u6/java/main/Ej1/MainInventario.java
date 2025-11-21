package u6.java.main.Ej1;

public class MainInventario {

    public static void main(String[] args) {

        Inventario inv = new Inventario();

        inv.agregarProducto(new Producto("P01","Leche",800,10, CategoriaProducto.ALIMENTOS));
        inv.agregarProducto(new Producto("P02","TV",250000,5,CategoriaProducto.ELECTRONICA));
        inv.agregarProducto(new Producto("P03","Pantalón",15000,20,CategoriaProducto.ROPA));
        inv.agregarProducto(new Producto("P04","Mesa",80000,3,CategoriaProducto.HOGAR));
        inv.agregarProducto(new Producto("P05","Pan",400,50,CategoriaProducto.ALIMENTOS));

        inv.listarProductos();
        System.out.println();

        System.out.println("Buscar P03:");
        inv.buscarProductoPorId("P03").mostrarInfo();
        System.out.println();

        System.out.println("Filtrar ALIMENTOS:");
        for (Producto p : inv.filtrarPorCategoria(CategoriaProducto.ALIMENTOS)) p.mostrarInfo();
        System.out.println();

        inv.eliminarProducto("P02");

        inv.actualizarStock("P05", 70);

        System.out.println("Total stock: " + inv.obtenerTotalStock());

        System.out.println("Mayor stock: " + inv.obtenerProductoConMayorStock());

        System.out.println("Productos entre 1000 y 3000:");
        for (Producto p : inv.filtrarProductosPorPrecio(1000, 3000)) p.mostrarInfo();
        System.out.println();

        inv.mostrarCategoriasDisponibles();
    }
}
