package com.codeclan.movieshomework;

import java.util.ArrayList;

/**
 * Created by user on 13/03/2017.
 */

public class Rankings {

    private ArrayList<Movie> movies;

    public Rankings(){
        movies = new ArrayList<Movie>();
    }

    public void addMovie(Movie movie){
        movies.add(movie);
    }

}


