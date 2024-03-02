#### Read: 02Mar24 Assignment04  :
Lesson: Classes and Objects
https://docs.oracle.com/javase/tutorial/java/javaOO/index.html

#### Practice: 02Mar24_Assignment04:

#### Please note 
1. create an assign09 project where under com.training.demo. Ensure that all below solutions are created only in this project
2. Assignmentshould be uploaded as "02Mar24_Assignment04<162333>.docx" where you will copy below questions and paste is solution below it
3. For user input use String []args i.e. Program arguments

#### Variables

01. Declare variables of different primitive data types (int, double, char, boolean) and assign appropriate values to them. Print the values of these variables.
```java
package com.training.demo;

/*
 * 01. Declare variables of different primitive data types (int, double, char, boolean) and assign appropriate values to them. Print the values of these variables.
*/
public class Variable1 {
    public static void main(String[] args) {
        int age = 10;
        double weight = 10.5;
        char grade = 'A';
        boolean isStudent = true;
        System.out.println("age = " + age);
        System.out.println("weight = " + weight);
        System.out.println("grade = " + grade);
        System.out.println("isStudent = " + isStudent);
    }
}
```

02. Write a program to swap the values of two integer variables without using a temporary variable.
```java
package com.training.demo;

/*
 * 02. Write a program to swap the values of two integer variables without using a temporary variable.
*/
public class Variable2 {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        System.out.println("Before swapping: a = " + a + ", b = " + b);
        a = a + b; // a = 30
        b = a - b; // b = 30 - 20 = 10
        a = a - b; // a = 30 - 10 = 20
        System.out.println("After swapping: a = " + a + ", b = " + b);
    }

}
```

03. Create an array of strings to store the names of your favorite movies. Access and print the second element in the array.
```java
package com.training.demo;

/*
 * 03. Create an array of strings to store the names of your favorite movies. Access and print the second element in the array.
 */
public class Variable3 {
    public static void main(String[] args) {
        String[] movies = {"The Shawshank Redemption", "The Godfather", "The Dark Knight", "The Godfather: Part II", "3 Idiots"};
        System.out.println("Second movie: " + movies[1]);
    }
}
```

04. Initialize a variable with a value and use the += operator to add 5 to it. Print the result.
```java
package com.training.demo;

/*
 * 04. Initialize a variable with a value and use the += operator to add 5 to it. Print the result.
 */
public class Variable4 {
    public static void main(String[] args) {
        int a = 10;
        a += 5;
        System.out.println("a = " + a);
    }

}
```

05. Declare two variables and check if they are of the same data type using the instanceof operator.
```java
package com.training.demo;

/*
 * 05. Declare two variables and check if they are of the same data type using the instanceof operator.

*/
// create a class MyType
class MyType {
    int a;
    double b;
}

public class Variable5 {
    public static void main(String[] args) {
        Integer fooInteger = 336;
        // string put null
        String fooString = null;
        MyType fooMyType = new MyType();
        System.out.println("fooInteger is an instance of Integer: " + (fooInteger instanceof Integer));
        System.out.println("fooInteger is an instance of Integer: " + (fooString instanceof String));
        System.out.println("a is an instance of Integer: " + (fooMyType instanceof MyType));
    }

}

```

#### Operators

01. *Write a program to calculate the area and perimeter of a rectangle given its length and width using arithmetic operators (+, -, , /).
```java
package com.training.demo;
/*
 * 01. Write a program to calculate the area and perimeter of a rectangle given its length and width using arithmetic operators (+, -, , /).
 */
public class Operators1 {
    public static void main(String[] args) {
        int length = 10;
        int width = 20;
        int area = length * width;
        int perimeter = 2 * (length + width);
        System.out.println("Area of rectangle: " + area);
        System.out.println("Perimeter of rectangle: " + perimeter);
    }

}
```

02. Demonstrate the use of relational operators (<, >, <=, >=, ==, !=) to compare two numbers and print the corresponding result.
```java
package com.training.demo;
/*
 * 02. Demonstrate the use of relational operators (<, >, <=, >=, ==, !=) to compare two numbers and print the corresponding result.
 */
public class Operators2 {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        System.out.println("a < b = " + (a < b));
        System.out.println("a > b = " + (a > b));
        System.out.println("a <= b = " + (a <= b));
        System.out.println("a >= b = " + (a >= b));
        System.out.println("a == b = " + (a == b));
        System.out.println("a != b = " + (a != b));
    }

}
```

