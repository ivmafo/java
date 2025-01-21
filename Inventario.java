import java.util.ArrayList;
import java.util.List;

public class Inventario {
    List<Producto> productos;
    public Inventario(){
        productos= new ArrayList<>();
    }
    public void agregarProducto(Producto producto){
        if (producto != null && !existeProducto(producto.getNombre()) ) {
            productos.add(producto);
        } else {
            System.out.println("El producto ya existe o es inválido.");
        }
    }
    public void eliminarProducto(String nombre){
        productos.removeIf(producto -> producto.getNombre().equals(nombre));
    }
    public void actualizarProducto(String nombreProducto, String nuevoNombre,  Integer nuevoPrecio, Integer nuevaCantidad){
        for (Producto producto : productos){
            if( producto.getNombre().equals(nombreProducto) ){
                producto.actualizarProducto (nuevoNombre,nuevoPrecio,nuevaCantidad);
                return;
            }
        }
        System.out.println("Producto no enccontrado");
    }
    public void mostrarInventario(){
        for (Producto producto:productos){
            System.out.println(producto.toString());
        }
    }

    private boolean existeProducto(String nombre) {
        return productos.stream().anyMatch(producto -> producto.getNombre().equals(nombre));
    }
}
