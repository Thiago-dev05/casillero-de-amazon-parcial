public class GestionCasilleros {
  private Casillero[][] casilleros;
  private int filas;
  private int cols;

  // Constructor
  public GestionCasilleros(int filas, int cols) {
    this.filas = filas;
    this.cols = cols;
    casilleros = new Casillero[filas][cols];

    for (int i = 0; i < filas; i++)
      for (int j = 0; j < cols; j++) {
        String id = "C-" + i + j;
        casilleros[i][j] = new Casillero(id, true, null);
      }
  }
  // Getters
  public int getTotalCasilleros() {
    return filas * cols;
  }
  // Mirar si está disponible un casillero
  public boolean estaDisponible(String idCasillero) {
    for (int i = 0; i < filas; i++) {
        for (int j = 0; j < cols; j++) {
            if (casilleros[i][j].getId().equals(idCasillero)) {
                return casilleros[i][j].getDisponible();
            }
        }
    }
    System.out.println("Casillero " + idCasillero + " no encontrado.");
    return false;
}

  // Asignar paquete a un casillero disponible
  public boolean asignarPaquete(Paquete p, String idCasillero) {
    for (int i = 0; i < filas; i++) {
      for (int j = 0; j < cols; j++)
        if (casilleros[i][j].getId().equals(idCasillero)) {
          casilleros[i][j].asignarPaquete(p);
          p.setIdCasillero(casilleros[i][j].getId());
          System.out.println("Paquete asignado al casillero: " + casilleros[i][j].getId());
          return true;
        }
      
    }
    return false;
  }

  // Mostrar casilleros disponibles
  public void mostrarDisponibles() {
    System.out.println("--CASILLEROS DISPONIBLES--");
    boolean hayDisponibles = false;
    for (int i = 0; i < filas; i++) {
      for (int j = 0; j < cols; j++)
        if (casilleros[i][j].getDisponible()) {
          System.out.println(casilleros[i][j].getId());
          hayDisponibles = true;
        }
      
    }
    if (!hayDisponibles)
      System.out.println("No hay casilleros disponibles");

    System.out.println("--------------------------");
  }

  // Devolver la información del paquete 
  public boolean consultarPaquete(String idCasillero) {
    for (int i = 0; i < filas; i++)
      for (int j = 0; j < cols; j++) {
        if (casilleros[i][j].getId().equals(idCasillero)) 
          if (!casilleros[i][j].getDisponible()) {
            System.out.println("Paquete en casillero " + idCasillero + ":");
            Paquete p = casilleros[i][j].getPaquete();
            System.out.println("Destinatario: " + p.getDestinatario());
            System.out.println("Fecha de ingreso: " + p.getFechaIngreso());
            System.out.println("Descripción: " + p.getDescripcion());
            return true;
          } else {
            System.out.println("El casillero " + idCasillero + " está vacío.");
            return false;
          }
      }
      System.out.println("Casillero " + idCasillero + " no encontrado.");
      return false;
  }

  // Método para liberar un casillero
  public boolean liberarCasillero(String idCasillero) {
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < cols; j++) {
                if (casilleros[i][j].getId().equals(idCasillero)) {
                    if (!casilleros[i][j].getDisponible()) {
                        casilleros[i][j].setDisponible(true);
                        casilleros[i][j].setPaquete(null);
                        System.out.println("Casillero " + idCasillero + " liberado.");
                        return true;
                    } else {
                        System.out.println("El casillero " + idCasillero + " ya está disponible.");
                        return false;
                    }
                }
            }
        }
        System.out.println("Casillero " + idCasillero + " no encontrado.");
        return false;
    }
}
