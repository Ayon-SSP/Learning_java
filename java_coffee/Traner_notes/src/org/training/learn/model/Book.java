package org.training.learn.model;

public class Book {
    // Fields(class members, Instance variables) [A variable which is created inside the class but outside the method is known as an instance variable. Instance variable doesn't get memory at compile time. It gets memory at runtime when an object or instance is created. That is why it is known as an instance variable.]
    private int id;
    private String bookName;
    private String authorName;
    private static int counter;

    // Constructors
    public Book() {}
    public Book(String bookName, String authorName) {
        this.bookName = bookName;
        this.authorName = authorName;
    }
    public Book(int id, String bookName, String authorName) {
        this.id = id;
        this.bookName = bookName;
        this.authorName = authorName;
    }

    // Methods (class members, Instance methods)
    public int getId() {
        return id;
    }

    public String getBookName() {
        return bookName;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    @Override
    public String toString() {
        return "Book [authorName=" + authorName + ", bookName=" + bookName + ", id=" + id + "]";
    }

    
    // Blocks
    {
        // public int blockContent = 6; local variable
        System.out.println("non static init block");
        this.id=++counter;
        System.out.println("New account number:"+this.id+" for "+this.bookName);
    }
    static {
        System.out.println("static init block");
        counter=0;
    }

    /*
    // Nested class
    public static class NestedClass {
        // Nested class code
    }
    
    // Nested interface
    public interface NestedInterface {
        // Nested interface code
    }
     */

}
