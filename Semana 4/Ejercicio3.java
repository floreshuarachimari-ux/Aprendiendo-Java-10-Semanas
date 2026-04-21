import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
public class Ejercicio3 
{
    public static void main(String[] args) 
    {
        HashMap<String, String> agenda = new HashMap<>();
        Scanner sc = new Scanner(System.in);
        int opcion;
        do 
        {
            System.out.println("\n AGENDA TELEFÓNICA ");
            System.out.println("1. Agregar contacto \n2. Buscar por nombre\n3. Eliminar contacto\n4. Listar todos\n0. Salir");
            System.out.print("Opción: ");
            opcion = sc.nextInt();
            sc.nextLine(); 
            switch (opcion) 
            {
                case 1:
                    System.out.print("Nombre: ");
                    String nombre = sc.nextLine();
                    System.out.print("Teléfono: ");
                    String tel = sc.nextLine();
                    agenda.put(nombre, tel);
                    System.out.println("Contacto guardado.");
                    break;
                case 2:
                    System.out.print("Nombre a buscar: ");
                    String buscar = sc.nextLine();
                    String resultado = agenda.get(buscar);
                    if (resultado != null) 
                    {
                        System.out.println("Teléfono: " + resultado);
                    } 
                    else 
                    {
                        System.out.println("Contacto no encontrado.");
                    }
                    break;
                case 3:
                    System.out.print("Nombre a eliminar: ");
                    String eliminar = sc.nextLine();
                    if (agenda.remove(eliminar) != null) 
                    {
                        System.out.println("Eliminado correctamente.");
                    } 
                    else 
                    {
                        System.out.println("No se encontró el contacto.");
                    }
                    break;
                case 4:
                    System.out.println("Lista de contactos:");
                    for (Map.Entry<String, String> entrada : agenda.entrySet()) 
                    {
                        System.out.println(entrada.getKey() + " -> " + entrada.getValue());
                    }
                    break;
            }
        } 
        while (opcion != 0);
        sc.close();
    }
}