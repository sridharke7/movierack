package io.movierack.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import io.swagger.annotations.ApiModelProperty;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "Movies")
public class Movie {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @ApiModelProperty(hidden = true)
    private int movieid;
    private String title;
    private String description;
    private String genre;
    private int rating;

    @JsonIgnore
    @ManyToMany(mappedBy = "favoritedMovies")
    private Set<User> users = new HashSet<>();

    public Set<User> getUsers() {
        return users;
    }


    public Movie() {

    }

    public Movie(int movieid, String title, String description, String genre, int rating) {
        this.movieid = movieid;
        this.title = title;
        this.description = description;
        this.genre = genre;
        this.rating = rating;
    }

    public int getMovieid() {
        return movieid;
    }

    public void setMovieid(int movieid) {
        this.movieid = movieid;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

}
