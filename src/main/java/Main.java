import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main {

    public static void main(String[] args) {
        List<String> myList = List.of("Apple", "Banana", "Tomato", "Pineapple", "Strawberry", "Cherry", "Lemon", "Grape", "banana");

        for (String element : myList) {
            System.out.println(element);
        }

        System.out.println("-------------");

        myList.stream()
                .forEach(System.out::println);

        List<Integer> listAfterStream = myList.stream()
                .filter(element -> element.length() > 5)
                .filter(element -> element.length() < 10)
                .map(String::length)
                .sorted()
                .collect(Collectors.toList());


//                .forEach((element) -> {
//                    System.out.println(element);
//                });

        System.out.println(listAfterStream);

        System.out.println("-----------");

        List<Integer> numbers = Arrays.asList(2, 1, 7, 0, 4, 5, 9, 7, 3, 8, 6);
        System.out.println(numbers.stream()
                .filter(integer -> integer % 2 == 0)
                .map(integer -> integer * 2)
                .mapToInt(Integer::intValue)
                .sorted()
                .sum());

    }
}
