package com.bookify.model;

import java.sql.Date;

public class Book {
    private String bookId;
    private String authorId;
    private String categoryId;
    private String genreIds;
    private String bookTitle;
    private String bookDescription;
    private Date bookPublishDate;
    private double bookPrice;
    private int discontinued;
    private int bookPages;
    private double bookDiscount;
    private int availableQuantity;
    private String bookLanguage;
    private String bookPublisher;
    private String bookIsbn;
    private String bookCoverImage;

    public Book() {
    }

    public Book(String bookId, String authorId, String categoryId, String genreIds, String bookTitle, String bookDescription, Date bookPublishDate, double bookPrice, int discontinued, int bookPages, double bookDiscount, int availableQuantity, String bookLanguage, String bookPublisher, String bookIsbn, String bookCoverImage) {
        this.bookId = bookId;
        this.authorId = authorId;
        this.categoryId = categoryId;
        this.genreIds = genreIds;
        this.bookTitle = bookTitle;
        this.bookDescription = bookDescription;
        this.bookPublishDate = bookPublishDate;
        this.bookPrice = bookPrice;
        this.discontinued = discontinued;
        this.bookPages = bookPages;
        this.bookDiscount = bookDiscount;
        this.availableQuantity = availableQuantity;
        this.bookLanguage = bookLanguage;
        this.bookPublisher = bookPublisher;
        this.bookIsbn = bookIsbn;
        this.bookCoverImage = bookCoverImage;
    }

    public String getBookId() {
        return bookId;
    }

    public void setBookId(String bookId) {
        this.bookId = bookId;
    }

    public String getAuthorId() {
        return authorId;
    }

    public void setAuthorId(String authorId) {
        this.authorId = authorId;
    }

    public String getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(String categoryId) {
        this.categoryId = categoryId;
    }

    public String getGenreIds() {
        return genreIds;
    }

    public void setGenreIds(String genreIds) {
        this.genreIds = genreIds;
    }

    public String getBookTitle() {
        return bookTitle;
    }

    public void setBookTitle(String bookTitle) {
        this.bookTitle = bookTitle;
    }

    public String getBookDescription() {
        return bookDescription;
    }

    public void setBookDescription(String bookDescription) {
        this.bookDescription = bookDescription;
    }

    public Date getBookPublishDate() {
        return bookPublishDate;
    }

    public void setBookPublishDate(Date bookPublishDate) {
        this.bookPublishDate = bookPublishDate;
    }

    public double getBookPrice() {
        return bookPrice;
    }

    public void setBookPrice(double bookPrice) {
        this.bookPrice = bookPrice;
    }


    public int getDiscontinued() {
        return discontinued;
    }

    public void setDiscontinued(int discontinued) {
        this.discontinued = discontinued;
    }

    public int getBookPages() {
        return bookPages;
    }

    public void setBookPages(int bookPages) {
        this.bookPages = bookPages;
    }

    public double getBookDiscount() {
        return bookDiscount;
    }

    public void setBookDiscount(double bookDiscount) {
        this.bookDiscount = bookDiscount;
    }

    public int getAvailableQuantity() {
        return availableQuantity;
    }

    public void setAvailableQuantity(int availableQuantity) {
        this.availableQuantity = availableQuantity;
    }

    public String getBookLanguage() {
        return bookLanguage;
    }

    public void setBookLanguage(String bookLanguage) {
        this.bookLanguage = bookLanguage;
    }

    public String getBookPublisher() {
        return bookPublisher;
    }

    public void setBookPublisher(String bookPublisher) {
        this.bookPublisher = bookPublisher;
    }

    public String getBookIsbn() {
        return bookIsbn;
    }

    public void setBookIsbn(String bookIsbn) {
        this.bookIsbn = bookIsbn;
    }

    public String getBookCoverImage() {
        return bookCoverImage;
    }

    public void setBookCoverImage(String bookCoverImage) {
        this.bookCoverImage = bookCoverImage;
    }

    @Override
    public String toString() {
        return "Book{" +
                "bookId='" + bookId + '\'' +
                ", authorId='" + authorId + '\'' +
                ", categoryId='" + categoryId + '\'' +
                ", genreIds='" + genreIds + '\'' +
                ", bookTitle='" + bookTitle + '\'' +
                ", bookDescription='" + bookDescription + '\'' +
                ", bookPublishDate=" + bookPublishDate +
                ", bookPrice=" + bookPrice +
                ", discontinued=" + discontinued +
                ", bookPages=" + bookPages +
                ", bookDiscount=" + bookDiscount +
                ", availableQuantity=" + availableQuantity +
                ", bookLanguage='" + bookLanguage + '\'' +
                ", bookPublisher='" + bookPublisher + '\'' +
                ", bookIsbn='" + bookIsbn + '\'' +
                ", bookCoverImage='" + bookCoverImage + '\'' +
                '}';
    }
}