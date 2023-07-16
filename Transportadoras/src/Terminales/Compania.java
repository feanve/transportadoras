package Terminales;

import java.util.ArrayList;

public class Compania {

    private String nombre;
    private ArrayList<Viaje> listaViajes;
    private int numViaje;

    // crear constructor con sobrescarga de metodos, uno con nombre y el otro con
    // lista de viajes y numero de viajes

    public Compania(String nombre, int numViaje) {
        this.nombre = nombre;
        this.numViaje = numViaje;
    }

    public Compania(String nombre, ArrayList<Viaje> listaViajes, int numViaje) {
        this.nombre = nombre;
        this.listaViajes = listaViajes;
        this.numViaje = numViaje;
    }

    public void insertarViaje(Viaje viaje) {
        // insertar un viaje en la lista de viajes
        listaViajes.add(viaje);
    }

    public String getNombre() {
        return nombre;
    }

    public int getNumViaje() {
        return numViaje;
    }

    public Viaje getViaje(String id) {
        // retornar un viaje por el id
        for (Viaje viaje : listaViajes) {
            if (viaje.getIdentificador().equals(nombre)) {
                return viaje;
            }
        }
        return null;
    }

    public Viaje getViaje(int i) {
        // retornar un viaje por el index i
        return listaViajes.get(i);
    }

    public String toString() {
        return nombre + "\n";
    }

}
