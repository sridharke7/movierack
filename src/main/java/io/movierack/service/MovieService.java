package io.movierack.service;

import io.movierack.model.Movie;
import io.movierack.model.User;
import io.movierack.repository.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MovieService {

    @Autowired
    private MovieRepository movieRepository;

    public Movie saveMovie(Movie movie){
        movieRepository.save(movie);
        return movie;
    }

    public List<Movie> getMovies(){
        return movieRepository.findAll();
    }

    public Optional<Movie> getMovieById(int movieid){
        return movieRepository.findById(movieid);
    }

   public List<Movie> getMovieByGenre(String genre){
        return movieRepository.findByGenre(genre);
    }

    public List<Movie> getMovieByTitle(String title){
        return movieRepository.findByTitle(title);
    }

    public List<Movie> getMovieTitleWith(String title){
        return movieRepository.FindTitleWith(title);
    }

    public Movie getOne(int movieid){
        return movieRepository.findById(movieid).get();
    }

}
