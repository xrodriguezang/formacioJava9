package cat.formacio.java8.anotacions;

import cat.formacio.java8.anotacions.Llenguatge;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
public @interface Llenguatges {

    Llenguatge[] value();
}
