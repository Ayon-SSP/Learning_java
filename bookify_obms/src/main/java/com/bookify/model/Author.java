package com.bookify.model;

public class Author {
    private String authorId;
    private String authorName;
    private String authorBio;

    public Author() {
    }

    public Author(String authorId, String authorName, String authorBio) {
        this.authorId = authorId;
        this.authorName = authorName;
        this.authorBio = authorBio;
    }

    public String getAuthorId() {
        return authorId;
    }

    public void setAuthorId(String authorId) {
        this.authorId = authorId;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public String getAuthorBio() {
        return authorBio;
    }

    public void setAuthorBio(String authorBio) {
        this.authorBio = authorBio;
    }

    @Override
    public String toString() {
        return "Author{" +
                "authorId='" + authorId + '\'' +
                ", authorName='" + authorName + '\'' +
                ", authorBio='" + authorBio + '\'' +
                '}';
    }
}