package cat.formacio.java8.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamsApp {

    List<String> llista = new ArrayList<>();

    public void filtrarAs () {

        llista.add("C1");
        llista.add("A1");
        llista.add("B2");
        llista.add("D1");

        llista.stream()
                .filter(e -> e.startsWith("A"))
                .forEach(System.out::println);
    }

    public void ordenarAlfabeticament() {

        llista.add("C1");
        llista.add("A1");
        llista.add("B2");
        llista.add("D1");

        llista.stream().sorted().forEach(System.out::println);

    }

    public void transformar () {

        //llista.stream().map(String::toLowerCase).forEach(System.out::println);

        List<String> minucules = llista.stream()
                .map(e -> {
                    e += "-";
                    return e.toLowerCase();
                })
                .collect(Collectors.toList());

        List<String> minucules2 = llista.stream()
                .map(String::toLowerCase)
                .collect(Collectors.toList());

        // Un map sempre retorna un col·lecció dels mateixos elements, però transformats en tipus, valors, etc. el que es vulgui.

        minucules.forEach(System.out::println);

    }

    public void limitar () {
        llista.stream().limit(2).forEach(System.out::println);
    }

    public void contar () {
        long l = llista.stream().count();

        System.out.println(l);
    }

    public void mix () {

        llista.add("C1");
        llista.add("A1");
        llista.add("B2");
        llista.add("D1");

        llista.stream()
                .map(String::toLowerCase)
                .filter(e -> e.contains("1"))
                .sorted()
                .limit(2)
                .forEach(System.out::println);
    }

    public void streamParalel () {

        llista.add("C1");
        llista.add("A1");
        llista.add("B2");
        llista.add("D1");

        // Agafa totes les CPU's i l'executa.
        // Es recomana no utilitzar!!!
        llista.parallelStream()
                .map(String::toLowerCase)
                .filter(e -> e.contains("1"))
                .sorted()
                .limit(2)
                .forEach(System.out::println);

    }


    public static void main (String[] args) {
        StreamsApp app = new StreamsApp();
        //app.mix();
        app.streamParalel();
    }

}
