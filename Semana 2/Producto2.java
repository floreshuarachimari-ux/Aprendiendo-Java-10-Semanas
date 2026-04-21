public class Producto2 
{
    private String nombre;
    private double precio;
    private int stock;
    public Producto2(String nombre, double precio, int stock) 
    {
        this.nombre = nombre;
        setPrecio(precio);
        setStock(stock);
    }
    public String getNombre() { return nombre; }
    public double getPrecio() { return precio; }
    public int getStock() { return stock; }
    public void setNombre(String nombre) 
    {
        if (nombre != null && !nombre.trim().isEmpty()) 
        {
            this.nombre = nombre;
        } 
        else 
        {
            System.out.println("El nombre no puede estar vacío.");
        }
    }
    public void setPrecio(double precio) 
    {
        if (precio > 0) 
        {
            this.precio = precio;
        }
        else 
        {
            System.out.println("El precio debe ser mayor a 0.");
        }
    }
    public void setStock(int stock) 
    {
        if (stock >= 0) 
        {
            this.stock = stock;
        } 
        else 
        {
            System.out.println("Error: El stock no puede ser negativo.");
        }
    }
    public void mostrarInfo() 
    {
        System.out.println("----------------------------");
        System.out.println("Producto: " + nombre);
        System.out.println("Precio:   " + precio + " Bs");
        System.out.println("Stock:    " + stock);
    }

    public void vender(int cantidad) 
    {
        if (cantidad <= 0) 
        {
            System.out.println("Cantidad invalida");
            return;
        }
        if (cantidad > stock) 
        {
            System.out.println("Stok insuficiente");
            return;
        } 
        stock -= cantidad;
        System.out.println("Venta exitosa. Stok restante: " + stock);
    }
    public static void main(String[] args) 
    {
        Producto2 p1 = new Producto2("Teclado", 250.0, 15);
        p1.mostrarInfo();
        p1.vender(5);
        System.out.println("\nIntentando asignar precio negativo");
        p1.setPrecio(-50.0); 
        p1.mostrarInfo();
    }
}