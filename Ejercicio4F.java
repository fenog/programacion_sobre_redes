package guia_de_ejercicios_1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Estudiante implements Comparable<Estudiante> {
    private String nombre;
    private int puntaje;

    public Estudiante(String nombre, int puntaje) {
        this.nombre = nombre;
        this.puntaje = puntaje;
    }

    public String getNombre() {
        return nombre;
    }

    public int getPuntaje() {
        return puntaje;
    }

    @Override
    public int compareTo(Estudiante otroEstudiante) {
        int resultado = otroEstudiante.puntaje - this.puntaje;

        if (resultado == 0) {
            resultado = otroEstudiante.nombre.compareTo(this.nombre);
        }

        return resultado;
    }
}

class PuntajeComparator implements Comparator<Estudiante> {
    @Override
    public int compare(Estudiante estudiante1, Estudiante estudiante2) {
        int resultado = estudiante2.getPuntaje() - estudiante1.getPuntaje();

        if (resultado == 0) {
            resultado = estudiante2.getNombre().compareTo(estudiante1.getNombre());
        }

        return resultado;
    }
}

public class Ejercicio4F {
    public static void ejercicio4F() {
        List<Estudiante> estudiantes = new ArrayList<>();
        estudiantes.add(new Estudiante("Estudiante A", 90));
        estudiantes.add(new Estudiante("Estudiante B", 80));
        estudiantes.add(new Estudiante("Estudiante C", 90));
        estudiantes.add(new Estudiante("Estudiante D", 70));

        Collections.sort(estudiantes);

        System.out.println("Ordenamiento utilizando Comparable:");
        for (Estudiante estudiante : estudiantes) {
            System.out.println(estudiante.getNombre() + ": " + estudiante.getPuntaje());
        }

        System.out.println();

        estudiantes.sort(new PuntajeComparator());

        System.out.println("Ordenamiento utilizando Comparator:");
        for (Estudiante estudiante : estudiantes) {
            System.out.println(estudiante.getNombre() + ": " + estudiante.getPuntaje());
        }
    }
}
