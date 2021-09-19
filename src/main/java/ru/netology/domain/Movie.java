package ru.netology.domain;

public class Movie {
    private int id;
    private int movieId;
    private String movieName;
    private String movieCategory;

    public Movie(int id, int movieId, String movieName, String movieCategory) {
        this.id = id;
        this.movieId = movieId;
        this.movieName = movieName;
        this.movieCategory = movieCategory;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getMovieId() {
        return movieId;
    }

    public void setMovieId(int movieId) {
        this.movieId = movieId;
    }

    public String getMovieName() {
        return movieName;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }

    public String getMovieCategory() {
        return movieCategory;
    }

    public void setMovieCategory(String movieCategory) {
        this.movieCategory = movieCategory;
    }
}
