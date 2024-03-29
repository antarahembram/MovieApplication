package com.stackroute.service;

import com.stackroute.domain.Movie;
import com.stackroute.repository.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MovieServiceImpl implements MovieService {

    @Autowired
    MovieRepository movieRepository;

    public MovieServiceImpl(MovieRepository movieRepository) {
        this.movieRepository = movieRepository;
    }

    @Override
    public Movie saveMovie(Movie movie) {
        Movie savedMovie= movieRepository.save(movie);
        return savedMovie;
    }

    @Override
    public List<Movie> listMovie() {
        return movieRepository.findAll();
    }


    @Override
    public Movie update(Movie movie) {
        Movie updatedMovie=movieRepository.findById(movie.getMovieId()).get();
        if(movie.getMovieTitle()!=null)
            updatedMovie.setMovieTitle(movie.getMovieTitle());
        if(movie.getGenere()!=null)
            updatedMovie.setGenere(movie.getGenere());
        if(movie.getLanguage()!=null)
            updatedMovie.setLanguage(movie.getLanguage());
        if(movie.getVoteCount()!=0)
            updatedMovie.setVoteCount(movie.getVoteCount());
        if(movie.getStatus()!=null)
            updatedMovie.setStatus(movie.getStatus());
        if(movie.getBudget().intValue()!=0)
            updatedMovie.setBudget(movie.getBudget());

        return movieRepository.save(updatedMovie);
    }

    @Override
    public Movie deleteMovie(Integer movieId) {
        Movie movie=movieRepository.findById(movieId).get();
        movieRepository.deleteById(movieId);
    return movie;
    }

}
