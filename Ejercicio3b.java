package guia_de_ejercicios_1;

import java.io.*;

public class Ejercicio3b {
    public void guardarValoresNumericos() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        PrintStream out = System.out;
        File archivo = new File("valores.txt");
        String entrada;
        while (true) {
            out.print("Ingrese un valor (o 'salir' para terminar): ");
            entrada = reader.readLine();

            if (entrada.equalsIgnoreCase("salir")) {
                break;
            }
            try {
                double valor = Double.parseDouble(entrada);
                guardarValorNumericoEnArchivo(archivo, valor);
            } catch (NumberFormatException e) {
                out.println("El valor ingresado no es numérico. Intente nuevamente.");
            }
        }
    }

    private void guardarValorNumericoEnArchivo(File archivo, double valor) throws IOException {
        FileWriter fileWriter = new FileWriter(archivo, true);
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
        bufferedWriter.write(String.valueOf(valor));
        bufferedWriter.newLine();
        bufferedWriter.close();
        fileWriter.close();
    }

    public static void ejercicio3B() {
        Ejercicio3b ejerciciosIO = new Ejercicio3b();
        try {
            ejerciciosIO.guardarValoresNumericos();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
