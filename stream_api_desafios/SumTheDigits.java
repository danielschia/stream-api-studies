package stream_api_desafios;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class SumTheDigits {

  public static void main(String[] args) {
    // Write a method that calculates the sum of the digits of a number

    List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

    // Function that calculates the sum of the digits of an array of numbers
    Function<List<Integer>, Integer> sumDigits = listaNumeros -> {
      int soma = 0;
      for (Integer numero : listaNumeros) {
        while (numero > 0) {
          soma += numero % 10; // Add the last digit to soma
          numero /= 10; // Remove the last digit
        }
      }
      return soma;
    };

    System.out.println(sumDigits.apply(numbers));
  }
}
