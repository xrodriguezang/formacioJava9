package cat.formacio.java8.anotacions;

import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@Repeatable(Llenguatges.class)  // Li dius que es pot repetir
public @interface Llenguatge {

    String value();
}
