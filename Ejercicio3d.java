package guia_de_ejercicios_1;

import java.io.*;

public class Ejercicio3d {
    public void leerNumeros() throws IOException {
        FileReader fileReader = new FileReader("C:\Users\T520\Desktop\programacion redes\números.txt");
        BufferedReader bufferedReader = new BufferedReader(fileReader);

        String linea;
        while ((linea = bufferedReader.readLine()) != null) {
            System.out.println(linea);
        }
        bufferedReader.close();
        fileReader.close();
    }

    public static void ejercicio3D() {
        Ejercicio3d ejerciciosIO = new Ejercicio3d();
        try {
            ejerciciosIO.leerNumeros();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
