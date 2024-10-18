package functional_interfaces;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;

public class BinaryOperatorExample {
  public static void main(String[] args) {

    // write a binary operator that adds two numbers

    List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

    // write a binary operator that adds two numbers
    BinaryOperator<Integer> somarNumeros = (n1, n2) -> n1 + n2;

    int resultado = numeros.stream()
      .reduce(0, somarNumeros);

    System.out.println("Result: " + resultado);

  }
}
