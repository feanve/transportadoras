package Terminales;

import java.util.ArrayList;
import javax.swing.Timer;

import javax.swing.JOptionPane;

public class Consultas {
    static String infoTerminalesPriv = "";
    static String infoTerminalesPub = "";
    static String infoEmpresas = "";
    static String infoCompanias = "";
    static String infoViajes = "";
    static int indice = 0;
    static int delay = 2000;

    public static void consultarTerminales() {

        Utilities.obtenerTerminalesPrivados().forEach(terminal -> {
            infoTerminalesPriv += terminal + "\n";
        });

        Utilities.obtenerTerminalesPublicos().forEach(terminal -> {
            infoTerminalesPub += terminal + "\n";
        });


        Timer timer = new Timer(delay, e -> {
                // El código aquí se ejecutará cuando el temporizador expire
                JOptionPane.getRootFrame().dispose(); // Cierra el diálogo
            });

            timer.setRepeats(false); // Indica que el temporizador no debe repetirse
            timer.start();

        JOptionPane.showMessageDialog(null,
                "Consultando información de terminales...","", JOptionPane.INFORMATION_MESSAGE);

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

            Timer timer = new Timer(delay, e -> {
                // El código aquí se ejecutará cuando el temporizador expire
                JOptionPane.getRootFrame().dispose(); // Cierra el diálogo
            });

            timer.setRepeats(false); // Indica que el temporizador no debe repetirse
            timer.start();

           JOptionPane.showMessageDialog(null,
                "Consultando informacion de empresas patrocinadoras...","", JOptionPane.INFORMATION_MESSAGE);


            
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
                
            Timer timer = new Timer(delay, e -> {
                // El código aquí se ejecutará cuando el temporizador expire
                JOptionPane.getRootFrame().dispose(); // Cierra el diálogo
            });

            timer.setRepeats(false); // Indica que el temporizador no debe repetirse
            timer.start();

                
            JOptionPane.showMessageDialog(null,
                "Consultando el valor de recursos p\u00FAblicos...","", JOptionPane.INFORMATION_MESSAGE);

            
            JOptionPane.showMessageDialog(null,
                    "Recursos públicos:\n\n" +
                            "$" + recursosFormateados);
        } else {
            JOptionPane.showMessageDialog(null,
                    "No se encontró la terminal pública.");
        }

    }

    public static void consultarCompanias() {
        ArrayList<Terminal> terminales = new ArrayList<>();

        terminales.addAll(Utilities.obtenerTerminalesPrivados());
        terminales.addAll(Utilities.obtenerTerminalesPublicos());

        String nombreTerminal = JOptionPane.showInputDialog(null,
                "Ingrese el nombre de la terminal a consultar:");

        Terminal terminal = terminales.stream()
                .filter(terminal1 -> terminal1.getNombre().equals(nombreTerminal))
                .findFirst()
                .orElse(null);

        if (terminal != null) {
            terminal.obtenerCompanias().forEach(compania -> {
                infoCompanias += compania.getNombre() + "\n";
            });

            Timer timer = new Timer(delay, e -> {
                // El código aquí se ejecutará cuando el temporizador expire
                JOptionPane.getRootFrame().dispose(); // Cierra el diálogo
            });

            timer.setRepeats(false); // Indica que el temporizador no debe repetirse
            timer.start();

            JOptionPane.showMessageDialog(null,
                "Consultando informaci\u00F3n de compa\u00F1\u00EDas...","", JOptionPane.INFORMATION_MESSAGE);

            
            JOptionPane.showMessageDialog(null,
                    "Compañías:\n\n" +
                            infoCompanias);
        } else {
            JOptionPane.showMessageDialog(null,
                    "No se encontró la terminal.");
        }
    }

    public static void consultarViajes() {
        ArrayList<Terminal> terminales = new ArrayList<>();

        terminales.addAll(Utilities.obtenerTerminalesPrivados());
        terminales.addAll(Utilities.obtenerTerminalesPublicos());

        String nombreTerminal = JOptionPane.showInputDialog(null,
                "Ingrese el nombre de la terminal a consultar:");

        Terminal terminal = terminales.stream()
                .filter(terminal1 -> terminal1.getNombre().equals(nombreTerminal))
                .findFirst()
                .orElse(null);

        if (terminal != null) {
            // mostrar listado de compañias
            indice = 1;

            terminal.obtenerCompanias().forEach((compania) -> {
                infoCompanias += indice + ". " + compania.getNombre() + "\n";
                indice++;
            });

            int opcion = Integer.parseInt(JOptionPane.showInputDialog(null,
                    "Seleccione una compañía:\n\n" +
                            infoCompanias));

            Compania compania = terminal.obtenerCompanias().get(opcion - 1);

            // mostrar listado de viajes
            infoViajes = "";

            compania.obtenerViajes().forEach(viaje -> {
                infoViajes += viaje + "\n";
            });

            Timer timer = new Timer(delay, e -> {
                // El código aquí se ejecutará cuando el temporizador expire
                JOptionPane.getRootFrame().dispose(); // Cierra el diálogo
            });

            timer.setRepeats(false); // Indica que el temporizador no debe repetirse
            timer.start();

                
            JOptionPane.showMessageDialog(null,
                "Consultando informaci\u00F3n de viajes...","", JOptionPane.INFORMATION_MESSAGE);

            
            JOptionPane.showMessageDialog(null,
                    "Viajes:\n\n" +
                            infoViajes);

        } else {
            JOptionPane.showMessageDialog(null,
                    "No se encontró la terminal.");
        }
    }

    public static void consultarViajesOrigenDestino() {
        ArrayList<Terminal> terminales = new ArrayList<>();

        terminales.addAll(Utilities.obtenerTerminalesPrivados());
        terminales.addAll(Utilities.obtenerTerminalesPublicos());

        String origen = JOptionPane.showInputDialog(null,
                "Ingrese la ciudad de origen:");

        String destino = JOptionPane.showInputDialog(null,
                "Ingrese la ciudad de destino:");

        infoViajes = "";

        terminales.forEach(terminal -> {
            terminal.obtenerCompanias().forEach(compania -> {
                compania.obtenerViajes().forEach(viaje -> {
                    if (viaje.getCiudadOrigen().equals(origen) && viaje.getCiudadDestino().equals(destino)) {
                        infoViajes += terminal.getNombre() + "\n" +
                                compania.getNombre() + "\n" +
                                viaje + "\n";

                    }
                });
            });
        });

        if (infoViajes != "") {

                Timer timer = new Timer(delay, e -> {
                        // El código aquí se ejecutará cuando el temporizador expire
                        JOptionPane.getRootFrame().dispose(); // Cierra el diálogo
                    });
        
                    timer.setRepeats(false); // Indica que el temporizador no debe repetirse
                    timer.start();
        
                JOptionPane.showMessageDialog(null,
                        "Consultando informaci\u00F3n de viajes...","", JOptionPane.INFORMATION_MESSAGE);
        


            JOptionPane.showMessageDialog(null,
                    "Viajes:\n\n" +
                            infoViajes);
        } else {
            JOptionPane.showMessageDialog(null,
                    "No se encontraron viajes.");
        }

    }
}
