package guia_de_ejercicios_1;

import java.io.*;

public class Ejercicio3e {
    public void borrarImpares() throws IOException {
        FileReader fileReader = new FileReader("C:\Users\T520\Desktop\programacion redes\números.txt");
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        FileWriter fileWriter = new FileWriter("C:\Users\T520\Desktop\programacion redes\temp.txt");
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
        String linea;
        while ((linea = bufferedReader.readLine()) != null) {
            int numero = Integer.parseInt(linea);
            if (numero % 2 == 0) {
                bufferedWriter.write(linea);
                bufferedWriter.newLine();
            }
        }
        bufferedReader.close();
        bufferedWriter.close();
        fileReader.close();
        fileWriter.close();
        File archivoOriginal = new File("C:\Users\T520\Desktop\programacion redes\números.txt");
        archivoOriginal.delete();
        File archivoTemporal = new File("C:\Users\T520\Desktop\programacion redes\temp.txt");
        archivoTemporal.renameTo(archivoOriginal);
    }

    public static void ejercicio3E() {
        Ejercicio3e ejerciciosIO = new Ejercicio3e();
        try {
            ejerciciosIO.borrarImpares();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
