package cat.formacio.java9.collections;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CollectionsApp {



    public static void main(String[] args) {
        List<String> llista = Arrays.asList("Persona 1", "Persona 2", "Persona 3");

        List<String> llistaNoModicable = Collections.unmodifiableList(llista);

        //llistaNoModicable.add("Persona 4");
        // llista.add("Persona 4");

        llistaNoModicable.set(0, "Persona1X");

        System.out.println(llistaNoModicable);

        System.out.println(llista.getClass());
        System.out.println(llistaNoModicable.getClass());

       // List<String> llistaImmutable = List.of("Persona1", "Persona2");


    }
}
