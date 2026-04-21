import java.util.ArrayList;
abstract class Animal 
{
    protected String nombre;
    protected int edad;
    public Animal(String nombre, int edad) 
    {
        this.nombre = nombre;
        this.edad = edad;
    }
    public abstract void hacerSonido();
}
class Perro extends Animal 
{
    public Perro(String nombre, int edad) 
    {
        super(nombre, edad);
    }
    @Override
    public void hacerSonido() 
    {
        System.out.println(nombre + " dice: Guau guau");
    }
}
class Gato extends Animal 
{
    public Gato(String nombre, int edad) 
    {
        super(nombre, edad);
    }
    @Override
    public void hacerSonido() 
    {
        System.out.println(nombre + " dice: Miau miau");
    }
}
public class Ejercicio2 
{
    public static void main(String[] args) 
    {
        ArrayList<Animal> animales = new ArrayList<>();
        animales.add(new Perro("Buddy", 3));
        animales.add(new Gato("Luna", 2));

        System.out.println("--- Demostración de Polimorfismo ---");
        for (Animal a : animales) 
        {
            a.hacerSonido(); 
        }
    }
}