package com.boobathi.simpleWebApp.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//@Controller  // said the spring this class is controller who manages the client request
@RestController // instead of send responce as file here it send the data
public class HomeController {

    @RequestMapping("/")   // mention what should we say when url in "/" this endpoint
//    @ResponseBody   // instead send the response as page or file . we send a data from server to client
    public String greet(){
        return "Welcome to the java world !!";
    }

    @RequestMapping("/about")
    public String about(){
        return "Welcome we are learning and in the about page";
    }
}
