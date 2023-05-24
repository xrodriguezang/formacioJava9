package cat.formacio.java8.lambda;

import java.util.*;

public class LambdaApp {

    public static void main (String[] args) {
        LambdaApp app = new LambdaApp();
        app.ordenarFunctionalInterface();
    }

    public void ordenarAPelo () {
        List<String> llista = new ArrayList<>();

        llista.add("A");
        llista.add("B");
        llista.add("C");

        Collections.sort(llista, new Comparator<String>() {

            @Override
            public int compare(String o1, String o2) {
                return o1.compareTo(o2);
            }
        });

        for (String paraula : llista ) {
            System.out.println(paraula);
        }

    }

    // Es refactoritza el codi de dalt amb funció lambda
    public void ordenarFunctionalInterfacePrimeraProva () {
        List<String> llista = new ArrayList<>();

        llista.add("A");
        llista.add("B");
        llista.add("C");

        Collections.sort(llista, (String o1, String o2) -> o1.compareTo(o2));

        // Functional Interface

        for (String paraula : llista ) {
            System.out.println(paraula);
        }

    }

    public void ordenarFunctionalInterface () {
        List<String> llista = new ArrayList<>();

        llista.add("A");
        llista.add("B");
        llista.add("C");

        //String response = (String a) -> "A";
        /*(String a) -> {
            return "A";
        };*/

        Collections.sort(llista, (o1, o2) -> {
            return o1.compareTo(o2);
        });

        // És el mateix que (Això és la lambda)
        Collections.sort(llista, (a, b) -> a.compareTo(b));

        // La línia de codi és igual a:

/*        Collections.sort(llista, new Comparator<String>() {

            @Override
            public int compare(String o1, String o2) {
                return o1.compareTo(o2);
            }
        });*/

        // Functional Interface

        for (String paraula : llista ) {
            System.out.println(paraula);
        }

    }


}
