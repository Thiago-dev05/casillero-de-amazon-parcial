public class Casillero {
    
    private String id;
    private Boolean disponible;
    private Paquete paquete; // Agregacion con la clase Paquete

    public Casillero(String id, Boolean disponible, Paquete paquete) {
        this.id = id;
        this.disponible = disponible;
        this.paquete = paquete;
    }

    // Getters
    public String getId() {
        return id;
    }

    public Boolean getDisponible() {
        return disponible;
    }

    public Paquete getPaquete() {
        return paquete;
    }

    // Setters
    public void setId(String id) {
        this.id = id;
    }

    public void setDisponible(Boolean disponible) {
        this.disponible = disponible;
    }
     public void setPaquete(Paquete paquete) {
        this.paquete = paquete;
    }

    public void asignarPaquete(Paquete paquete) {
        if(this.disponible) {
            this.paquete = paquete;
            this.disponible = false;
        } else {
            System.out.println("Este casillero " + id + " ya está ocupado.");
        }
    }

}   
