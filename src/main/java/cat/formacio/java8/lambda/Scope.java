package cat.formacio.java8.lambda;

public class Scope {

    // Variable d'instància
    private static double staticAttribute;

    // Variable de classe
    public double attribute;

/*
    public double provarVariableLocal () {

        double n = 3.0;

        Operacio operacio = new Operacio() {
            @Override
            public double calcular(double n1, double n2) {
                n = 4;
                return 0;
            }
        }
    }

    public double provarVariableLocal () {

        final double n = 3.0;

        Operacio operacio = new Operacio() {
            @Override
            public double calcular(double n1, double n2) {
                n = 4;
                return 0;
            }
        }
    }
*/

    public double provarVariableLocal () {

        final double n = 3.0;

        Operacio operacio = new Operacio() {
            @Override
            public double calcular(double n1, double n2) {
                return n + n1 + n2;
            }
        };

        return operacio.calcular(3,2);
    }

    public double provarAtributEstatica () {


        Operacio operacio = new Operacio() {
            @Override
            public double calcular(double n1, double n2) {
                // Tinc accés a atributs de classe, però no a variables locals
                staticAttribute = 7;
                return staticAttribute + n1 + n2;
            }
        };

        return operacio.calcular(3,2);

    }

    // Es passa a lambda
    public double provarAtributEstatica2 () {

        Operacio operacio = (a, b) -> {
            return  staticAttribute + a + b;
        };

        return operacio.calcular(3,2);

    }

}
