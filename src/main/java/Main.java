import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

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

    }
}
