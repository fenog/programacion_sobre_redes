package guia_de_ejercicios_1;
import java.io.PrintStream;

public class Ejercicio1A {
    public void calcularSueldoBruto() {
        PrintStream out = System.out;
        out.print("Ingrese el valor de una hora de trabajo: ");
        double valorHora = Double.parseDouble(System.console().readLine());
        out.print("Ingrese la cantidad de horas trabajadas: ");
        double horasTrabajadas = Double.parseDouble(System.console().readLine());
        double sueldoBruto = valorHora * horasTrabajadas;
        out.println("El sueldo bruto es: " + sueldoBruto);
    }


	public static void Ejercicio1a() {
		 Ejercicio1A ejerciciosIO = new Ejercicio1A();
	        ejerciciosIO.calcularSueldoBruto();
		
	}
		
	}

