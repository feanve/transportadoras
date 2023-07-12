package Terminales;

import java.util.ArrayList;

public class TerminalPrivado extends Terminal {
    private ArrayList<String> empresas;
    private int numEmpresa;

    public TerminalPrivado(String nombre, String ciudad, String departamento, String pais, int numCompania) {
        super(nombre, ciudad, departamento, pais, numCompania);
        this.empresas = new ArrayList<String>();
        this.numEmpresa = 0;
    }

    public TerminalPrivado(String nombre, String ciudad, String departamento, String pais, int numCompania,
            ArrayList<Compania> listaCompanias, ArrayList<String> empresas) {
        super(nombre, ciudad, departamento, pais, numCompania, listaCompanias);
        this.empresas = empresas;
    }

    public void insertarEmpresa(String empresa) {
        this.empresas.add(empresa);
    }

    public void insertarEmpresas(ArrayList<String> empresas) {
        this.empresas.addAll(empresas);
    }

    public ArrayList<String> getEmpresas() {
        return empresas;
    }
}
