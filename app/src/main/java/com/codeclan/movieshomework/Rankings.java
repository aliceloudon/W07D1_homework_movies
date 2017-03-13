package com.codeclan.movieshomework;

import java.util.ArrayList;
import com.codeclan.movieshomework.Movie;

import static android.R.id.list;

/**
 * Created by user on 13/03/2017.
 */

public class Rankings {

    private ArrayList<Movie> movies;

    public Rankings(){
        movies = new ArrayList<Movie>();
        setUpMovies();
    }

    public ArrayList<Movie> getMovies() {
        return movies;
    }

    public void setUpMovies(){
        Movie[] moviesToAdd = {
            new Movie("Jaws", "Horror", 3),
            new Movie("Jaws II", "Horror", 2),
            new Movie("Jaws III", "Horror", 1)
        };

        for ( Movie movie : moviesToAdd )
            movies.add(movie);
    }

    public int getLength(){
        return movies.size();
    }

    public String getMovieAtIndex(int index){
        Movie result = movies.get(index);
        return result.getTitle();
    }

    public String getMovieWithRanking(int ranking){
        for (Movie movie : movies)
            if (movie.getRanking() == (ranking)){
                return movie.getTitle();
            }
            return null;
    }

    public String getLastMovie(){
        int listSize = getLength();
        String movieName = getMovieAtIndex(listSize - 1);
        return movieName;
    }

    public void removeLastMovie(){
        int listSize = getLength();
        movies.remove(listSize - 1);
    }

    public void replaceLastMovie(){
        removeLastMovie();
        Movie newMovie = new Movie("Toy Story", "Children", 1);
        movies.add(newMovie);
    }

    public String getMovieGenreWithTitle(String title){
        for (Movie movie : movies)
            if (movie.getTitle() == (title)){
                return movie.getGenre();
            }
        return null;
    }

}
