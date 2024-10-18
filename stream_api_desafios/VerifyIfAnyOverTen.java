package stream_api_desafios;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class VerifyIfAnyOverTen {
  public static void main(String[] args) {
    List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

    // write a predicate that checks if any of the numbers are over 10

    Predicate<Integer> isOverTen = number -> number > 10;

    boolean isAnyOverTen = numbers.stream()
      .anyMatch(isOverTen);

    System.out.println(isAnyOverTen);
  }
}
