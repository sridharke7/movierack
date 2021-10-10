package io.movierack.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @GetMapping("/")
    public String home(){
        return ("<h1>Welcome to MovieRack</h1>");
    }

    @GetMapping("/user")
    public String user(){
        return ("<h1>Welcome User</h1>");
    }
}
