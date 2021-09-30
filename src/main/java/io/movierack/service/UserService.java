package io.movierack.service;

import io.movierack.model.User;
import io.movierack.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    //get all users
    public List<User> getUsers(){
        return userRepository.findAll();
    }

    //get user by Id
    public Optional<User> getUserById(int id){
        return userRepository.findById(id);
    }

    // Create a new user
    public User saveUser(User user){
        userRepository.save(user);
        return user;
    }

    public User getOne(int userid){
        return userRepository.findById(userid).get(); }

}
