package cat.formacio.java8.functions;

import java.util.function.Function;

public class HighOrderFunctionalApp {

    private Function<String, String> connvertirMajuscules = x -> x.toUpperCase();
    private Function<String, String> connvertirMinuscules = String::toLowerCase;

    private void imprimir (String missatge, Function<String, String> conversor) {
        System.out.println(conversor.apply(missatge));
    }

    public static void main(String[] args) {
        HighOrderFunctionalApp highOrderFunctionalApp = new HighOrderFunctionalApp();

        highOrderFunctionalApp.imprimir("Hola", highOrderFunctionalApp.connvertirMajuscules);
        highOrderFunctionalApp.imprimir("Hola", highOrderFunctionalApp.connvertirMinuscules);

        highOrderFunctionalApp.imprimir("Hola", x -> x + " Adéu ");

    }
}
