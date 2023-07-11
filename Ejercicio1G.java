package guia_de_ejercicios_1;
import java.io.PrintStream;

public class Ejercicio1G {
    public void mostrarMesNacimiento() {
        PrintStream out = System.out;
        out.print("Ingrese su signo zodiacal: ");
        String signoZodiacal = System.console().readLine();
        String mesNacimiento = obtenerMesNacimiento(signoZodiacal);
        out.println("Su mes de nacimiento aproximado es: " + mesNacimiento);
    }

    private String obtenerMesNacimiento(String signoZodiacal) {
        signoZodiacal = signoZodiacal.toLowerCase();

        switch (signoZodiacal) {
            case "aries":
                return "Marzo - Abril";
            case "tauro":
                return "Abril - Mayo";
            case "geminis":
            case "géminis":
                return "Mayo - Junio";
            case "cancer":
            case "cáncer":
                return "Junio - Julio";
            case "leo":
                return "Julio - Agosto";
            case "virgo":
                return "Agosto - Septiembre";
            case "libra":
                return "Septiembre - Octubre";
            case "escorpio":
                return "Octubre - Noviembre";
            case "sagitario":
                return "Noviembre - Diciembre";
            case "capricornio":
                return "Diciembre - Enero";
            case "acuario":
                return "Enero - Febrero";
            case "piscis":
                return "Febrero - Marzo";
            default:
                return "Mes no encontrado";
        }
    }

    public static void Ejercicio1g() {
        Ejercicio1G ejerciciosIO = new Ejercicio1G();
        ejerciciosIO.mostrarMesNacimiento();
    }
}
