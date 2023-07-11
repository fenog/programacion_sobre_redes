package guia_de_ejercicios_1;

import java.io.*;

public class Ejercicio3a {
    public void guardarUltimoDato() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        PrintStream out = System.out;
        File archivo = new File("datos.txt");
        String dato;
        do {
            out.print("Ingrese un dato (o 'salir' para terminar): ");
            dato = reader.readLine();
            if (!dato.equalsIgnoreCase("salir")) {
                guardarDatoEnArchivo(archivo, dato);
            }
        } while (!dato.equalsIgnoreCase("salir"));
    }

    private void guardarDatoEnArchivo(File archivo, String dato) throws IOException {

        FileWriter fileWriter = new FileWriter(archivo);
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
        bufferedWriter.write(dato);
        bufferedWriter.close();
        fileWriter.close();
    }

    public static void ejercicio3A() {
        Ejercicio3a ejerciciosIO = new Ejercicio3a();
        try {
            ejerciciosIO.guardarUltimoDato();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
