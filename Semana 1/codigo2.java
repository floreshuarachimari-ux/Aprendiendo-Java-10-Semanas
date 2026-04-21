import java.util.Scanner;
public class codigo2 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        int opcion;

        // b) Use do-while para repetir el menú hasta que elija “Salir”
        do 
        {
            // a) Muestre un menú
            System.out.println("\n--- OPERACIONES MATEMÁTICAS ---");
            System.out.println("1. Calcular Factorial");
            System.out.println("2. Verificar si es Primo");
            System.out.println("3. Tabla de Multiplicar");
            System.out.println("4. Salir");
            System.out.print("Elige una opción: ");
            opcion = scanner.nextInt();
            if (opcion >= 1 && opcion <= 3) 
                {
                // c) Valide que los números ingresados sean positivos
                int num;
                do 
                {
                    System.out.print("Ingresa un número entero positivo: ");
                    num = scanner.nextInt();
                    if (num < 0) System.out.println("Error: Debe ser positivo.");
                } 
                while (num < 0);
                switch (opcion) 
                {
                    case 1: // Factorial
                        long factorial = 1;
                        for (int i = 1; i <= num; i++) factorial *= i;
                        System.out.println("Factorial de " + num + " es: " + factorial);
                        break;
                    case 2: // Primo
                        boolean esPrimo = num > 1;
                        for (int i = 2; i <= Math.sqrt(num); i++) 
                          {
                            if (num % i == 0) { esPrimo = false; break; }
                          }
                        System.out.println("\n " + (esPrimo ? "Sí es primo" : "No es primo"));
                        break;
                    case 3: // Tabla de multiplicar
                        System.out.println("Tabla del " + num + ":");
                        for (int i = 1; i <= 10; i++) 
                          {
                            System.out.println(num + " x " + i + " = " + (num * i));
                          }
                        break;
                }
            }
        } 
        while (opcion != 4);
        scanner.close();
    }
}
