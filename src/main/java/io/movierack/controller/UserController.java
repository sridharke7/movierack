package io.movierack.controller;

import io.movierack.model.Movie;
import io.movierack.model.User;
import io.movierack.service.MovieService;
import io.movierack.service.UserService;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/api")
public class UserController {

    @Autowired
    private UserService userService;

    @Autowired
    private MovieService movieService;

    //get Movies
    @GetMapping("/GetUser")
    @ApiOperation(value = "Find users",
            notes = "Shows all users in Movie Rack",
            response = User.class)
    public List<User> getUser() {
        return userService.getUsers();
    }

    //get user by id
    @GetMapping("/GetUserById/{id}")
    @ApiOperation(value = "Find a user by id",
            notes = "Provide an user id to look up specific user from Movie Rack",
            response = User.class)
    public Optional<User> getUserById(@PathVariable int id) {
        return userService.getUserById(id);
    }

    //get Favorites for a user
    @GetMapping("/GetFavorites/{id}")
    @ApiOperation(value = "Find favorite movies of an user",
            notes = "Provide an user id to look up specific user's favorite movies",
            response = User.class)
    public Optional<User> getFavorites(@PathVariable int id) {
        return userService.getUserById(id);
    }

    // Add User
    @PostMapping("/addUser")
    @ApiOperation(value = "Add an user to Movie Rack",
            notes = "Provide user name, id, favorite genre to add an user to Movie Rack",
            response = User.class)
    public String addMovie(@RequestBody User user){
        userService.saveUser(user);
        return "User Added";
    }

    @PutMapping("/favorite/{userid}/movies/{id}")
    @ApiOperation(value = "Like a Movie",
            notes = "Add a bookmark to your favorite movie",
            response = User.class)
    User userFavoriteMovie(
            @PathVariable int userid,
            @PathVariable int id
    )
    {
        User user = userService.getOne(userid);
        Movie movie = movieService.getOne(id);
        user.likeMovie(movie);
        return userService.saveUser(user);
    }

}
