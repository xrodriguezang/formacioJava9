package cat.formacio.java8.lambda;

import java.util.Arrays;

public class Referencies {

    public static String rederenciaMetodeEstatic (String a) {
        System.out.println("Mètode estàtic");

        return "A";
    }


    public static void main (String[] args) {

    }

    public void ordenar2 () {
        String[] llista = {"AAA", "BBB", "CCC", "DDD"};

        // Podria funcionar
        // Arrays.sort (llista, Referencies::rederenciaMetodeEstatic);

        // Per cada element de la llista es crida el compareToIgnoreCase
        Arrays.sort (llista, String::compareToIgnoreCase);

        for (String element : llista) {
            System.out.println(element);
        }

    }


    public void ordenar () {
        String[] llista = {"AAA", "BBB", "CCC", "DDD"};

        Arrays.sort (llista, (o1, o2) -> o1.compareToIgnoreCase(o2));

        // Per cada element de la llista es crida el compareToIgnoreCase
        Arrays.sort (llista, String::compareToIgnoreCase);

        for (String element : llista) {
            System.out.println(element);
        }

    }

/*
    public void convertir () {
        Conversor conversor = a -> a.toLoweCase();
        Conversor conversor1 = String::toLowerCase;
        conversor1.c
    }
*/

    public void convertir () {

        // Per passar directament l'estàtic
        Conversor conversor = Referencies::rederenciaMetodeEstatic;

        Conversor conversor1 = String::toLowerCase;
    }




}
