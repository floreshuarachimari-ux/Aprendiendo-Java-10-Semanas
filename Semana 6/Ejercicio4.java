import java.util.List;
import java.util.stream.Collectors;
public class Ejercicio4 
{
    public static void main(String[] args) 
    {
        List<Integer> precios = List.of(15, 80, 30, 120, 5, 95, 45);
        List<Integer> resultado = precios.stream()
                .filter(n -> n > 50)           
                .map(n -> (int)(n * 0.9))         
                .collect(Collectors.toList());     
        System.out.println("Precios finales: " + resultado);
    }
}