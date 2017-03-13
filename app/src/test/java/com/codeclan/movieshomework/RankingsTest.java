package com.codeclan.movieshomework;

import org.junit.*;
import java.util.ArrayList;
import static org.junit.Assert.*;

/**
 * Created by user on 13/03/2017.
 */

public class RankingsTest {

    Movie movie1;
    Movie movie2;

    @Before
    public void before(){
        movie1 = new Movie("Toy Story", "Children", 9);
        movie2 = new Movie("Silver Linings Playbook", "Romance", 8);
    }

}
