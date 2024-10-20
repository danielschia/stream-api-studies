package functional_interfaces;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerExample {

  public static void main(String[] args) {
    List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

    // write a consumer that prints only the even numbers
    Consumer<Integer> imprimirNumeroPar = numero -> {
      if (numero % 2 == 0) {
        System.out.println(numero);
      }
    };

    // calls the consumer for each element of the list
    numeros.stream().forEach(imprimirNumeroPar);


    numeros.stream()
      .filter(n -> n % 2 == 0)
      .forEach(System.out::println);
    };
}
