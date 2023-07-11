package guia_de_ejercicios_1;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Ejercicio4C {
    public static void ejercicio4C() {
        List<String> listDias = new ArrayList<>();

        listDias.add(0, "Lunes");
        listDias.add(1, "Martes");
        listDias.add(2, "Miércoles");
        listDias.add(3, "Jueves");
        listDias.add(4, "Juernes"); 
        listDias.add(5, "Viernes");
        listDias.add(6, "Sábado");
        listDias.add(7, "Domingo");


        List<String> listaDos = new ArrayList<>(listDias);


        listDias.addAll(listaDos);


        System.out.println("Contenido en la posición 3: " + listDias.get(3));
        System.out.println("Contenido en la posición 4: " + listDias.get(4));


        System.out.println("Primer elemento: " + listDias.get(0));
        System.out.println("Último elemento: " + listDias.get(listDias.size() - 1));


        listDias.remove("Juernes");


        System.out.println("¿Se eliminó 'Juernes'?: " + !listDias.contains("Juernes"));


        System.out.println("Valores de la lista original:");
        Iterator<String> iterator = listDias.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        String diaBuscado = "Lunes";
        boolean existeDia = false;
        for (String dia : listDias) {
            if (dia.equalsIgnoreCase(diaBuscado)) {
                existeDia = true;
                break;
            }
        }
        System.out.println("¿Existe '" + diaBuscado + "' en la lista?: " + existeDia);

        listDias.sort(String.CASE_INSENSITIVE_ORDER);

        System.out.println("Contenido de la lista ordenada:");
        for (String dia : listDias) {
            System.out.println(dia);
        }
    }
}