03. Use logical operators (&&, ||, !) to check if a number is even or odd and print the appropriate message.
```java
package com.training.demo;
/*
 * 03. Use logical operators (&&, ||, !) to check if a number is even or odd and print the appropriate message.
 */
public class Operators3 {
    public static void main(String[] args) {
        int number = 10;
        if (number % 2 == 0 && number > 0) {
            System.out.println(number + " is even");
        } else if (number % 2 != 0 || 1 != 0){
            System.out.println(number + " is odd");
        }
    }
}
```

04. Illustrate the bitwise operators (&, |, ^, ~, <<, >>, >>>) on two integers and print the results.
```java
package com.training.demo;
/*
 * 04. Illustrate the bitwise operators (&, |, ^, ~, <<, >>, >>>) on two integers and print the results.
 */
public class Operators4 {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        System.out.println("a & b = " + (a & b)); // 0000 1010 & 0001 0100 = 0000 0000
        System.out.println("a | b = " + (a | b)); // 0000 1010 | 0001 0100 = 0001 1110
        System.out.println("a ^ b = " + (a ^ b)); // 0000 1010 ^ 0001 0100 = 0001 1110
        System.out.println("~a = " + ~a); // ~0000 1010 = 1111 0101
        System.out.println("a << 2 = " + (a << 2)); // 0000 1010 << 2 = 0010 1000
        System.out.println("a >> 2 = " + (a >> 2)); // 0000 1010 >> 2 = 0000 0010
        System.out.println("a >>> 2 = " + (a >>> 2)); // 0000 1010 >>> 2 = 0000 0010
    }
}
```

05. *Apply the assignment operator (=) and its variations (+=, -=, =, /=, %=, <<=, >>=, >>>=) to modify a variable's value and print the result.
```java
package com.training.demo;
/*
 * 05. *Apply the assignment operator (=) and its variations (+=, -=, =, /=, %=, <<=, >>=, >>>=) to modify a variable's value and print the result.
 */
public class Operators5 {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        a += b; // a = a + b
        System.out.println("a += b = " + a);
        a -= b; // a = a - b
        System.out.println("a -= b = " + a);
        a *= b; // a = a * b
        System.out.println("a *= b = " + a);
        a /= b; // a = a / b
        System.out.println("a /= b = " + a);
        a %= b; // a = a % b
        System.out.println("a %= b = " + a);
        a <<= 2; // a = a << 2
        System.out.println("a <<= 2 = " + a);
        a >>= 2; // a = a >> 2
        System.out.println("a >>= 2 = " + a);
        a >>>= 2; // a = a >>> 2
        System.out.println("a >>>= 2 = " + a);
    }

}

```

#### Control Statements

01. Write a program to accept a grade as input from the user and print the corresponding letter grade (A, B, C, D, F) using an if-else if-else chain.
```java
package com.training.demo;

/*
 * 01. Write a program to accept a grade as input from the user and print the corresponding letter grade (A, B, C, D, F) using an if-else if-else chain.
 */
public class ControlStatement1 {
    public static void main(String[] args) {
        
        for (String arg : args) {
            int grade = Integer.parseInt(arg);
            if (grade >= 90) {
                System.out.println("A");
            } else if (grade >= 80) {
                System.out.println("B");
            } else if (grade >= 70) {
                System.out.println("C");
            } else if (grade >= 60) {
                System.out.println("D");
            } else {
                System.out.println("F");
            }
        }
    }

}
```

02. Create a program that uses a switch statement to check the day of the week (1-7) entered by the user and print the corresponding day name.
```java
package com.training.demo;

/*
 * 02. Create a program that uses a switch statement to check the day of the week (1-7) entered by the user and print the corresponding day name.
 */
public class ControlStatement2 {
    public static void main(String[] args) {
        int day = Integer.parseInt(args[0]);
        String dayName = "";
        switch (day) {
        case 1:
            dayName = "Monday";
            break;
        case 2:
            dayName = "Tuesday";
            break;
        case 3:
            dayName = "Wednesday";
            break;
        case 4:
            dayName = "Thursday";
            break;
        case 5:
            dayName = "Friday";
            break;
        case 6:
            dayName = "Saturday";
            break;
        case 7:
            dayName = "Sunday";
            break;
        default:
            dayName = "Invalid day";
            break;
        }
        System.out.println(dayName);
    }

}
```

