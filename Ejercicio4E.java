package guia_de_ejercicios_1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Ejercicio4E {
    public int generarNumeroBolaDobleColor() {
        Random random = new Random();
        List<Integer> bolasRojas = new ArrayList<>();
        for (int i = 1; i <= 33; i++) {
            bolasRojas.add(i);
        }
        Collections.shuffle(bolasRojas);
        List<Integer> seleccionBolasRojas = bolasRojas.subList(0, 6);

        List<Integer> bolasAzules = new ArrayList<>();
        for (int i = 1; i <= 16; i++) {
            bolasAzules.add(i);
        }
        Collections.shuffle(bolasAzules);
        int seleccionBolaAzul = bolasAzules.get(0);

        List<Integer> numerosBolaDobleColor = new ArrayList<>();
        numerosBolaDobleColor.addAll(seleccionBolasRojas);
        numerosBolaDobleColor.add(seleccionBolaAzul);

        Collections.shuffle(numerosBolaDobleColor);

        StringBuilder numeroBolaDobleColor = new StringBuilder();
        for (int numero : numerosBolaDobleColor) {
            numeroBolaDobleColor.append(numero).append(" ");
        }

        return Integer.parseInt(numeroBolaDobleColor.toString().trim());
    }

    public static void ejercicio4E() {
        EjercicioE ejerciciosIO = new EjercicioE();
        int numeroBolaDobleColor = ejerciciosIO.generarNumeroBolaDobleColor();
        System.out.println("Número de bola de doble color: " + numeroBolaDobleColor);
    }
}
