package guia_de_ejercicios_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;

public class Ejercicio2F {
    public void mostrarApellidoMasLargo() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        PrintStream out = System.out;

        out.print("Ingrese el nombre de la primera persona: ");
        String nombre1 = reader.readLine();
        out.print("Ingrese el apellido de la primera persona: ");
        String apellido1 = reader.readLine();

        out.print("Ingrese el nombre de la segunda persona: ");
        String nombre2 = reader.readLine();
        out.print("Ingrese el apellido de la segunda persona: ");
        String apellido2 = reader.readLine();

        int longitudApellido1 = apellido1.length();
        int longitudApellido2 = apellido2.length();

        if (longitudApellido1 > longitudApellido2) {
            out.println("El apellido más largo pertenece a la primera persona: " + apellido1);
        } else if (longitudApellido2 > longitudApellido1) {
            out.println("El apellido más largo pertenece a la segunda persona: " + apellido2);
        } else {
            out.println("Ambos apellidos tienen la misma longitud.");
        }
    }

    public static void ejercicio2F() {
        Ejercicio2F ejerciciosIO = new Ejercicio2F();
        try {
            ejerciciosIO.mostrarApellidoMasLargo();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
