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
public class Ejercicio1 
{
    public static void main(String[] args) 
    {
        Perro miPerro = new Perro("Peluchin", 3);
        Gato miGato = new Gato("Pelusa", 2);
        miPerro.hacerSonido();
        miGato.hacerSonido();
    }
}