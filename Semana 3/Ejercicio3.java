import java.util.ArrayList;
interface Domesticable 
{
    void entrenar();
}
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
class Perro extends Animal implements Domesticable 
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
    @Override
    public void entrenar() 
    {
        System.out.println(nombre + " está aprendiendo a dar la pata.");
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
public class Ejercicio3 
{
    public static void main(String[] args) 
    {
        ArrayList<Animal> animales = new ArrayList<>();
        animales.add(new Perro("Moli", 5));
        animales.add(new Gato("Michi", 1));
        System.out.println("---Lista de Animales y Entrenamiento---");
        for (Animal a : animales) 
        {
            a.hacerSonido();
            if (a instanceof Domesticable) 
            {
                ((Domesticable) a).entrenar();
            } 
            else 
            {
                System.out.println(a.nombre + " no es domesticable.");
            }
        }
    }
}