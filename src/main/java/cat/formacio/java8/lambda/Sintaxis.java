package cat.formacio.java8.lambda;

public class Sintaxis {

    // Programació funcional
    public void provarSintaxis () {

        Operacio operacioMinim = (a, b) -> 4.0;

        // Tot això és el mateix:
        Operacio operacio = (a, b) -> (a + b) / 2;

        Operacio operacio2 = (double a, double b) -> (a + b) / 2;

        OperacioUnMetodeSenseParametres operacio3 = () ->  5.0 / 2.0;

        OperacioUnMetodeUnParametre operacio4 = a ->  a / 2.0;

        // AQUESTA ÉS LA RECOMANADA
        Operacio operacio5 = (double a, double b) -> {

            System.out.println("Es poden posar n linies");
            return (a + b) / 2;

        };

    }
}
