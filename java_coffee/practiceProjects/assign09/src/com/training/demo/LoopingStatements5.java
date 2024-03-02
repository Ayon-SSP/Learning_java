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
