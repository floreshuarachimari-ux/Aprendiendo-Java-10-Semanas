import java.util.Scanner;
import java.util.TreeSet;
public class Ejercicio2 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        TreeSet<String> palabrasUnicas = new TreeSet<>();
        System.out.println("Ingrese 10 palabras (se filtrarán repetidas):");
        for (int i = 1; i <= 10; i++) 
        {
            System.out.print("Palabra " + i + ": ");
            String entrada = sc.next();
            palabrasUnicas.add(entrada); 
        }
        System.out.println("\n Resultados ");
        System.out.println("Cantidad de palabras distintas: " + palabrasUnicas.size());
        System.out.println("Lista ordenada alfabéticamente: " + palabrasUnicas);
        sc.close();
    }
}