package guia_de_ejercicios_1;


import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Ejercicio4D {
    public static void ejercicio4D() {
        Set<String> jugadores = new HashSet<>();

        jugadores.add("Jordi Alba");
        jugadores.add("Pique");
        jugadores.add("Busquets");
        jugadores.add("Iniesta");
        jugadores.add("Messi");

        System.out.println("Jugadores del conjunto:");
        for (String jugador : jugadores) {
            System.out.println(jugador);
        }

        String jugadorBuscado = "Neymar JR";
        boolean existeJugador = jugadores.contains(jugadorBuscado);
        System.out.println("¿Existe '" + jugadorBuscado + "' en el conjunto?: " + existeJugador);

        Set<String> jugadores2 = new HashSet<>();
        jugadores2.add("Piqué");
        jugadores2.add("Busquets");

        boolean todosPresentes = jugadores.containsAll(jugadores2);
        System.out.println("¿Todos los elementos de jugadores2 están presentes en jugadores?: " + todosPresentes);

        Set<String> union = new HashSet<>(jugadores);
        union.addAll(jugadores2);

        boolean agregado = jugadores.add("Piqué");
        System.out.println("¿Se pudo agregar 'Piqué' al primer conjunto?: " + agregado);
    }
}
