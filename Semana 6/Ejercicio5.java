import java.util.List;
import java.util.Optional;

public class Ejercicio5 {
    public static void main(String[] args) {
        List<String> nombres = List.of("Ana", "Carlos", "Beatriz", "David");

        // Caso 1: Texto que existe
        System.out.print("Buscando 'Carlos': ");
        buscar(nombres, "Carlos").ifPresent(n -> System.out.println("Encontrado: " + n));

        // Caso 2: Texto que no existe
        String noExiste = buscar(nombres, "Pedro").orElse("no encontrado");
        System.out.println("Buscando 'Pedro': " + noExiste);
    }

    public static Optional<String> buscar(List<String> lista, String texto) {
        return lista.stream()
                .filter(s -> s.equalsIgnoreCase(texto))
                .findFirst(); // Devuelve Optional con el valor o vacío [cite: 960]
    }
}