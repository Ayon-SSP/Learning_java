package src.com.training.learn.lambda;

// import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        // Using lambda expression to filter even numbers
        List<Integer> evenNumbers = numbers.stream()
                .filter(number -> number % 2 == 0)
                .toList(); // Requires Java 16 or later, or use .collect(Collectors.toList())

        System.out.println("Even numbers: " + evenNumbers);

        // Using lambda expression to filter numbers greater than 5
        List<Integer> greaterThanFive = numbers.stream()
                .filter(number -> number > 5)
                .toList(); // Requires Java 16 or later, or use .collect(Collectors.toList())

        System.out.println("Numbers greater than 5: " + greaterThanFive);

        List<Integer> sortedNumbers = numbers.stream()
                .sorted()
                .toList(); // Requires Java 16 or later, or use .collect(Collectors.toList())

        System.out.println("Sorted numbers in ascending order: " + sortedNumbers);

        // Sorting the list in descending order using lambda expression
        List<Integer> sortedDescNumbers = numbers.stream()
                .sorted((num1, num2) -> num2.compareTo(num1))
                .toList(); // Requires Java 16 or later, or use .collect(Collectors.toList())
        

        System.out.println("Sorted numbers in descending order: " + sortedDescNumbers);


        // calculate the average which is greater than 6
        double average = numbers.stream()
                .filter(number -> number > 6)
                .mapToDouble(number -> number)
                .average()
                .orElse(0);

        System.out.println("Average of numbers greater than 6: " + average);

    }
}
