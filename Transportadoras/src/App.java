import javax.swing.JOptionPane;

import Terminales.Consultas;

public class App {
    public static void main(String[] args) throws Exception {
        menu(true);

    }

    public static void menu(boolean mostrarBienvenida) {

        if (mostrarBienvenida) {
            JOptionPane.showMessageDialog(null, "Bienvenido al sistema de consultas\nde terminales de transporte");
        }
        int opcion = Integer.parseInt(JOptionPane.showInputDialog(
                "Seleccione una opción:\n1. Consultar terminales\n2. Consultar información de terminales\n3. Consultar compañias\n4. Consultar viajes\n5. Salir"));

        switch (opcion) {
            case 1:
                Consultas.consultarTerminales();
                menu(false);
                break;
            case 2:
                subMenuInfoTerminales();
                menu(false);
                break;
            case 3:
                Consultas.consultarCompanias();
                menu(false);
                break;
            case 4:
                subMenuInfoViajes();
                menu(false);
                break;
            case 5:
                System.exit(0);
                break;
            default:
                JOptionPane.showMessageDialog(null, "Opción inválida");
                menu(false);
                break;
        }
    }

    public static void subMenuInfoTerminales() {
        int opcion = Integer.parseInt(JOptionPane.showInputDialog(
                "Seleccione una opción:\n1. Consultar patrocinadores de terminales privados\n2. Consultar recursos de terminales públicos\n3. Salir"));

        switch (opcion) {
            case 1:
                Consultas.consultarEmpresasPatrocinadoras();
                break;
            case 2:
                Consultas.consultarRecursosPublicos();
                break;
            case 3:
                System.exit(0);
                break;
            default:
                JOptionPane.showMessageDialog(null, "Opción inválida");
                subMenuInfoTerminales();
                break;
        }

    }

    public static void subMenuInfoViajes() {
        int opcion = Integer.parseInt(JOptionPane.showInputDialog(
                "Seleccione una opción:\n1. Consultar viajes por terminal\n2. Consultar por origen y destino\n3. Salir"));

        switch (opcion) {
            case 1:
                Consultas.consultarViajes();
                break;
            case 2:
                Consultas.consultarViajesOrigenDestino();

                break;
            case 3:
                System.exit(0);
                break;
            default:
                JOptionPane.showMessageDialog(null, "Opción inválida");
                subMenuInfoViajes();
                break;
        }
    }
}
