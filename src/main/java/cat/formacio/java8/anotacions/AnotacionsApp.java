package cat.formacio.java8.anotacions;

import java.util.Arrays;

public class AnotacionsApp {

    @Llenguatges({
            @Llenguatge("Java"),
            @Llenguatge("PHP"),
            @Llenguatge("C++")
    })
    public interface  LlenguatgeProgramacioOO {

    }

    @Llenguatges({
            @Llenguatge("Scala"),
            @Llenguatge("Haskel")
    })
    public interface  LlenguatgeProgramacioFn {

    }

    public static void main (String[] args) {
        Llenguatge[] llenguatges = LlenguatgeProgramacioOO.class.getAnnotationsByType(Llenguatge.class);

        System.out.println("A" + "B" + "C" + "D");
        System.out.println(String.format("Es tenen %s llenguages de programació", llenguatges.length));

        Arrays.asList(llenguatges).forEach(l -> System.out.println(l.value()));
        Arrays.asList(llenguatges).forEach(System.out::println);
        Arrays.asList(llenguatges).stream().map(l -> l.value()).forEach(System.out::println);

    }
}
