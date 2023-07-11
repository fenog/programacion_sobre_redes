package guia_de_ejercicios_1;
import java.io.PrintStream;

public class Ejercicio1B {
    public void calcularAnguloRestante() {
        PrintStream out = System.out;
        out.print("Ingrese el valor del primer ángulo: ");
        int angulo1 = Integer.parseInt(System.console().readLine());

        out.print("Ingrese el valor del segundo ángulo: ");
        int angulo2 = Integer.parseInt(System.console().readLine());
        int angulo3 = 180 - angulo1 - angulo2;
        out.println("El valor del tercer ángulo es: " + angulo3);
    }

    public static void ejercicio1b() {
        Ejercicio1B ejerciciosIO = new Ejercicio1B();
        ejerciciosIO.calcularAnguloRestante();
    }
}

	
	
		
	
