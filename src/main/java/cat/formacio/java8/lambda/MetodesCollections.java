package cat.formacio.java8.lambda;

import java.util.ArrayList;
import java.util.List;

/**
 * Classe per apendre noves coses de les col·leccions
 */

public class MetodesCollections {

    List<String> llista = new ArrayList<>();

    public static void main(String[] args) {
        MetodesCollections collections = new MetodesCollections();
        collections.utilitzarForEach();

    }

    public void utilitzarForEach() {

        llista.add("A");
        llista.add("B");
        llista.add("C");

        // Es pot fer:
        for (String s : llista) {
            System.out.println(s);
        }

        // Es pot fer:
        llista.forEach (e -> System.out.println(e));

        // Es pot fer:
        llista.forEach (System.out::println);

    }

    public void utilitzarRemoveIf() {

        for (String s : llista) {
            if (s.equalsIgnoreCase("C")) {
                llista.remove(s);
            }
        }

        llista.removeIf(e -> e.equalsIgnoreCase("C"));

        if (llista.size()==0) {
            System.out.println("Llista buida");
        }

    }

    public void utilitzarSort() {

        llista.sort ((a, b) -> a.compareToIgnoreCase(b) );


    }


}
