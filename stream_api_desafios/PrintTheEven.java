package stream_api_desafios;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;

public class PrintTheEven {

  public static void main(String[] args) {

    List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);
    List<Integer> pares = new ArrayList<>();

    // write a filter that prints only the even numbers
    Consumer<Integer> listarPares = numero -> {
      if(numero % 2 == 0) {
        pares.add(numero);
      }
    };

    numeros.forEach(listarPares);

    // write a BinaryOperator that sums the even numbers

    BinaryOperator<Integer> somarPares = (n1, n2) -> n1 + n2;

    int resultado = pares.stream().reduce(0, somarPares);
    System.out.println("Resultado: " + resultado);

    }
}
