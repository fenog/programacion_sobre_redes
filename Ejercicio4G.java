package guia_de_ejercicios_1;

import java.util.*;

public class Ejercicio4G {
    public static void ejercicio4G() {
        Set<String> conjuntoProvincias = new HashSet<>(Arrays.asList(
                "Provincia de Heilongjiang", "Provincia de Zhejiang", "Provincia de Jiangxi",
                "Provincia de Guangdong", "Provincia de Fujian"
        ));

        Set<String> conjuntoCiudades = new HashSet<>(Arrays.asList(
                "Harbin", "Hangzhou", "Nanchang", "Guangzhou", "Fuzhou"
        ));

        Map<String, String> asignacion = new HashMap<>();

        Iterator<String> iteradorProvincias = conjuntoProvincias.iterator();
        Iterator<String> iteradorCiudades = conjuntoCiudades.iterator();

        while (iteradorProvincias.hasNext() && iteradorCiudades.hasNext()) {
            String provincia = iteradorProvincias.next();
            String ciudad = iteradorCiudades.next();

            asignacion.put(provincia, ciudad);
        }

        System.out.println("Obteniendo datos utilizando entrySet():");
        for (Map.Entry<String, String> entry : asignacion.entrySet()) {
            String provincia = entry.getKey();
            String ciudad = entry.getValue();

            System.out.println(provincia + " = " + ciudad);
        }

        System.out.println();

        System.out.println("Obteniendo datos utilizando keySet():");
        for (String provincia : asignacion.keySet()) {
            String ciudad = asignacion.get(provincia);

            System.out.println(provincia + " = " + ciudad);
        }
    }
}
