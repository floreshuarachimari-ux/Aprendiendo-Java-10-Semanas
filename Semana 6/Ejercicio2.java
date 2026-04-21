import java.util.List;
import java.util.stream.Collectors;
public class Ejercicio2 
{
    public static void main(String[] args) 
    {
        List<String> colores = List.of("rojo", "azul", "rosa", "verde", "rubi");
        List<String> masDeCuatro = colores.stream()
                .filter(c -> c.length() > 4)
                .collect(Collectors.toList());
        System.out.println("Colores con > 4 letras: " + masDeCuatro);
        List<String> contienenO = colores.stream()
                .filter(c -> c.contains("o"))
                .collect(Collectors.toList());
        System.out.println("Colores que contienen 'o': " + contienenO);
    }
}