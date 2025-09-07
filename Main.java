import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    // Lista para simular la gestión de casilleros
    static ArrayList<String> casilleros = new ArrayList<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("=== Menú Principal ===");
            System.out.println("1. Registrar");
            System.out.println("2. Consultar");
            System.out.println("3. Mostrar info");
            System.out.println("4. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine(); // Limpiar buffer

            switch (opcion) {
                case 1:
                    registrarCasillero(scanner);
                    break;
                case 2:
                    consultarCasillero(scanner);
                    break;
                case 3:
                    mostrarInfoCasilleros();
                    break;
                case 4:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción no válida. Intente de nuevo.");
            }
            System.out.println();
        } while (opcion != 4);

        scanner.close();
    }

    // Método para registrar un casillero
    public static void registrarCasillero(Scanner scanner) {
        System.out.print("Ingrese el nombre del casillero a registrar: ");
        String nombre = scanner.nextLine();
        casilleros.add(nombre);
        System.out.println("Casillero '" + nombre + "' registrado exitosamente.");
    }

    // Método para consultar un casillero
    public static void consultarCasillero(Scanner scanner) {
        System.out.print("Ingrese el nombre del casillero a consultar: ");
        String nombre = scanner.nextLine();
        if (casilleros.contains(nombre)) {
            System.out.println("El casillero '" + nombre + "' está registrado.");
        } else {
            System.out.println("El casillero '" + nombre + "' NO está registrado.");
        }
    }

    // Método para mostrar información de todos los casilleros
    public static void mostrarInfoCasilleros() {
        System.out.println("=== Lista de Casilleros Registrados ===");
        if (casilleros.isEmpty()) {
            System.out.println("No hay casilleros registrados.");
        } else {
            for (String nombre : casilleros) {
                System.out.println("- " + nombre);
            }
        }
    }
}
