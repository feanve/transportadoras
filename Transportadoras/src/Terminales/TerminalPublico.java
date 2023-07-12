package Terminales;

import java.util.ArrayList;

public class TerminalPublico extends Terminal {
    private double recursosPublicos;

    public TerminalPublico(String nombre, String ciudad, String departamento, String pais, int numCompania) {
        super(nombre, ciudad, departamento, pais, numCompania);
    }

    public TerminalPublico(String nombre, String ciudad, String departamento, String pais, int numCompania,
            ArrayList<Compania> listaCompanias,
            double recursosPublicos) {
        super(nombre, ciudad, departamento, pais, numCompania, listaCompanias);
        this.recursosPublicos = recursosPublicos;
    }

    public double getRecursosPublicos() {
        return recursosPublicos;
    }
}
