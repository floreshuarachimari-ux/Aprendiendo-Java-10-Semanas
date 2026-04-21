import java.util.ArrayList;
class Libro 
{
    private String titulo;
    private String autor;
    private double precio;
    public Libro(String titulo, String autor, double precio) 
    {
        this.titulo = titulo;
        this.autor = autor;
        this.precio = precio;
    }
    public String getTitulo() { return titulo; }
    public double getPrecio() { return precio; }
    public void mostrarInfo() 
    {
        System.out.println("Libro: " + titulo );
        System.out.println("Autor: " + autor );
        System.out.println("Precio: " + precio + " Bs");
    }
}
public class Ejercicio3 
{
    public static void main(String[] args) 
    {
        ArrayList<Libro> biblioteca = new ArrayList<>();
        biblioteca.add(new Libro("Java Básico", "Deitel", 150.0));
        biblioteca.add(new Libro("Clean Code", "Robert Martin", 220.0));
        biblioteca.add(new Libro("El Quijote", "Cervantes", 50.0));
        biblioteca.add(new Libro("Estructuras de Datos", "Joyanes", 190.0));
        biblioteca.add(new Libro("La Odisea", "Homero", 40.0));
        System.out.println("\n -- Lista Completa --");
        for (Libro l : biblioteca) 
        {
            l.mostrarInfo();
        }
        Libro masCaro = biblioteca.get(0);
        for (Libro l : biblioteca) 
        {
            if (l.getPrecio() > masCaro.getPrecio()) 
            {
                masCaro = l;
            }
        }
        System.out.println("\n --Libro más caro --");
        masCaro.mostrarInfo();
        System.out.println("\n --Libros económicos (< 100 Bs) --");
        for (Libro l : biblioteca) 
        {
            if (l.getPrecio() < 100) 
            {
                l.mostrarInfo();
            }
        }
        String buscar = "El Quijote";
        for (int i = 0; i < biblioteca.size(); i++) 
        {
            if (biblioteca.get(i).getTitulo().equalsIgnoreCase(buscar)) 
            {
                biblioteca.remove(i);
                System.out.println("\n[Eliminado]: " + buscar);
                break;
            }
        }
        System.out.println("\n-- Lista Final --");
        for (Libro l : biblioteca) 
        {
            l.mostrarInfo();
        }
    }
}