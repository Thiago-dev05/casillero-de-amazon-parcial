class Paquete{

    private String destinatario;
    private int fechaIngreso;
    private String idCasillero; 

    public Paquete(String destinatario, int fechaIngreso, String idCasillero) {
        this.destinatario = destinatario;
        this.fechaIngreso = fechaIngreso;
        this.idCasillero = idCasillero;
    }

    // Getters
    public String getDestinatario() {
        return destinatario;
    }

    public int getFechaIngreso() {
        return fechaIngreso;
    }

    public String getIdCasillero() {
        return idCasillero;
    }

    // Setters
    public void setFechaIngreso(int fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    public void setDestinatario(String destinatario) {
        this.destinatario = destinatario;
    }

    public void setIdCasillero(String idCasillero) {
        this.idCasillero = idCasillero;
    }

}