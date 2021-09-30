package io.movierack.model;

import io.swagger.annotations.ApiModelProperty;
import io.swagger.annotations.ApiParam;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "Users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @ApiModelProperty(hidden = true)
    private int userid;
    private String username;
    private String favoritegenre;

    @ManyToMany
    @JoinTable(
            name="user_favorites",
            joinColumns = @JoinColumn(name = "userid"),
            inverseJoinColumns = @JoinColumn(name = "movieid")
    )
    @ApiModelProperty(hidden = true)
    private Set<Movie> favoritedMovies = new HashSet<>();

    public Set<Movie> getFavoritedMovies() {
        return favoritedMovies;
    }

    public User(){

    }

    public User(int userid, String username, String favoritegenre) {
        this.userid = userid;
        this.username = username;
        this.favoritegenre = favoritegenre;
    }

    public int getUserid() {
        return userid;
    }

    public void setUserid(int userid) {
        this.userid = userid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getFavoritegenre() {
        return favoritegenre;
    }

    public void setFavoritegenre(String favoritegenre) {
        this.favoritegenre = favoritegenre;
    }

    public void likeMovie(Movie movie) {
        favoritedMovies.add(movie);
    }
}
