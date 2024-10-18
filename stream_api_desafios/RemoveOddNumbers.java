package stream_api_desafios;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class RemoveOddNumbers {
  public static void main(String[] args) {
      List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

      Predicate<Integer> isOdd = number -> number % 2 != 0;

      List<Integer> pares = numeros.stream()
          .filter(isOdd)
          .toList();

      pares.forEach(System.out::println);

  }
}
