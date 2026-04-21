public class codigo4 
{
    // a) calcularFactorial(int n) – retorna el factorial
    public static long calcularFactorial(int n) 
    {
        long res = 1;
        for (int i = 1; i <= n; i++) res *= i;
        return res;
    }
    // b) esPrimo(int n) – retorna true si es primo
    public static boolean esPrimo(int n) 
    {
        if (n <= 1) return false;
        for (int i = 2; i <= Math.sqrt(n); i++) 
         {
            if (n % i == 0) return false;
         }
        return true;
    }
    // c) invertirArray(int[] arr) – retorna el array dado vuelta
    public static int[] invertirArray(int[] arr) 
    {
        int[] invertido = new int[arr.length];
        for (int i = 0; i < arr.length; i++) 
         {
            invertido[i] = arr[arr.length - 1 - i];
         }
        return invertido;
    }
    // d) contarVocales(String texto) – cuenta las vocales
    public static int contarVocales(String texto) 
    {
        int contador = 0;
        String t = texto.toLowerCase();
        for (int i = 0; i < t.length(); i++) 
         {
            char c = t.charAt(i);
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') contador++;
         }
        return contador;
    }
    // e) Un main que pruebe todos los métodos
    public static void main(String[] args) 
    {
        System.out.println("Factorial de 5: " + calcularFactorial(5));
        System.out.println("¿Es 13 primo?: " + esPrimo(13));
        int[] original = {10, 20, 30, 40};
        int[] alReves = invertirArray(original);
        System.out.print("Array invertido: ");
        for (int n : alReves) System.out.print(n + " ");
        
        System.out.println("\nVocales en 'Java': " + contarVocales("Java"));
    }
}
