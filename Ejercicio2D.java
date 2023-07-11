package guia_de_ejercicios_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;

public class Ejercicio2D {
    public void verificarDivisibilidad() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        PrintStream out = System.out;
        out.print("Ingrese el primer número: ");
        double numero1 = Double.parseDouble(reader.readLine());

        out.print("Ingrese el segundo número: ");
        double numero2 = Double.parseDouble(reader.readLine());
        if (numero1 > numero2 && numero1 % numero2 == 0) {
            out.println(numero1 + " es divisible por " + numero2);
        } else if (numero2 > numero1 && numero2 % numero1 == 0) {
            out.println(numero2 + " es divisible por " + numero1);
        } else {
            out.println("El mayor número no es divisible por el menor número.");
        }
    }

    public static void ejercicio2D() {
        Ejercicio2D ejerciciosIO = new Ejercicio2D();
        try {
            ejerciciosIO.verificarDivisibilidad();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
