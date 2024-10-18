package stream_api_desafios;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class CheckIfPositive {
  public static void main(String[] args) {
    List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

    // write a predicate that checks if a number is positive

    Predicate<Integer> isPositive = number -> number > 0;

    // write a filter that prints only the positive numbers

    numeros.stream()
      .filter(isPositive)
      .forEach(System.out::println);

  }
}
