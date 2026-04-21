import java.util.function.Function;

public class Ejercicio1 
{
    public static void main(String[] args) 
    {
        Function<String, Integer> obtenerLongitud = s -> s.length();
        String prueba = "Java ";
        System.out.println("La longitud de '" + prueba + "' es: " + obtenerLongitud.apply(prueba));
    }
}