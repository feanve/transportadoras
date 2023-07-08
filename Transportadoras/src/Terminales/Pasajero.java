package Terminales;

public class Pasajero {
    private String nombre;
    private String nacionalidad;
    private String tipoDocumento;
    private String numeroDocumento;

    public Pasajero(String nombre, String nacionalidad, String tipoDocumento, String numeroDocumento) {
        this.nombre = nombre;
        this.nacionalidad = nacionalidad;
        this.tipoDocumento = tipoDocumento;
        this.numeroDocumento = numeroDocumento;
    }

    public String getNombre() {
        return nombre;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public String getTipoDocumento() {
        return tipoDocumento;
    }

    public String getNumeroDocumento() {
        return numeroDocumento;
    }
    
}
