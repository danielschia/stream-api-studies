package functional_interfaces;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class FunctionExample {
  public static void main(String[] args) {
      List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

      // write a function that returns the square of a number
      Function < Integer, Integer> square = number -> number * number;

      // calls the function for each element of the list

      // List<Integer> squares = numbers.stream()
      //     .map(square)
      //     .toList();

      // prints the list of squares
      //squares.forEach(System.out::println);

      numbers.forEach(number -> {
        int squareNumber = square.apply(number);
        System.out.println("Original number: " + number + " Squared number: " + squareNumber);
      });
  }
}
