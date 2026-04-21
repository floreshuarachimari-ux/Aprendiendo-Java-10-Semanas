import java.util.LinkedList;
public class Ejercicio1 
{
    public static void main(String[] args) 
    {
        LinkedList<String> filaBanco = new LinkedList<>();
        filaBanco.addLast("Cliente 1");
        filaBanco.addLast("Cliente 2");
        filaBanco.addLast("Cliente 3");
        filaBanco.addLast("Cliente 4");
        filaBanco.addLast("Cliente 5");
        System.out.println("Fila inicial: " + filaBanco);
        System.out.println("Atendiendo a: " + filaBanco.removeFirst());
        System.out.println("Atendiendo a: " + filaBanco.removeFirst());
        System.out.println("\nClientes restantes: " + filaBanco.size());
        System.out.println("Fila actual: " + filaBanco);
    }
}