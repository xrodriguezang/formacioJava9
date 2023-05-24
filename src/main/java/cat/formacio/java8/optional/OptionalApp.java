package cat.formacio.java8.optional;

import java.util.Optional;

public class OptionalApp {

    public static void main (String[] args) {
        // Optional no s'ha de passar null.
        //Optional<String> stringOptional = Optional.of(null);
        Optional<String> stringOptional = Optional.of("Hola");
        Optional<String> stringNull = Optional.ofNullable(null);

        System.out.println(stringOptional.get());

        if (stringNull.isPresent()) {
            System.out.println(stringNull.get());
        } else {
            System.err.println("Opció buida");
        }

        String valor = stringNull.orElse("Valor per defecte");

        System.out.println("Valor: " + valor);

        // Es posa en format lambda
        // Un Supplier -> No tinc paràmetres d'entrada, però tinc una sortida
        stringNull.orElseThrow(() -> new IllegalArgumentException(("El valor no és correcte")));

    }
}
