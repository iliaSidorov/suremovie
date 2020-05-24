package com.ilyasidorov.suremovies.controller;

import com.ilyasidorov.suremovies.model.Movie;
import com.ilyasidorov.suremovies.service.MovieService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/movie")
public class MovieController {

    private final MovieService movieService;

    public MovieController(MovieService movieService) {
        this.movieService = movieService;
    }


    @GetMapping("/all")
    public String getAllMovies(Model model) {
        model.addAttribute("movies", movieService.findAllMoviesByDate());
        model.addAttribute("count", movieService.countMovies());
        return "movie/allMovies";
    }

    @GetMapping("/allByThisDirector/{director}")
    public String getAllMoviesByDirector(@PathVariable("director") String director, Model model) {
        model.addAttribute("movies", movieService.findAllMoviesByThisDirector(director));
        return "movie/allByDirector";
    }

    //add movie
    @GetMapping("/add")
    public String getAddMovieForm(Model model) {
        return "movie/add-movie-form";
    }

    @PostMapping("/add")
    public String saveMovie(@ModelAttribute("movie") Movie movie) {
        movieService.saveMovie(movie);
        return "redirect:movie/allMovies";
    }

    @PostMapping("/save")
    public String createMovie() {
        return "";
    }
}
