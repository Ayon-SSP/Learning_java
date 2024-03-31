package src.com.training.learn.lambda;

// import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        List<String> fruits = Arrays.asList("apple", "banana", "cherry");

        // Using lambda expression to filter even numbers
        List<Integer> evenNumbers = numbers.stream()
                .filter(number -> number % 2 == 0)
                .toList(); // Requires Java 16 or later, or use .collect(Collectors.toList())

        System.out.println("Even numbers: " + evenNumbers); // Even numbers: [2, 4, 6, 8, 10]

        // Using lambda expression to filter numbers greater than 5
        List<Integer> greaterThanFive = numbers.stream()
                .filter(number -> number > 5)
                .toList(); // Requires Java 16 or later, or use .collect(Collectors.toList())

        System.out.println("Numbers greater than 5: " + greaterThanFive); // Numbers greater than 5: [6, 7, 8, 9, 10]

        // Convert fruits to upper case
        List<String> upperCaseFruits = fruits.stream()
                .map(String::toUpperCase)
                .collect(Collectors.toList());

        System.out.println("Fruits in upper case: " + upperCaseFruits); // Fruits in upper case: [APPLE, BANANA, CHERRY]

        int sumOFNumbers = numbers.stream()
                .reduce(0, Integer::sum);

        System.out.println("Sum of numbers: " + sumOFNumbers); // Sum of numbers: 55

        List<Integer> sortedNumbers = numbers.stream()
                .sorted()
                .toList(); // Requires Java 16 or later, or use .collect(Collectors.toList())

        System.out.println("Sorted numbers in ascending order: " + sortedNumbers); // Sorted numbers in ascending order:
                                                                                   // [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]

        // Sorting the list in descending order using lambda expression
        List<Integer> sortedDescNumbers = numbers.stream()
                .sorted((num1, num2) -> num2.compareTo(num1))
                .toList(); // Requires Java 16 or later, or use .collect(Collectors.toList())

        System.out.println("Sorted numbers in descending order: " + sortedDescNumbers); // Sorted numbers in descending
                                                                                        // order: [10, 9, 8, 7, 6, 5, 4,
                                                                                        // 3, 2, 1]

        // calculate the average which is greater than 6
        double average = numbers.stream()
                .filter(number -> number > 6)
                .mapToDouble(number -> number)
                .average()
                .orElse(0);

        System.out.println("Average of numbers greater than 6: " + average);

        Map<Character, List<String>> groupedFruits = fruits.stream()
                .collect(Collectors.groupingBy(fruit -> fruit.charAt(0)));

        System.out.println("Grouped fruits by first letter: " + groupedFruits);

        // Grouping fruits by their length eg. apple(5), banana(6), cherry(6)
        Map<Integer, List<String>> groupedFruitsByLength = fruits.stream()
                .collect(Collectors.groupingBy(String::length));

        System.out.println("Grouped fruits by length: " + groupedFruitsByLength);

        Set<String> result = fruits.stream()
                .filter(fruit -> fruit.startsWith("a"))
                .map(String::toUpperCase)
                .collect(Collectors.toSet());

        System.out.println("Fruits starting with 'a' in upper case: " + result);
    }
}
