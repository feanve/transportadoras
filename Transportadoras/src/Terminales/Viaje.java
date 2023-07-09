package Terminales;

public class Viaje {

    private String identificador;
    private String ciudadOrigen;
    private String ciudadDestino;
    private double precio;
    private int numMaxPasajeros;
    private int numActualPasajeros;
    private Pasajero pasajeros;

    public Viaje(String identificador, String ciudadOrigen, String ciudadDestino, double precio, int numMaxPasajeros, Pasajero pasajeros) {
        this.identificador = identificador;
        this.ciudadOrigen = ciudadOrigen;
        this.ciudadDestino = ciudadDestino;
        this.precio = precio;
        this.numMaxPasajeros = numMaxPasajeros;
        this.numActualPasajeros = 0;
        this.pasajeros = pasajeros;
        
    }

    public String getIdentificador() {
        return identificador;
    }

    public String getCiudadOrigen() {
        return ciudadOrigen;
    }

    public String getCiudadDestino() {
        return ciudadDestino;
    }

    public double getPrecio() {
        return precio;
    }

    public int getNumMaxPasajeros() {
        return numMaxPasajeros;
    }

    public int getNumActualPasajeros() {
        return numActualPasajeros;
    }

    public Pasajero getPasajeros(int i ) {
        //retornar pasajeros por el index i;
        return pasajeros;
    }
    

    public Pasajero getPasajeros(String id) {
        // retornar un arreglo de pasajeros que tengan el mismo id
        return pasajeros;
    }
    
}
