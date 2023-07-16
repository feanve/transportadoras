package Terminales;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Consultas {
    static String infoTerminalesPriv = "";
    static String infoTerminalesPub = "";
    static String infoEmpresas = "";

    public static void consultarTerminales() {

        Utilities.obtenerTerminalesPrivados().forEach(terminal -> {
            infoTerminalesPriv += terminal + "\n";
        });

        Utilities.obtenerTerminalesPublicos().forEach(terminal -> {
            infoTerminalesPub += terminal + "\n";
        });

        JOptionPane.showMessageDialog(null,
                "Consultando información de terminales...");

        JOptionPane.showMessageDialog(null,
                "Terminales privados:\n\n" +
                        infoTerminalesPriv);

        JOptionPane.showMessageDialog(null,
                "Terminales públicos:\n\n" +
                        infoTerminalesPub);
    }

    public static void consultarEmpresasPatrocinadoras() {

        ArrayList<TerminalPrivado> terminalesPrivados = Utilities.obtenerTerminalesPrivados();

        String nombreTerminal = JOptionPane.showInputDialog(null,
                "Ingrese el nombre de la terminal privada a consultar:");

        TerminalPrivado terminalPrivado = terminalesPrivados.stream()
                .filter(terminal -> terminal.getNombre().equals(nombreTerminal))
                .findFirst()
                .orElse(null);

        if (terminalPrivado != null) {
            terminalPrivado.getEmpresas().forEach(empresa -> {
                infoEmpresas += empresa + "\n";
            });

            JOptionPane.showMessageDialog(null,
                    "Consultando información de empresas patrocinadoras...");

            JOptionPane.showMessageDialog(null,
                    "Empresas patrocinadoras:\n\n" +
                            infoEmpresas);
        } else {
            JOptionPane.showMessageDialog(null,
                    "No se encontró la terminal privada.");
        }

    }

    public static void consultarRecursosPublicos() {

        ArrayList<TerminalPublico> terminalesPublicos = Utilities.obtenerTerminalesPublicos();

        String nombreTerminal = JOptionPane.showInputDialog(null,
                "Ingrese el nombre de la terminal pública a consultar:");

        TerminalPublico terminalPublico = terminalesPublicos.stream()
                .filter(terminal -> terminal.getNombre().equals(nombreTerminal))
                .findFirst()
                .orElse(null);

        if (terminalPublico != null) {
            String recursosFormateados = String.format("%,.2f", terminalPublico.getRecursosPublicos());

            JOptionPane.showMessageDialog(null,
                    "Consultando el valor de recursos públicos...");

            JOptionPane.showMessageDialog(null,
                    "Recursos públicos:\n\n" +
                            "$" + recursosFormateados);
        } else {
            JOptionPane.showMessageDialog(null,
                    "No se encontró la terminal pública.");
        }

    }
}
