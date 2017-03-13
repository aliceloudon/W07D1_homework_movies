package com.codeclan.movieshomework;

/**
 * Created by user on 13/03/2017.
 */

public class Movie {

    private String title;
    private String genre;
    private double ranking;

    public Movie (String title, String genre, double ranking){
        this.title = title;
        this.genre = genre;
        this.ranking = ranking;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public double getRanking() {
        return ranking;
    }

    public void setRanking(double ranking) {
        this.ranking = ranking;
    }
}
