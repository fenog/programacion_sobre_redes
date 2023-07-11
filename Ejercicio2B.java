package guia_de_ejercicios_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;

public class Ejercicio2B {
    public void encontrarMenorNumero() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        PrintStream out = System.out;

        // Lectura de los cuatro números
        out.println("Ingrese cuatro números:");
        out.print("Número 1: ");
        double numero1 = Double.parseDouble(reader.readLine());
        out.print("Número 2: ");
        double numero2 = Double.parseDouble(reader.readLine());
        out.print("Número 3: ");
        double numero3 = Double.parseDouble(reader.readLine());
        out.print("Número 4: ");
        double numero4 = Double.parseDouble(reader.readLine());

        // Determinar el número más pequeño
        double menorNumero = Math.min(Math.min(numero1, numero2), Math.min(numero3, numero4));

        // Mostrar el número más pequeño
        out.println("El número más pequeño es: " + menorNumero);
    }

    public static void ejercicio2B() {
        Ejercicio2B ejerciciosIO = new Ejercicio2B();
        try {
            ejerciciosIO.encontrarMenorNumero();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
