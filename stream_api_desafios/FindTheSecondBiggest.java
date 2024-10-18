package stream_api_desafios;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Function;

public class FindTheSecondBiggest {
  public static void main(String[] args) {

    List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

    // write a Consumer that prints the second biggest number

    Function<List<Integer>, Integer> getSecondBiggestNumber = listaNumeros -> {
      Collections.sort(listaNumeros);
      return listaNumeros.get(listaNumeros.size() - 2);
    };

    System.out.println(getSecondBiggestNumber.apply(numbers));
  }
}
