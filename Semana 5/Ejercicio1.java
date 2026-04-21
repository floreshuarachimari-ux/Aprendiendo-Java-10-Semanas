import java.util.Scanner;
import java.util.ArrayList;
public class Ejercicio1 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> tareas = new ArrayList<>();
        int opcion = 0;
        System.out.println("--- Sistema de Gestión de Tareas (Versión con Excepciones) ---");
        do 
        {
            System.out.println("\n1. Agregar tarea");
            System.out.println("2. Ver tareas");
            System.out.println("3. Salir");
            System.out.print("Seleccione una opción: ");

            try 
            {
                opcion = Integer.parseInt(sc.nextLine());
                switch (opcion) 
                {
                    case 1:
                        System.out.print("Escriba la descripción de la tarea: ");
                        String nuevaTarea = sc.nextLine();
                        tareas.add(nuevaTarea);
                        System.out.println("Tarea agregada correctamente.");
                        break;
                    case 2:
                        if (tareas.isEmpty()) 
                        {
                            System.out.println("No hay tareas registradas.");
                        } 
                        else 
                        {
                            System.out.println("\nLista de Tareas:");
                            for (int i = 0; i < tareas.size(); i++) 
                            {
                                System.out.println((i + 1) + ". " + tareas.get(i));
                            }
                        }
                        break;
                    case 3:
                        System.out.println("Saliendo del programa...");
                        break;
                    default:
                        System.out.println("Opción no válida. Intente de nuevo.");
                }
            } 
            catch (NumberFormatException e) 
            {
                System.out.println("\n[ERROR]: Entrada inválida. Por favor, ingrese solo números.");
                opcion = 0; 
            }
        } 
        while (opcion != 3);
        sc.close();
    }
}