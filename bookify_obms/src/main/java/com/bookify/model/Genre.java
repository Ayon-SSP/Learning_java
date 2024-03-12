package com.bookify.model;

public class Genre {
    private String genreId;
    private String genreName;
    private String genreDescription;

    public Genre() {
    }

    public Genre(String genreId, String genreName, String genreDescription) {
        this.genreId = genreId;
        this.genreName = genreName;
        this.genreDescription = genreDescription;
    }

    public String getGenreId() {
        return genreId;
    }

    public void setGenreId(String genreId) {
        this.genreId = genreId;
    }

    public String getGenreName() {
        return genreName;
    }

    public void setGenreName(String genreName) {
        this.genreName = genreName;
    }

    public String getGenreDescription() {
        return genreDescription;
    }

    public void setGenreDescription(String genreDescription) {
        this.genreDescription = genreDescription;
    }

    @Override
    public String toString() {
        return "Genre{" +
                "genreId='" + genreId + '\'' +
                ", genreName='" + genreName + '\'' +
                ", genreDescription='" + genreDescription + '\'' +
                '}';
    }
}