03. Simulate a simple ATM program using a loop that allows the user to withdraw money (within their account limit) until they choose to exit.
```java
package com.training.demo;

/*
 * 03. Simulate a simple ATM program using a loop that allows the user to withdraw money (within their account limit) until they choose to exit.
 */
public class ControlStatement3 {

    public static void main(String[] args) {
        double accbalance = 10000;

        while (true) {
            System.out.println("press 1 to check balance");
            System.out.println("press 2 to withdraw");
            System.out.println("press 3 to exit");
            System.out.println("enter choice on 1, 2, 3");
            int choice = Integer.parseInt(args[0]);
            switch (choice) {
                case 1:
                    System.out.println("currentbalance" + accbalance);
                    break;
                case 2:
                    System.out.println("enter withdral amount");
                    double withdrawamount = Integer.parseInt(args[1]);

                    if (withdrawamount > 0 && withdrawamount <= accbalance) {
                        accbalance -= withdrawamount;
                        System.out.println("remaining balance" + accbalance);
                    } else {
                        System.out.println("insufficient balance");
                    }
                    break;

                case 3:
                    System.out.println("you entered exit");
                    break;
                default:
                    System.out.println("invalid choice");
            }
            break;
        }
    }
}
```

04. Develop a program to calculate the factorial of a non-negative number entered by the user using a loop (e.g., for, while). 
```java
package com.training.demo;

/*
 * 04. Develop a program to calculate the factorial of a non-negative number entered by the user using a loop (e.g., for, while). 
 */
public class ControlStatement4 {
    public static void main(String[] args) {
        int number = Integer.parseInt(args[0]);
        int factorial = 1;
        for (int i = 1; i <= number; i++) {
            factorial *= i;
        }
        System.out.println("Factorial of " + number + " is " + factorial);
    }

}
```

05. Write a program that prints the first 10 even numbers using a loop and the % operator to check for evenness.
```java
package com.training.demo;

/*
 * 05. Write a program that prints the first 10 even numbers using a loop and the % operator to check for evenness.
 */
public class ControlStatement5 {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }

}

```

#### Looping Statements

01. Print the numbers from 1 to 10 in reverse order using a for loop.
```java
package com.training.demo;
/*
 * 01. Print the numbers from 1 to 10 in reverse order using a forEach loop.
 */
public class LoopingStatements1 {
    public static void main(String[] args) {
        for (int i = 10; i >= 1; i--) {
            System.out.println(i);
        }
    }

}
```

02. Create a program that displays the first 15 Fibonacci numbers using a while loop.
```java
package com.training.demo;
/*
 * 02. Create a program that displays the first 15 Fibonacci numbers using a while loop.
 */
public class LoopingStatements2 {
    public static void main(String[] args) {
        int n = 15, firstTerm = 0, secondTerm = 1;
        System.out.println("First " + n + " terms: ");
        int i = 1;
        while (i <= n) {
            System.out.println(firstTerm);
            int nextTerm = firstTerm + secondTerm;
            firstTerm = secondTerm;
            secondTerm = nextTerm;
            i++;
        }
    }
}
```

03. Write a program that allows the user to enter numbers until they enter a negative number, and then print the sum of all the positive numbers entered.
```java
package com.training.demo;

import java.util.Scanner;

/*
 * 03. Write a program that allows the user to enter numbers until they enter a negative number, and then print the sum of all the positive numbers entered.
 */
public class LoopingStatements3 {
    public static void main(String[] args) {
        int number;
        int sum = 0;
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter numbers (enter a negative number to stop):");

            do {
                System.out.print("Enter a number: ");
                number = sc.nextInt();

                if (number >= 0) {
                    sum += number;
                }

            } while (number >= 0);
        }
        System.out.println("Sum of positive numbers entered: " + sum);

    }

}
```

