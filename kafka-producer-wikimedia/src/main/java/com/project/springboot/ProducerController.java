package com.project.springboot;

import com.project.springboot.Service.WikimediaChangeProducer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@SpringBootApplication
public class ProducerController implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(ProducerController.class);
    }

    @Autowired
    private WikimediaChangeProducer wikimediaChangeProducer;


    @PostMapping("/message")
    public String messageController(@PathVariable String message){
        return message;
    }


    @Override
    public void run(String... args) throws Exception {
        wikimediaChangeProducer.sendMessage();
    }
}
