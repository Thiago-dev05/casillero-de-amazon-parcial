
import java.time.LocalDate;

class Paquete{

    private String destinatario;
    private LocalDate fechaIngreso;
    private String idCasillero; 
    private String descripcion;

    public Paquete(String destinatario, LocalDate fechaIngreso, String idCasillero, String descripcion) {
        this.destinatario = destinatario;
        this.fechaIngreso = fechaIngreso;
        this.idCasillero = idCasillero;
        this.descripcion = descripcion;
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
    public String getDescripcion(){
        return descripcion;
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

    public void setDescripcion(String descripcion){
        this.descripcion = descripcion;
    }
}