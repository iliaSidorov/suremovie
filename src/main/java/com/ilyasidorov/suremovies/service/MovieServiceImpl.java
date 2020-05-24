package com.ilyasidorov.suremovies.service;

import com.ilyasidorov.suremovies.model.Movie;
import com.ilyasidorov.suremovies.repository.MovieRepository;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MovieServiceImpl implements MovieService {

    private final MovieRepository movieRepository;

    public MovieServiceImpl(MovieRepository movieRepository) {
        this.movieRepository = movieRepository;
    }

    @Override
    public List<Movie> findAllMoviesByDate() {
        return movieRepository.findByOrderByDateDesc();
    }

    @Override
    public Long countMovies() {
        return movieRepository.count();
    }

    @Override
    public List<Movie> findAllMoviesByThisDirector(String director) {
        return movieRepository.findAllByDirectorEquals(director);
    }

    @Override
    public void saveMovie(Movie movie) {
        movieRepository.save(movie);
    }
}
