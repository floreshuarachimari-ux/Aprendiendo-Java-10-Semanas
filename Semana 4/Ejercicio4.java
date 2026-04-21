import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
class Producto 
{
    String nombre;
    double precio;
    public Producto(String nombre, double precio) 
    {
        this.nombre = nombre;
        this.precio = precio;
    }
    @Override
    public String toString() 
    {
        return String.format("%-15s | Precio: %.2f", nombre, precio);
    }
}
public class Ejercicio4 
{
    public static void main(String[] args) 
    {
        ArrayList<Producto> productos = new ArrayList<>();
        productos.add(new Producto("Laptop", 1200.50));
        productos.add(new Producto("Mouse", 25.00));
        productos.add(new Producto("Teclado", 45.90));
        productos.add(new Producto("Monitor", 300.00));
        productos.add(new Producto("Audífonos", 80.00));
        Collections.sort(productos, (p1, p2) -> p1.nombre.compareTo(p2.nombre));
        System.out.println(" Ordenado por Nombre ");
        productos.forEach(System.out::println);
        Collections.sort(productos, (p1, p2) -> Double.compare(p1.precio, p2.precio));
        System.out.println("\n Ordenado por Precio (Menor a Mayor) ");
        productos.forEach(System.out::println);
        Collections.sort(productos, (p1, p2) -> Double.compare(p2.precio, p1.precio));
        System.out.println("\n Ordenado por Precio (Mayor a Menor) ");
        productos.forEach(System.out::println);
    }
}
