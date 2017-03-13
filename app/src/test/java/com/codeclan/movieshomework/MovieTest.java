package com.codeclan.movieshomework;

import org.junit.*;
import static org.junit.Assert.*;

/**
 * Created by user on 13/03/2017.
 */

public class MovieTest {

    Movie movie;

    @Before
    public void before(){
        movie = new Movie("Milk", "drama", 8);
    }

    @Test
    public void testMovieSetupTitle(){
        assertEquals("Milk", movie.getTitle());
    }

    @Test
    public void testMovieSetupGenre(){
        assertEquals("drama", movie.getGenre());
    }

    @Test
    public void testMovieSetupRanking(){
        assertEquals(8, movie.getRanking());
    }

    @Test
    public void testReturnToString(){
        assertEquals("Title: Milk, Genre: drama, Ranking: 8", movie.toString());
    }

}
