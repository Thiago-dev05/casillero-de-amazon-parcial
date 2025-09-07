
import java.time.LocalDate;

class Paquete{

    private String destinatario;
    private LocalDate fechaIngreso;
    private String idCasillero; 

    public Paquete(String destinatario, LocalDate fechaIngreso, String idCasillero) {
        this.destinatario = destinatario;
        this.fechaIngreso = fechaIngreso;
        this.idCasillero = idCasillero;
    }

    // Getters
    public String getDestinatario() {
        return destinatario;
    }

    public LocalDate getFechaIngreso() {
        return fechaIngreso;
    }

    public String getIdCasillero() {
        return idCasillero;
    }

    // Setters
    public void setFechaIngreso(LocalDate fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    public void setDestinatario(String destinatario) {
        this.destinatario = destinatario;
    }

    public void setIdCasillero(String idCasillero) {
        this.idCasillero = idCasillero;
    }

}