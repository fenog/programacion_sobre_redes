package guia_de_ejercicios_1;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Ejercicio4A {
    private List<Integer> numeros;

    public Ejercicio4A() {
        numeros = new ArrayList<>();
    }

    public void leerValores() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int valor;

        System.out.println("Ingrese valores enteros (Ingrese -99 para finalizar):");
        while ((valor = Integer.parseInt(reader.readLine())) != -99) {
            numeros.add(valor);
        }
    }

    public int calcularSuma() {
        int suma = 0;
        for (int numero : numeros) {
            suma += numero;
        }
        return suma;
    }

    public void mostrarResultados() {
        int cantidad = numeros.size();
        int suma = calcularSuma();
        double media = (double) suma / cantidad;

        System.out.println("Cantidad de valores leídos: " + cantidad);
        System.out.println("Suma de los valores: " + suma);
        System.out.println("Media de los valores: " + media);

        System.out.println("Valores leídos:");
        for (int numero : numeros) {
            System.out.print(numero + " ");
        }
        System.out.println();

        int mayoresQueMedia = 0;
        for (int numero : numeros) {
            if (numero > media) {
                mayoresQueMedia++;
            }
        }
        System.out.println("Cantidad de valores mayores que la media: " + mayoresQueMedia);
    }

    public static void ejercicio4A() {
    	EjercicioA ejercicio = new EjercicioA();
        try {
            ejercicio.leerValores();
            ejercicio.mostrarResultados();
        } catch (IOException e) {
            System.out.println("Error al leer los valores desde la consola: " + e.getMessage());
        }
    }
}
