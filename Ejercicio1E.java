package guia_de_ejercicios_1;

import java.io.PrintStream;

public class Ejercicio1E {
    public void convertirSegundosATiempo() {
        PrintStream out = System.out;
        out.print("Ingrese el tiempo en segundos: ");
        int segundos = Integer.parseInt(System.console().readLine());
        int dias = segundos / (24 * 60 * 60);
        int horas = (segundos % (24 * 60 * 60)) / (60 * 60);
        int minutos = (segundos % (60 * 60)) / 60;
        int seg = segundos % 60;
        out.println("El tiempo es: " + dias + " días, " + horas + " horas, " + minutos + " minutos, " + seg + " segundos");
    }

    public static void Ejercicio1e() {
        Ejercicio1E ejerciciosIO = new Ejercicio1E();
        ejerciciosIO.convertirSegundosATiempo();
    }
}
