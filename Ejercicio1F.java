package guia_de_ejercicios_1;
import java.io.PrintStream;

public class Ejercicio1F {
    public void calcularValoresPago() {
        PrintStream out = System.out;
        out.print("Ingrese el precio del artículo: ");
        double precio = Double.parseDouble(System.console().readLine());
        double valorPlan1 = precio * 0.9;
        double valorContadoPlan2 = precio * 0.5;
        double valorCuotasPlan2 = (precio * 0.5 * 1.1) / 2;
        double valorPlan2 = valorContadoPlan2 + (valorCuotasPlan2 * 2);
        double valorContadoPlan3 = precio * 0.25;
        double valorCuotasPlan3 = (precio * 0.75 * 1.15) / 5;
        double valorPlan3 = valorContadoPlan3 + (valorCuotasPlan3 * 5);
        double valorCuotasPrimeras4 = (precio * 0.6 * 1.25) / 4;
        double valorCuotasUltimas4 = (precio * 0.4 * 1.25) / 4;
        double valorPlan4 = (valorCuotasPrimeras4 * 4) + (valorCuotasUltimas4 * 4);

        out.println("Valores a pagar según cada plan:");
        out.println("Plan 1: " + valorPlan1);
        out.println("Plan 2: " + valorPlan2);
        out.println("Plan 3: " + valorPlan3);
        out.println("Plan 4: " + valorPlan4);
    }

    public static void Ejercicio1f() {
        Ejercicio1F ejerciciosIO = new Ejercicio1F();
        ejerciciosIO.calcularValoresPago();
    }
}
