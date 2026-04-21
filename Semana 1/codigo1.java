import java.util.Scanner;
public class codigo1 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        // a) Pedir nombre, edad y nota de tres materias
        System.out.print("Ingresa tu nombre: ");
        String nombre = scanner.nextLine();
        System.out.print("Ingresa tu edad: ");
        int edad = scanner.nextInt();
        System.out.print("Nota Materia 1: ");
        double nota1 = scanner.nextDouble();
        System.out.print("Nota Materia 2: ");
        double nota2 = scanner.nextDouble();
        System.out.print("Nota Materia 3: ");
        double nota3 = scanner.nextDouble();
        // b) Calcule el promedio de las tres notas
        double promedio = (nota1 + nota2 + nota3) / 3;
        // c) Muestre si está aprobado (>= 51) o reprobado
        System.out.println("\n-------------");
        System.out.printf("\nEstudiante: %s", nombre);
        System.out.printf("\nPromedio: %.2f%n", promedio);
        if (promedio >= 51) 
         {
            System.out.println("Estado: APROBADO");
         } 
        else 
         {
            System.out.println("Estado: REPROBADO");
         }
        // d) Si es mayor de edad (>= 18) Y está aprobado, muestre "Apto para práctica" 
        if (edad >= 18 && promedio >= 51) 
            {
              System.out.println("-Eres Apto para práctica-");
            }

        scanner.close();
    }
}