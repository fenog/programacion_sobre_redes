package guia_de_ejercicios_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;

public class Ejercicio2G {
    public void encontrarMenorNumero() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        PrintStream out = System.out;

        out.println("Ingrese cuatro números:");
        out.print("Número 1: ");
        double numero1 = Double.parseDouble(reader.readLine());
        out.print("Número 2: ");
        double numero2 = Double.parseDouble(reader.readLine());
        out.print("Número 3: ");
        double numero3 = Double.parseDouble(reader.readLine());
        out.print("Número 4: ");
        double numero4 = Double.parseDouble(reader.readLine());

        double menorNumero = Math.min(Math.min(numero1, numero2), Math.min(numero3, numero4));

        out.println("El número más pequeño es: " + menorNumero);
    }

    public static void ejercicio2G() {
        Ejercicio2G ejerciciosIO = new Ejercicio2G();
        try {
            ejerciciosIO.encontrarMenorNumero();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
