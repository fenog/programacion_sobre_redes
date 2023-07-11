package guia_de_ejercicios_1;

import java.io.*;

public class Ejercicio3f {
    public static void ejercicio3F() {
        try {
            FileReader fileReader = new FileReader("C:\Users\T520\Desktop\programacion redes\\numeros.txt");
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            FileWriter fileWriter = new FileWriter("C:\Users\T520\Desktop\programacion redes\\primos.dat");
            PrintWriter printWriter = new PrintWriter(fileWriter);

            String line;
            while ((line = bufferedReader.readLine()) != null) {
                String[] numbers = line.split(" ");
                for (String number : numbers) {
                    int n = Integer.parseInt(number);
                    if (isPrime(n)) {
                        printWriter.println(n);
                    }
                }
            }

            bufferedReader.close();
            printWriter.close();
        } catch (IOException e) {
            System.out.println("Error al leer o escribir en el archivo.");
            e.printStackTrace();
        }
    }

    private static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }

        return true;
    }
}