package functional_interfaces;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Predicate;

public class PredicateExample {
  public static void main(String[] args) {

    // Write a predicate that checks if this character is in the Fellowship of the Ring

    List<String> fellowship = Arrays.asList("Aragorn", "Boromir", "Frodo", "Legolas", "Gimli", "Gandalf", "Merry", "Pippin");

    Predicate<String> isInTheFellowship = name -> fellowship.contains(name);

    Scanner scanner = new Scanner(System.in);

    System.out.println("Enter a name: ");

    String nameInput = scanner.nextLine();

    // calls the predicate
    boolean isInTheFellowshipResult = isInTheFellowship.test(nameInput);

    System.out.println("Is " + nameInput + " in the fellowship? " + isInTheFellowshipResult);
  };

}
