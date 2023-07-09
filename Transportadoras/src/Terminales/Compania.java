package Terminales;

public class Compania {

    private String nombre;
    private Viaje listaViajes;
    private int numViaje;

    // crear constructor con sobrescarga de metodos, uno con nombre y el otro con lista de viajes y numero de viajes

    public Compania(String nombre) {
        this.nombre = nombre;
        
    }

    public Compania(String nombre, Viaje listaViajes, int numViaje) {
        this.listaViajes = listaViajes;
        this.numViaje = numViaje;
    }

    public void insertarViaje(Viaje viaje) {
        // agregar viaje a la lista de viajes
    }

    public String getNombre() {
        return nombre;
    }

    public int getNumViaje() {
        return numViaje;
    }

    public Viaje getViaje(String id) {
        // retornar un viaje que tenga el mismo id
        return listaViajes;
    }

    public Viaje getViaje(int i) {
        // retornar un viaje por el index i
        return listaViajes;
    }
    


}
