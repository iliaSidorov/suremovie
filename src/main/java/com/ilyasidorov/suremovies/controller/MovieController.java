package com.ilyasidorov.suremovies.controller;

import com.ilyasidorov.suremovies.repository.MovieRepository;
import com.ilyasidorov.suremovies.service.MovieService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

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
        return "allMovies";
    }

    @GetMapping("/allByThisDirector/{director}")
    public String getAllMoviesByDirector(@PathVariable("director") String director, Model model) {
        model.addAttribute("movies", movieService.findAllMoviesByThisDirector(director));
        return "allByDirector";
    }

    @PostMapping("/save")
    public String createMovie() {
        return "";
    }
}
