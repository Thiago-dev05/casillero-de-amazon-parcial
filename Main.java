import java.time.LocalDate;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        GestionCasilleros gestion = new GestionCasilleros(3, 3); // Crear una gestión de casilleros 3x3
        while (true) {
            System.out.println("1. Mostrar casilleros disponibles");
            System.out.println("2. Asignar paquete a casillero");
            System.out.println("3. Consultar paquete en casillero");
            System.out.println("4. Vaciar casillero");
            System.out.println("5. Salir\n");
            System.out.print("Seleccione una opción: ");
            int opcion = scanner.nextInt();
            scanner.nextLine(); // Consumir el salto de línea

            switch (opcion) {
                case 1:
                    gestion.mostrarDisponibles();
                    break;
                case 2:
                    System.out.print("Ingrese ID del casillero (ej. C-00): ");
                    String idCasillero = scanner.nextLine();
                    if (!gestion.estaDisponible(idCasillero)) {
                        System.out.println("El casillero " + idCasillero + " no está disponible.\n");
                        break;
                    }

                    System.out.print("Ingrese el nombre del Destinatario: ");
                    String destinatario = scanner.nextLine();
                    System.out.print("Ingrese descripción del paquete: ");
                    String descripcion = scanner.nextLine();
                    System.out.print("Ingrese la fecha de ingreso del paquete (formato: YYYY-MM-DD): ");
                    String fechaStr = scanner.nextLine();
                    LocalDate fechaIngreso = LocalDate.parse(fechaStr);
                    Paquete paquete = new Paquete(destinatario, fechaIngreso, idCasillero, descripcion);
                    gestion.asignarPaquete(paquete, idCasillero);
                    break;
                case 3:
                    System.out.print("Ingrese ID del casillero a consultar: ");
                    String idConsulta = scanner.nextLine();
                    gestion.consultarPaquete(idConsulta);
                    break;
                case 4:
                    System.out.println("Ingrese ID del casillero por vaciar: ");
                    String idConsulta2 = scanner.nextLine();
                    gestion.liberarCasillero(idConsulta2);
                    break;
                case 5:
                    System.out.println("Saliendo...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Opción no válida.");
            }
        }
        
    }
}
