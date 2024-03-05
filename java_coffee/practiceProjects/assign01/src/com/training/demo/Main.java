package com.training.demo;

import java.util.Scanner;

import com.training.demo.model.Book;
public class Main {
    // Create object of Book Class where Book (id,bookName,authorName)
    public static void main(String[] args) {
        // Book book1 = new Book("Java", "James Gosling");
        // Book book2 = new Book(2, "C++", "Bjarne Stroustrup");
        // Book book3 = new Book("Python", "Guido van Rossum");
        // Book book4 = new Book(4, "C", "Dennis Ritchie");
        // Book book5 = new Book("C#", "Anders Hejlsberg");
        // Book book6 = new Book(6, "JavaScript", "Brendan Eich");

        // // display using toString method using for loop
        // Book[] books = {book1, book2, book3, book4, book5, book6};
        // for (Book book : books) {
        //     System.out.println(book);
        // }


        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter no. of Books to be created: ");
        int noOfBooks = scanner.nextInt();
        Book[] books = new Book[noOfBooks];

        for( int i = 0; i < noOfBooks; i++) {
            System.out.println("Enter Book Name: ");
            String bookName = scanner.next();
            System.out.println("Enter Author Name: ");
            String authorName = scanner.next();
            books[i] = new Book(bookName, authorName);
        }

        System.out.println("Books created are: ");
        for (Book book : books) {
            System.out.println(book);
        }

        // update book details input book id
        boolean iterate = true;
        while (iterate) {
            System.out.println("Enter Book Id to be updated: ");
            int bookId = scanner.nextInt();
            for (Book book : books) {
                if (book.getId() == bookId) {
                    System.out.println("Enter new Book Name: ");
                    String bookName = scanner.next();
                    System.out.println("Enter new Author Name: ");
                    String authorName = scanner.next();
                    book.setBookName(bookName);
                    book.setAuthorName(authorName);
                    System.out.println("Book updated successfully: ");
                    System.out.println(book);
                    iterate = false;
                    break;
                }
            }
            if (iterate) {
                System.out.println("Book Id not found. Please enter valid Book Id.");
            }
        }

        // display book details input book id
        System.out.println("Enter Book Id to display details: ");
        int bookId = scanner.nextInt();
        for (Book book : books) {
            if (book.getId() == bookId) {
                System.out.println("Book details: ");
                System.out.println(book);
                break;
            }
            if (iterate) {
                System.out.println("Book Id not found. Please enter valid Book Id.");
            }
        }
        scanner.close();
    }
}