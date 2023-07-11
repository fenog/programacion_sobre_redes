package guia_de_ejercicios_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;

public class Ejercicio2C {
    public void verificarParidad() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        PrintStream out = System.out;

        // Lectura del número
        out.print("Ingrese un número: ");
        int numero = Integer.parseInt(reader.readLine());

        // Verificar paridad
        if (numero % 2 == 0) {
            out.println("El número " + numero + " es par.");
        } else {
            out.println("El número " + numero + " es impar.");
        }
    }

    public static void ejercicio2C() {
        Ejercicio2C ejerciciosIO = new Ejercicio2C();
        try {
            ejerciciosIO.verificarParidad();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
