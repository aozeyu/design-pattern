import java.util.*;

public class StreamTest2 {
  public static void main(String[] args) {
    List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
    numbers.stream().map(n -> n * n).forEach(System.out::println);

    List<Integer> someNumbers = Arrays.asList(1, 2, 3, 4, 5);
    Optional<Integer> firstSquareDivisibleByThree = someNumbers.stream().map(n -> n * n).filter(n -> n % 3 == 0).findFirst();

    System.out.println(firstSquareDivisibleByThree);
  }
}
