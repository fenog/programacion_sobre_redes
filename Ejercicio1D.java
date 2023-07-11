package guia_de_ejercicios_1;

import java.io.PrintStream;

public class Ejercicio1D {
    public void convertirFahrenheitACelsius() {
        PrintStream out = System.out;
        out.print("Ingrese la temperatura en grados Fahrenheit: ");
        double fahrenheit = Double.parseDouble(System.console().readLine());
        double celsius = (fahrenheit - 32) * 5 / 9;
        out.println("La temperatura en grados Celsius es: " + celsius + " °C");
    }

    public static void Ejercicio1d() {
        Ejercicio1D ejerciciosIO = new Ejercicio1D();
        ejerciciosIO.convertirFahrenheitACelsius();
    }
}
