import java.util.List;
import java.util.stream.Collectors;
public class Ejercicio3 
{
    public static void main(String[] args) 
    {
        List<String> palabras = List.of("hola", "mundo", "java");
        List<String> mayusculas = palabras.stream()
                .map(n -> n.toUpperCase())
                .collect(Collectors.toList());
        System.out.println("Mayúsculas: " + mayusculas);
        List<String> exclamacion = palabras.stream()
                .map(n -> n + "!")
                .collect(Collectors.toList());
        System.out.println("Con exclamación: " + exclamacion);
    }
}
