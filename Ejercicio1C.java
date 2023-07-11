package guia_de_ejercicios_1;
import java.io.PrintStream;

public class Ejercicio1C {
    public void calcularPerimetroCuadrado() {
        PrintStream out = System.out;

        // Lectura de la superficie del cuadrado
        out.print("Ingrese la superficie del cuadrado (m2): ");
        double superficie = Double.parseDouble(System.console().readLine());

        // Cálculo del lado del cuadrado
        double lado = Math.sqrt(superficie);

        // Cálculo del perímetro del cuadrado
        double perimetro = 4 * lado;

        // Mostrar el perímetro del cuadrado
        out.println("El perímetro del cuadrado es: " + perimetro + " metros");
    }

    public static void Ejercicio1c() {
        Ejercicio1C ejerciciosIO = new Ejercicio1C();
        ejerciciosIO.calcularPerimetroCuadrado();
    }
}
