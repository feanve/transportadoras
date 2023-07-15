package Terminales;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Utilities {

        public static List<TerminalPrivado> obtenerTerminalesPrivados() {
                List<TerminalPrivado> terminales = new ArrayList<>();

                terminales.add(
                                new TerminalPrivado("Terminal TS La Lulita", "Cali", "Valle del Cauca", "Colombia", 1,
                                                new ArrayList<Compania>(
                                                                Arrays.asList(obtenerCompaniasTransporte().get(1))),
                                                1,
                                                new ArrayList<String>(Arrays.asList("La Canela"))));

                terminales.add(new TerminalPrivado("Terminal Trans Pereira", "Pereira", "Risaralda", "Colombia", 13,
                                new ArrayList<Compania>(
                                                Arrays.asList(obtenerCompaniasTransporte().get(0))),
                                1,
                                new ArrayList<String>(Arrays.asList("Estrella Transporte"))));
                terminales.add(new TerminalPrivado("Terminal La Gualupa", "Cali", "Valle del Cauca", "Colombia", 154,
                                new ArrayList<Compania>(
                                                Arrays.asList(obtenerCompaniasTransporte().get(1))),
                                1,
                                new ArrayList<String>(Arrays.asList("La Canela", "La Estancia"))));
                terminales.add(new TerminalPrivado("Terminal Aguachica", "Barranquilla", "Atlántico", "Colombia", 134,
                                new ArrayList<Compania>(
                                                Arrays.asList(obtenerCompaniasTransporte().get(4))),
                                1,
                                new ArrayList<String>(Arrays.asList("Atlantic Casa", "Atrlantic Transporte"))));
                terminales.add(new TerminalPrivado("Terminal La Piña", "Mariquita", "Tolima", "Colombia", 166,
                                new ArrayList<Compania>(
                                                Arrays.asList(obtenerCompaniasTransporte().get(7))),
                                1,
                                new ArrayList<String>(Arrays.asList("Huilense", "La Canela"))));
                terminales.add(new TerminalPrivado("Terminal Del Tarro", "Manizales", "Caldas", "Colombia", 165,
                                new ArrayList<Compania>(
                                                Arrays.asList(obtenerCompaniasTransporte().get(2))),
                                1,
                                new ArrayList<String>(Arrays.asList("La Piñera"))));
                terminales.add(new TerminalPrivado("Terminal Agualinda", "Cartago", "Valle del Cauca", "Colombia", 123,
                                new ArrayList<Compania>(
                                                Arrays.asList(obtenerCompaniasTransporte().get(3))),
                                1,
                                new ArrayList<String>(Arrays.asList("La Canela", "La Estrella"))));
                terminales.add(new TerminalPrivado("Terminal Panquesillo", "Soledad", "Atlántico", "Colombia", 187,
                                new ArrayList<Compania>(
                                                Arrays.asList(obtenerCompaniasTransporte().get(4))),
                                1,
                                new ArrayList<String>(Arrays.asList("La Canela"))));
                terminales.add(new TerminalPrivado("Terminal Cuta", "Pereira", "Risaralda", "Colombia", 134,
                                new ArrayList<Compania>(
                                                Arrays.asList(obtenerCompaniasTransporte().get(0))),
                                1,
                                new ArrayList<String>(Arrays.asList("La Canela", "Pereirana de Transpostes"))));

                return terminales;
        }

        public static List<TerminalPublico> obtenerTerminalesPublicos() {
                List<TerminalPublico> terminales = new ArrayList<>();

                terminales.add(new TerminalPublico("Terminal Cuba", "Pereira", "Risaralda", "Colombia", 2, 1000000));
                terminales.add(new TerminalPublico("Terminal La Pintada", "La Pintada", "Antioquia", "Colombia", 3,
                                2000000));
                terminales.add(new TerminalPublico("Terminal Dosquebradas", "Dosquebradas", "Risaralda", "Colombia", 3,
                                2500000));
                terminales.add(new TerminalPublico("Terminal De Cali", "Cali", "Valle del Cauda", "Colombia", 1,
                                1000000));
                terminales.add(new TerminalPublico("Terminal De Manizales", "Manizales", "Caldas", "Colombia", 4,
                                9000000));
                terminales.add(
                                new TerminalPublico("Terminal De Barrancabermeja", "Barrancabermeja", "Santander",
                                                "Colombia", 1, 1100000));
                terminales.add(new TerminalPublico("Terminal De Amazonas", "Amazonas", "Leticia", "Colombia", 1,
                                3000000));
                terminales.add(new TerminalPublico("Terminal De cartago", "Cartago", "Valle del Cauca", "Colombia", 3,
                                2700000));
                terminales.add(new TerminalPublico("Terminal De Huila", "Neiva", "Huila", "Colombia", 4, 1500000));

                return terminales;
        }

        public static List<Compania> obtenerCompaniasTransporte() {
                List<Compania> companias = new ArrayList<>();

                companias.add(new Compania("La Candelaria",
                                new ArrayList<Viaje>(
                                                Arrays.asList(
                                                                new Viaje("1", "Pereira", "Cali", 45000, 20, null),
                                                                new Viaje("2", "Pereira", "Medellín", 55000, 20, null),
                                                                new Viaje("3", "Pereira", "Dosquebradas", 23000, 20,
                                                                                null),
                                                                new Viaje("4", "Pereira", "La Virginia", 49000, 20,
                                                                                null),
                                                                new Viaje("5", "Pereira", "Bogotá", 50000, 20, null))),
                                1));
                companias.add(new Compania("El Jordan", new ArrayList<Viaje>(
                                Arrays.asList(
                                                new Viaje("1", "Cali", "Armenia", 60000, 20, null),
                                                new Viaje("2", "Cali", "Medellín", 12000, 20, null),
                                                new Viaje("3", "Cali", "Dosquebradas", 110000, 20, null),
                                                new Viaje("4", "Cali", "La Virginia", 45000, 20, null),
                                                new Viaje("5", "Cali", "Bogotá", 32000, 20, null))),
                                1));
                companias.add(new Compania("TranspoSa", new ArrayList<Viaje>(
                                Arrays.asList(
                                                new Viaje("1", "Manizales", "Cali", 12000, 20, null),
                                                new Viaje("2", "Manizales", "Medellín", 35000, 20, null),
                                                new Viaje("3", "Manizales", "Dosquebradas", 120000, 20, null),
                                                new Viaje("4", "Manizales", "La Virginia", 30000, 20, null),
                                                new Viaje("5", "Manizales", "Bogotá", 23000, 20, null))),
                                1));
                companias.add(new Compania("TransAtla", new ArrayList<Viaje>(
                                Arrays.asList(
                                                new Viaje("1", "Cartago", "Cali", 45000, 20, null),
                                                new Viaje("2", "Cartago", "Medellín", 54000, 20, null),
                                                new Viaje("3", "Cartago", "Dosquebradas", 52000, 20, null),
                                                new Viaje("4", "Cartago", "La Virginia", 23000, 20, null),
                                                new Viaje("5", "Cartago", "Bogotá", 29000, 20, null))),
                                1));
                companias.add(new Compania("La Transportadora", new ArrayList<Viaje>(
                                Arrays.asList(
                                                new Viaje("1", "Soledad", "Cali", 42500, 20, null),
                                                new Viaje("2", "Soledad", "Medellín", 130000, 20, null),
                                                new Viaje("3", "Soledad", "Dosquebradas", 125000, 20, null),
                                                new Viaje("4", "Soledad", "La Virginia", 28900, 20, null),
                                                new Viaje("5", "Soledad", "Bogotá", 12300, 20, null))),
                                1));
                companias.add(new Compania("Ejecutivos Transporte", new ArrayList<Viaje>(
                                Arrays.asList(
                                                new Viaje("1", "Barrancabermeja", "Cali", 34000, 20, null),
                                                new Viaje("2", "Barrancabermeja", "Medellín", 12300, 20, null),
                                                new Viaje("3", "Barrancabermeja", "Dosquebradas", 44300, 20, null),
                                                new Viaje("4", "Barrancabermeja", "La Virginia", 23000, 20, null),
                                                new Viaje("5", "Barrancabermeja", "Bogotá", 23900, 20, null))),
                                1));
                companias.add(new Compania("TransCaldas", new ArrayList<Viaje>(
                                Arrays.asList(
                                                new Viaje("1", "La Pintada", "Cali", 20000, 20, null),
                                                new Viaje("2", "La Pintada", "Medellín", 10000, 20, null),
                                                new Viaje("3", "La Pintada", "Dosquebradas", 12000, 20, null),
                                                new Viaje("4", "La Pintada", "La Virginia", 12400, 20, null),
                                                new Viaje("5", "La Pintada", "Bogotá", 43000, 20, null))),
                                1));
                companias.add(new Compania("Transito Trans", new ArrayList<Viaje>(
                                Arrays.asList(
                                                new Viaje("1", "Neiva", "Cali", 129000, 20, null),
                                                new Viaje("2", "Neiva", "Medellín", 23000, 20, null),
                                                new Viaje("3", "Neiva", "Dosquebradas", 23400, 20, null),
                                                new Viaje("4", "Neiva", "La Virginia", 43000, 20, null),
                                                new Viaje("5", "Neiva", "Bogotá", 90000, 20, null))),
                                1));

                return companias;

        }

        public static List<Pasajero> obtenerPasajeros() {
                List<Pasajero> pasajeros = new ArrayList<>();

                pasajeros.add(new Pasajero("Juan Perez", "Colombiano", "CC", "123366567"));
                pasajeros.add(new Pasajero("Pedro Londoño", "Colombiano", "CC", "12266567"));
                pasajeros.add(new Pasajero("Maria Hernandez", "Colombiano", "CC", "535366567"));
                pasajeros.add(new Pasajero("Luis Juanato", "Colombiano", "CC", "123575567"));
                pasajeros.add(new Pasajero("Jorge Cerros", "Colombiano", "CC", "122646567"));
                pasajeros.add(new Pasajero("Jhon Manzanares", "Colombiano", "CC", "2366567"));
                pasajeros.add(new Pasajero("Josefina Jamaica", "Colombiano", "CC", "42365067"));

                return pasajeros;

        }
}
