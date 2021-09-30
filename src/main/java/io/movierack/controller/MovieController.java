package io.movierack.controller;

import io.movierack.model.Movie;
import io.movierack.service.MovieService;
import io.movierack.service.UserService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/api")
public class MovieController {

    @Autowired
    private MovieService movieService;

    @Autowired
    private UserService userService;

    //get Movies
    @GetMapping("/GetMovies")
    @ApiOperation(value = "Shows movies on execute",
                 notes = "Displays a list of all available movies from Movie Rack",
                 response = Movie.class)
    public List<Movie> getMovies() {
        return movieService.getMovies();
    }

    // Create Movie
    @PostMapping("/addMovie")
    @ApiOperation(value = "Expands Movie Racks collection by adding a movie",
            notes = "Provide a movie title, Id, Genre, Description to add a movie to Movie Rack",
            response = Movie.class)
    public String addMovie(@RequestBody Movie movie){
        movieService.saveMovie(movie);
        return "Movie Saved";
    }

    //get movie by ID
    @GetMapping("/GetMoviesById/{movieid}")
    @ApiOperation(value = "Find a movie by id",
            notes = "Provide an Id to look up specific movie from Movie Rack",
            response = Movie.class)
    public Optional<Movie> getMovieById(@PathVariable int movieid) {
        return movieService.getMovieById(movieid);
    }

    //get movie by Genre
    @GetMapping("/GetMovieByGenre/{genre}")
    @ApiOperation(value = "Find movies by genre",
            notes = "Lists a movie of specific genre from Movie Rack",
            response = Movie.class)
    public List<Movie> getMovieByGenre (@PathVariable String genre){
        return movieService.getMovieByGenre(genre);
    }

    //get movie by Title
    @GetMapping("/GetMovieByTitle/{title}")
    @ApiOperation(value = "Find a movie by Title",
            notes = "Provide a movie title to look up specific movie from Movie Rack",
            response = Movie.class)
    public List<Movie> getMovieByTitle (@PathVariable String title){
        return movieService.getMovieByTitle(title);
    }

    //get movie by Title
    @GetMapping("/GetMovieTitleWith/{title}")
    @ApiOperation(value = "Find movies with a search keyword",
            notes = "Not sure about the movie title? Search with a keyword to look up specific titles from Movie Rack",
            response = Movie.class)
    public List<Movie> getMovieTitleWith (@PathVariable String title){
        return movieService.getMovieTitleWith(title);
    }

}
