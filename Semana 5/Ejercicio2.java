import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

// --- EXCEPCIONES PERSONALIZADAS (Semana 5) ---

// Excepción para cuando un estudiante no existe
class EstudianteNoEncontradoException extends Exception {
    public EstudianteNoEncontradoException(String mensaje) {
        super(mensaje);
    }
}

// Excepción para evitar carnets duplicados
class CarnetDuplicadoException extends Exception {
    public CarnetDuplicadoException(String carnet) {
        super("Error: El carnet '" + carnet + "' ya está registrado en el sistema.");
    }
}

// --- MODELO DE DATOS (Semana 4) ---

class Estudiante {
    private String carnet;
    private String nombre;
    private double promedio;

    public Estudiante(String carnet, String nombre, double promedio) {
        this.carnet = carnet;
        this.nombre = nombre;
        this.promedio = promedio;
    }

    public String getCarnet() { return carnet; }
    public String getNombre() { return nombre; }
    
    @Override
    public String toString() {
        return String.format("Carnet: %s | Nombre: %s | Promedio: %.2f", carnet, nombre, promedio);
    }
}

// --- LÓGICA DEL SISTEMA ---

class GestorEstudiantes {
    private Map<String, Estudiante> mapaEstudiantes;

    public GestorEstudiantes() {
        this.mapaEstudiantes = new HashMap<>();
    }

    // Método que lanza excepción si el carnet ya existe
    public void registrarEstudiante(String carnet, String nombre, double promedio) throws CarnetDuplicadoException {
        if (mapaEstudiantes.containsKey(carnet)) {
            throw new CarnetDuplicadoException(carnet);
        }
        mapaEstudiantes.put(carnet, new Estudiante(carnet, nombre, promedio));
    }

    // Método que lanza excepción si no encuentra el carnet
    public Estudiante buscarPorCarnet(String carnet) throws EstudianteNoEncontradoException {
        if (!mapaEstudiantes.containsKey(carnet)) {
            throw new EstudianteNoEncontradoException("No se encontró ningún estudiante con el carnet: " + carnet);
        }
        return mapaEstudiantes.get(carnet);
    }
}

// --- CLASE PRINCIPAL (Interfaz de Consola) ---

public class Ejercicio2 {
    public static void main(String[] args) {
        GestorEstudiantes gestor = new GestorEstudiantes();
        Scanner sc = new Scanner(System.in);
        int opcion = -1;

        System.out.println("=== SISTEMA DE GESTIÓN ACADÉMICA ===");

        do {
            System.out.println("\n1. Registrar Estudiante");
            System.out.println("2. Buscar Estudiante por Carnet");
            System.out.println("3. Salir");
            System.out.print("Seleccione una opción: ");

            try {
                // Manejo de excepción de entrada no numérica (Ejercicio 1 Semana 5)
                opcion = Integer.parseInt(sc.nextLine());

                switch (opcion) {
                    case 1:
                        System.out.print("Ingrese Carnet: ");
                        String carnet = sc.nextLine();
                        System.out.print("Ingrese Nombre: ");
                        String nombre = sc.nextLine();
                        System.out.print("Ingrese Promedio: ");
                        double prom = Double.parseDouble(sc.nextLine());
                        
                        gestor.registrarEstudiante(carnet, nombre, prom);
                        System.out.println("Estudiante registrado exitosamente.");
                        break;

                    case 2:
                        System.out.print("Ingrese Carnet a buscar: ");
                        String busqueda = sc.nextLine();
                        Estudiante encontrado = gestor.buscarPorCarnet(busqueda);
                        System.out.println("Datos: " + encontrado);
                        break;

                    case 3:
                        System.out.println("Cerrando sistema...");
                        break;

                    default:
                        System.out.println("Opción fuera de rango.");
                }

            } catch (NumberFormatException e) {
                System.out.println("[ERROR]: Debe ingresar un valor numérico válido.");
            } catch (CarnetDuplicadoException | EstudianteNoEncontradoException e) {
                // Captura de las excepciones personalizadas del Ejercicio 2
                System.out.println("[SISTEMA]: " + e.getMessage());
            } catch (Exception e) {
                System.out.println("[INESPERADO]: " + e.getMessage());
            }

        } while (opcion != 3);

        sc.close();
    }
}