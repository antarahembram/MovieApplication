package com.stackroute;

import org.junit.jupiter.api.Test;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MovieControllerTest {
    @Test
    public void saveMovieTest()
    {
        System.out.println("This is testing saveMovie()");
    }

    @Test
    public void getMovieListTest()
    {
        System.out.println("This is testing getMovieList()");
    }

    @Test
    public void updateMovieTest()
    {
        System.out.println("This is testing updateMovie()");
    }

    @Test
    public void deleteMovieTest()
    {
        System.out.println("This is testing deleteMovie()");
    }


}
