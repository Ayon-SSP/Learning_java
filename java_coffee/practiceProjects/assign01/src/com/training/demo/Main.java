package com.training.demo;

import com.training.demo.model.Book;
public class Main {
    // Create object of Book Class where Book (id,bookName,authorName)
    public static void main(String[] args) {
        Book book1 = new Book("Java", "James Gosling");
        Book book2 = new Book(2, "C++", "Bjarne Stroustrup");
        Book book3 = new Book("Python", "Guido van Rossum");
        Book book4 = new Book(4, "C", "Dennis Ritchie");
        Book book5 = new Book("C#", "Anders Hejlsberg");
        Book book6 = new Book(6, "JavaScript", "Brendan Eich");

        // display using toString method using for loop
        Book[] books = {book1, book2, book3, book4, book5, book6};
        for (Book book : books) {
            System.out.println(book);
        }
    }
}