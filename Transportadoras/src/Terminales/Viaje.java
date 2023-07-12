package Terminales;

import java.util.ArrayList;

public class Viaje {

    private String identificador;
    private String ciudadOrigen;
    private String ciudadDestino;
    private double precio;
    private int numMaxPasajeros;
    private int numActualPasajeros;
    private ArrayList<Pasajero> pasajeros;

    public Viaje(String identificador, String ciudadOrigen, String ciudadDestino, double precio, int numMaxPasajeros,
            ArrayList<Pasajero> pasajeros) {
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

    public Pasajero getPasajeros(int i) {
        // retornar pasajeros por el index i;
        return pasajeros.get(i);
    }

    public Pasajero getPasajeros(String id) {
        // retornar un arreglo de pasajeros que tengan el mismo id
        for (Pasajero pasajero : pasajeros) {
            if (pasajero.getNumeroDocumento().equals(id)) {
                return pasajero;
            }
        }

        return null;
    }

}
