package cat.formacio.java8.lambda;

public class LambdaAppAmbInterface {

    public static void main (String[] args) {
        LambdaAppAmbInterface app = new LambdaAppAmbInterface();
        app.calcularAmbFuncional();
    }

    public void calcular () {
        Operacio operacio = new Operacio() {
            @Override
            public double calcular(double n1, double n2) {
                return (n1+n2)/2;
            }
        };

        System.out.println(operacio.calcular(3,5));
    }

    public void calcularAmbFuncional () {

        Operacio operacio = (a,b) -> (a + b) / 2;

        System.out.println(operacio.calcular(3,5));
    }

}
