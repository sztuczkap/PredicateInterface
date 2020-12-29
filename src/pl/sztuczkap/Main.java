package pl.sztuczkap;

import java.util.function.BiPredicate;
import java.util.function.Predicate;

public class Main {

    public static void main(String[] args) {

        // Predykat to interfejs który przyjmuje argument typu generycznego i zwraca wartość logiczną
        Predicate<String> fiveCharsWordPredicate = (word) -> word.length() > 5;
        Predicate<String> aContainsPredicate = (word) -> word.contains("a");

        System.out.println(fiveCharsWordPredicate.negate()
                .and(aContainsPredicate)
                .test("java"));

        BiPredicate<String, Integer> biPredicate = (text, number) ->
                text.contains("@") && number > 100;

        System.out.println(biPredicate.test("damian@wp.pl", 124));


    }
}
