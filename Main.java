import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        GestionCasilleros gestion = new GestionCasilleros(3, 3); // Crear una gestión de casilleros 3x3

        while (true) {
            System.out.println("1. Mostrar casilleros disponibles");
            System.out.println("2. Asignar paquete a casillero");
            System.out.println("3. Consultar paquete en casillero");
            System.out.println("4. Salir");
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
                    System.out.print("Ingrese ID del paquete: ");
                    String idPaquete = scanner.nextLine();
                    System.out.print("Ingrese descripción del paquete: ");
                    String descripcion = scanner.nextLine();
                    Paquete paquete = new Paquete(idPaquete, opcion, descripcion);
                    gestion.asignarPaquete(paquete, idCasillero);
                    break;
                case 3:
                    System.out.print("Ingrese ID del casillero a consultar: ");
                    String idConsulta = scanner.nextLine();
                    gestion.consultarPaquete(idConsulta);
                    break;
                case 4:
                    System.out.println("Saliendo...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Opción no válida.");
            }
        }
        
    }
}
