package guia_de_ejercicios_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Ejercicio2E {
    public void mostrarSignoZodiaco() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        PrintStream out = System.out;

        out.print("Ingrese la fecha de nacimiento (dd-MM-yyyy): ");
        String fechaNacimientoStr = reader.readLine();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        LocalDate fechaNacimiento = LocalDate.parse(fechaNacimientoStr, formatter);

        int mes = fechaNacimiento.getMonthValue();
        int dia = fechaNacimiento.getDayOfMonth();

        String signoZodiaco = "";
        if ((mes == 3 && dia >= 21) || (mes == 4 && dia <= 19)) {
            signoZodiaco = "Aries";
        } else if ((mes == 4 && dia >= 20) || (mes == 5 && dia <= 20)) {
            signoZodiaco = "Tauro";
        } else if ((mes == 5 && dia >= 21) || (mes == 6 && dia <= 20)) {
            signoZodiaco = "Géminis";
        } else if ((mes == 6 && dia >= 21) || (mes == 7 && dia <= 22)) {
            signoZodiaco = "Cáncer";
        } else if ((mes == 7 && dia >= 23) || (mes == 8 && dia <= 22)) {
            signoZodiaco = "Leo";
        } else if ((mes == 8 && dia >= 23) || (mes == 9 && dia <= 22)) {
            signoZodiaco = "Virgo";
        } else if ((mes == 9 && dia >= 23) || (mes == 10 && dia <= 22)) {
            signoZodiaco = "Libra";
        } else if ((mes == 10 && dia >= 23) || (mes == 11 && dia <= 21)) {
            signoZodiaco = "Escorpio";
        } else if ((mes == 11 && dia >= 22) || (mes == 12 && dia <= 21)) {
            signoZodiaco = "Sagitario";
        } else if ((mes == 12 && dia >= 22) || (mes == 1 && dia <= 19)) {
            signoZodiaco = "Capricornio";
        } else if ((mes == 1 && dia >= 20) || (mes == 2 && dia <= 18)) {
            signoZodiaco = "Acuario";
        } else if ((mes == 2 && dia >= 19) || (mes == 3 && dia <= 20)) {
            signoZodiaco = "Piscis";
        }

        out.println("El signo del zodíaco según la fecha de nacimiento es: " + signoZodiaco);
    }

    public static void ejercicio2E() {
        Ejercicio2E ejerciciosIO = new Ejercicio2E();
        try {
            ejerciciosIO.mostrarSignoZodiaco();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
