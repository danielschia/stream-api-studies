package functional_interfaces;

import java.util.List;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SupplierExample {
  public static void main(String[] args) {
    // write a supplier that returns a random message
    Supplier<String> randomMessage = () -> "Not all those who wander are lost";

    // uses the supplier to create a list with 10 random messages
    List<String> listMessages = Stream.generate(randomMessage)
        .limit(10)
        .collect(Collectors.toList());

    // prints the list of messages
    listMessages.forEach(s-> System.out.println(s));
  }

}
