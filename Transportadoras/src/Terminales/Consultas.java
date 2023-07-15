package Terminales;

import javax.swing.JOptionPane;

public class Consultas {
    static String infoTerminalesPriv = "";
    static String infoTerminalesPub = "";

    public static void consultarTerminales() {

        Utilities.obtenerTerminalesPrivados().forEach(terminal -> {
            infoTerminalesPriv += terminal + "\n";
        });

        Utilities.obtenerTerminalesPrivados().forEach(terminal -> {
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
}
