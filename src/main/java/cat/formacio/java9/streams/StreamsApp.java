package cat.formacio.java9.streams;

import java.util.stream.IntStream;
import  java.util.stream.Stream;

public class StreamsApp {

    public static void main(String[] args) {
        //Stream.iterate(0, n -> n + 2 ).limit(100);

        //Stream.iterate(0, n -> n + 2 ).takeWhile(n -> n < 10).forEach(System.out::println);

        //Stream.iterate(0, n -> n <= 10, n -> n + 2).forEach(System.out::println);

        long result = IntStream.iterate(1, n -> n <=1000, n -> n + 1)
                .filter(number -> number % 7 == 0)
                .count();

        System.out.println(result);


    }
}
