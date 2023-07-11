package guia_de_ejercicios_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;

public class Ejercicio2H {
    public void verificarNumeroPrimo() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        PrintStream out = System.out;

        // Lectura del número natural
        out.print("Ingrese un número natural: ");
        int numero = Integer.parseInt(reader.readLine());

        // Verificar si el número es primo
        boolean esPrimo = true;
        if (numero <= 1) {
            esPrimo = false;
        } else {
            for (int i = 2; i <= Math.sqrt(numero); i++) {
                if (numero % i == 0) {
                    esPrimo = false;
                    break;
                }
            }
        }

     
        if (esPrimo) {
            out.println(numero + " es un número primo.");
        } else {
            out.println(numero + " no es un número primo.");
        }
    }

    public static void ejercicio2H() {
        Ejercicio2H ejerciciosIO = new Ejercicio2H();
        try {
            ejerciciosIO.verificarNumeroPrimo();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
