package Terminales;

import java.util.ArrayList;

public class Terminal {
    private String nombre;
    private String ciudad;
    private String departamento;
    private String pais;
    private ArrayList<Compania> listaCompanias;
    private int numCompania;

    public Terminal(String nombre, String ciudad, String departamento, String pais, int numCompania) {
        this.nombre = nombre;
        this.ciudad = ciudad;
        this.departamento = departamento;
        this.pais = pais;
        this.numCompania = numCompania;
        this.listaCompanias = new ArrayList<Compania>();
        this.numCompania = 0;
    }

    public Terminal(String nombre, String ciudad, String departamento,
            String pais, int numCompania,
            ArrayList<Compania> listaCompanias) {
        this.nombre = nombre;
        this.ciudad = ciudad;
        this.departamento = departamento;
        this.pais = pais;
        this.numCompania = numCompania;
        this.listaCompanias = listaCompanias;
    }

    public void insertarCompania(Compania compania) {
        this.listaCompanias.add(compania);
        this.numCompania++;
    }

    public String getNombre() {
        return nombre;
    }

    public String getCiudad() {
        return ciudad;
    }

    public String getDepartamento() {
        return departamento;
    }

    public String getPais() {
        return pais;
    }

    public int getNumCompania() {
        return numCompania;
    }

    public ArrayList<Compania> obtenerCompanias() {
        return listaCompanias;
    }

    public Compania getCompania(String nombre) {
        // retornar una compania por el nombre
        for (Compania compania : listaCompanias) {
            if (compania.getNombre().equals(nombre)) {
                return compania;
            }
        }
        return null;
    }

    public Compania getCompania(int i) {
        // retornar una compania por el index i
        return listaCompanias.get(i);
    }

    public String toString() {
        return nombre + " ubicada en: \n" + ciudad + " - " + departamento;
    }
}