04. Develop a program that prints a triangle of numbers in ascending order, with the number of rows entered by the user.
```java
package com.training.demo;

/*
 * 04. Develop a program that prints a triangle of numbers in ascending order, with the number of rows entered by the user.
 */
public class LoopingStatements4 {
    public static void main(String[] args) {
        int rows = 5;
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

}
```

05. Simulate a guessing game where the user has to guess a randomly generated number (between 1 and 100) within a limited number of attempts.
```java
package com.training.demo;

/*
 * 05. Simulate a guessing game where the user has to guess a randomly generated number (between 1 and 100) within a limited number of attempts.
 */
public class LoopingStatements5 {
    public static void main(String[] args) {
        int numberToGuess = (int) (Math.random() * 100) + 1;
        int attempts = 0;
        int maxAttempts = 5;
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        while (attempts < maxAttempts) {
            System.out.print("Enter your guess: ");
            int guess = scanner.nextInt();
            attempts++;
            if (guess == numberToGuess) {
                System.out.println("Congratulations! You guessed the number in " + attempts + " attempts.");
                break;
            } else if (guess < numberToGuess) {
                System.out.println("Your guess is too low.");
            } else {
                System.out.println("Your guess is too high.");
            }
        }
        if (attempts == maxAttempts) {
            System.out.println("Sorry, you have exhausted all your attempts. The number to guess was " + numberToGuess + ".");
        }
        scanner.close();
    }

}

```

#### Branch Statements

01. Write a program that uses a break statement to exit a loop when the user enters the letter 'q'.
```java
package com.training.demo;

/*
 * 01. Write a program that uses a break statement to exit a loop when the user enters the letter 'q'.
 */
public class BranchStatements1 {
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        while (true) {
            System.out.print("Enter a letter (enter 'q' to exit): ");
            String input = scanner.nextLine();
            if (input.equals("q")) {
                System.out.println("Exiting the program");
                break;
            }
        }
        scanner.close();
    }

}
```

02. Create a program that uses a continue statement to skip even numbers when printing the numbers from 1 to 10 in a loop.
```java
package com.training.demo;

/*
 * 02. Create a program that uses a continue statement to skip even numbers when printing the numbers from 1 to 10 in a loop.
 */
public class BranchStatements2 {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            if (i % 2 == 0) {
                continue;
            }
            System.out.println(i);
        }
    }

}
```

03. Develop a program that checks if a number entered by the user is prime using a loop and a break statement to exit once primality is determined.
```java
package com.training.demo;

import java.util.Scanner;

/*
* 03. Develop a program that checks if a number entered by the user is prime using a loop and a break statement to exit once primality is determined.
*/
public class BranchStatements3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Enter a number to check if it's prime (enter 0 to exit): ");
            int number = scanner.nextInt();

            if (number == -1) {
                System.out.println("Exiting the program");
                break;
            }

            if (isPrime(number)) {
                System.out.println(number + " is a prime number.");
            } else {
                System.out.println(number + " is not a prime number.");
            }
        }

        scanner.close();
    }

    private static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
```

04. Implement a program that calculates the simple interest based on principal, rate, and time using a nested if statement to check for valid input.
```java
package com.training.demo;

/*
 * 04. Implement a program that calculates the simple interest based on principal, rate, and time using a nested if statement to check for valid input.
 */
public class BranchStatements4 {
    public static void main(String[] args) {
        double principal = 1000;
        double rate = 5;
        double time = 2;
        if (principal < 0) {
            System.out.println("Principal cannot be negative.");
        } else if (rate < 0) {
            System.out.println("Rate cannot be negative.");
        } else if (time < 0) {
            System.out.println("Time cannot be negative.");
        } else {
            double simpleInterest = (principal * rate * time) / 100;
            System.out.println("Simple interest is " + simpleInterest);
        }
    }

}
```

05. Create a program that displays a different message based on the user's age using a series of if statements or a switch statement.
```java
package com.training.demo;

/*
 * 05. Create a program that displays a different message based on the user's age using a series of if statements or a switch statement.
 */
public class BranchStatements5 {
    public static void main(String[] args) {
        int age = 20;
        if (age < 13) {
            System.out.println("You are a child.");
        } else if (age < 20) {
            System.out.println("You are a teenager.");
        } else {
            System.out.println("You are an adult.");
        }
    }

}

```
