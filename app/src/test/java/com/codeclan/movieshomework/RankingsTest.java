package com.codeclan.movieshomework;

import org.junit.*;
import java.util.ArrayList;
import static org.junit.Assert.*;

/**
 * Created by user on 13/03/2017.
 */

public class RankingsTest {

    @Test
    public void getMoviesTest(){
        Rankings movies = new Rankings();
        assertNotNull(movies.getMovies());
    }

    @Test
    public void testSetUpMovies(){
        Rankings movies = new Rankings();
        assertEquals(3, movies.getLength());
    }

    @Test
    public void testGetMovieAtIndex(){
        Rankings movies = new Rankings();
        assertEquals("Jaws", movies.getMovieAtIndex(0));
    }

    @Test
    public void testReplaceLastMovie(){
        Rankings movies = new Rankings();
        assertEquals("Toy Story", movies.getLastMovie());
    }

}
