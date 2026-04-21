public class Ejercicio1 
{
    String nombre;
    double precio;
    int stock; 
    public Ejercicio1(String nombre, double precio, int stock) 
    {
        this.nombre = nombre;
        this.precio = precio;
        this.stock = stock;
    }
    public void mostrarInfo() 
    {
        System.out.println("Producto: " + nombre);
        System.out.println("Precio: " + precio );
        System.out.println("Stock: " + stock);
    }
    public boolean hayStock() 
    {
        return stock > 0;
    }
    public static void main(String[] args) 
    {
        Ejercicio1 p1 = new Ejercicio1("Teclado", 150.0, 10);
        Ejercicio1 p2 = new Ejercicio1("Mouse", 50.0, 0);
        Ejercicio1 p3 = new Ejercicio1("Monitor", 1200.0, 5);
        p1.mostrarInfo();
        p2.mostrarInfo();
        p3.mostrarInfo();

        System.out.println("Hay stock de " + p2.nombre + ": " + p2.hayStock());
    }
}