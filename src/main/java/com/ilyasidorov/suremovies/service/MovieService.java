package com.ilyasidorov.suremovies.service;

import com.ilyasidorov.suremovies.model.Movie;

import java.util.List;

public interface MovieService {

    List<Movie> findAllMoviesByDate();
    List<Movie> findAllMoviesByThisDirector(String director);
    Long countMovies();
    void saveMovie(Movie movie);
}
