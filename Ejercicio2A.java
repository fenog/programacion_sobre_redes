package guia_de_ejercicios_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.util.Arrays;

public class Ejercicio2A {
    public void mostrarApellidosOrdenados() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        PrintStream out = System.out;

        // Lectura de los tres apellidos
        out.println("Ingrese tres apellidos:");
        out.print("Apellido 1: ");
        String apellido1 = reader.readLine();
        out.print("Apellido 2: ");
        String apellido2 = reader.readLine();
        out.print("Apellido 3: ");
        String apellido3 = reader.readLine();

        // Ordenar los apellidos alfabéticamente
        String[] apellidos = { apellido1, apellido2, apellido3 };
        Arrays.sort(apellidos);

        // Mostrar los apellidos ordenados
        out.println("Apellidos ordenados alfabéticamente:");
        for (String apellido : apellidos) {
            out.println(apellido);
        }
    }

    public static void ejercicio2A() {
        Ejercicio2A ejerciciosIO = new Ejercicio2A();
        try {
            ejerciciosIO.mostrarApellidosOrdenados();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
