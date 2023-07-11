package guia_de_ejercicios_1;


import java.util.HashMap;
import java.util.Map;

public class Ejercicio4B {
    private Map<String, Integer> alumnos;

    public Ejercicio4B() {
        alumnos = new HashMap<>();
    }

    public void addAlumno(String nacionalidad) {
        if (alumnos.containsKey(nacionalidad)) {
            int count = alumnos.get(nacionalidad);
            alumnos.put(nacionalidad, count + 1);
        } else {
            alumnos.put(nacionalidad, 1);
        }
    }

    public void showAll() {
        for (Map.Entry<String, Integer> entry : alumnos.entrySet()) {
            System.out.println("Nacionalidad: " + entry.getKey() + ", Alumnos: " + entry.getValue());
        }
    }

    public void showNacionalidad(String nacionalidad) {
        if (alumnos.containsKey(nacionalidad)) {
            System.out.println("Nacionalidad: " + nacionalidad + ", Alumnos: " + alumnos.get(nacionalidad));
        } else {
            System.out.println("No hay alumnos con esa nacionalidad.");
        }
    }

    public void cuantos() {
        int count = alumnos.size();
        System.out.println("Número de nacionalidades diferentes en el colegio: " + count);
    }

    public void borra() {
        alumnos.clear();
        System.out.println("Datos eliminados.");
    }

    public static void ejercicio4B() {
    	EjercicioBColegio colegio = new EjercicioBColegio();

        colegio.addAlumno("Español");
        colegio.addAlumno("Español");
        colegio.addAlumno("Argentino");
        colegio.addAlumno("Mexicano");
        colegio.addAlumno("Argentino");

        colegio.showAll();
        System.out.println();
        colegio.showNacionalidad("Español");
        colegio.showNacionalidad("Mexicano");
        colegio.showNacionalidad("Frances");

        colegio.cuantos();
        colegio.borra();
        colegio.showAll();
    }
}
