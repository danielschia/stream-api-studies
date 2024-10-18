package stream_api_desafios;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class AverageCalculation {
  public static void main(String[] args) {

    List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

    // write a function that calculates the average of a list of numbers

    Function<List<Integer>, Double> calcularMedia = listaNumeros -> {
      int soma = 0;
      List<Integer> maioresQueCinco = new ArrayList<>();

      for (Integer numero : numeros) {
        if(numero > 5){
          soma += numero;
          maioresQueCinco.add(numero);
        };
      }
      return (double) soma / maioresQueCinco.size();
    };

    System.out.println(calcularMedia.apply(numeros));
  }
}
