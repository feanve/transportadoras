package Terminales;

import java.util.ArrayList;

public class TerminalPrivado extends Terminal {
    private ArrayList<String> empresas;
    private int numEmpresa;

    public TerminalPrivado(String nombre, String ciudad, String departamento, String pais, int numCompania,
            int numEmpresa) {
        super(nombre, ciudad, departamento, pais, numCompania);
        this.numEmpresa = numEmpresa;
        this.empresas = new ArrayList<String>();
    }

    public TerminalPrivado(String nombre, String ciudad, String departamento, String pais, int numCompania,
            ArrayList<Compania> listaCompanias, int numEmpresa, ArrayList<String> empresas) {
        super(nombre, ciudad, departamento, pais, numCompania, listaCompanias);
        this.numEmpresa = numEmpresa;
        this.empresas = empresas;
    }

    public int getNumEmpresa() {
        return numEmpresa;
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
