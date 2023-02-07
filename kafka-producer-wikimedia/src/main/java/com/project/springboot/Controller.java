package com.project.springboot;


import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @PostMapping("/message")
    public String messageController(@PathVariable String message){
        return message;
    }

}
