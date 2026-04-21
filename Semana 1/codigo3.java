import java.util.Scanner;
public class codigo3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // a) Matriz de 5 estudiantes con 4 notas cada uno
        String [] nombres = {"Ana", "Luis", "Maria", "Carlos", "Sofia"};
        int[][] notas = 
        {
            {55, 60, 70, 80},
            {40, 45, 50, 48},
            {90, 85, 95, 88},
            {70, 72, 68, 75},
            {51, 60, 55, 52}
        };
        double sumaGeneral = 0;
        int aprobados = 0;
        double mejorProm = -1;
        double peorProm = 101;
        System.out.println("--- PROMEDIOS DE ESTUDIANTES ---");
        for (int i = 0; i < nombres.length; i++) {
            double suma = 0;
            for (int j = 0; j < notas[i].length; j++) 
              {
                suma += notas[i][j];
              }
            // b) Calcule el promedio de cada estudiante
            double promedio = suma / notas[i].length;
            sumaGeneral += promedio;

            // d) Cuente cuántos aprobaron (>= 51)
            if (promedio >= 51) aprobados++;

            // c) Encuentre el de mejor y peor promedio
            if (promedio > mejorProm) mejorProm = promedio;
            if (promedio < peorProm) peorProm = promedio;
            System.out.printf(" %s : Promedio = %.2f%n",nombres[i], promedio);
        }

        // e) Calcule el promedio general del curso
        double promedioGeneral = sumaGeneral / notas.length;
        System.out.println("\n------------------");
        System.out.printf("Promedio General: %.2f%n", promedioGeneral);
        System.out.println("Aprobados: " + aprobados);
        System.out.println("Reprobados: " + (notas.length - aprobados));
        System.out.printf("Mejor Promedio : %s = %.2f ", nombres[0], mejorProm);
        System.out.printf("\nPeor Promedio: %s = %.2f%n", nombres[4], peorProm);
        scanner.close();
    }
}