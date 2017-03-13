package com.codeclan.movieshomework;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by user on 13/03/2017.
 */

public class MovieTest {

    Movie movie;

    @Before
    public void before(){
        movie = new Movie("Milk", "drama", 8.0);
    }

    @Test
    public void testMovieSetupTitle(){
        assertEquals("Milk", movie.getTitle());
    }

    @Test
    public void testMovieSetupGenre(){
        assertEquals("drama", movie.getGenre());
    }

}
