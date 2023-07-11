package guia_de_ejercicios_1;

import java.io.*;

public class Ejercicio3c {
    public void guardarNumerosPares() throws IOException {
        File archivo = new File("C:\Users\T520\Desktop\programacion redes\números.txt");
        FileWriter fileWriter = new FileWriter(archivo);
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
        for (int i = 0; i <= 1000; i += 2) {
            bufferedWriter.write(String.valueOf(i));
            bufferedWriter.newLine();
        }
        bufferedWriter.close();
        fileWriter.close();
    }

    public static void Ejercicio3C() {
        Ejercicio3c ejerciciosIO = new Ejercicio3c();
        try {
            ejerciciosIO.guardarNumerosPares();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
