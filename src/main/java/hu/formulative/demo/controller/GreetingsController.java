package hu.formulative.demo.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingsController {

    @GetMapping
    public ResponseEntity greetings() {

        return new ResponseEntity<>("Hello world", HttpStatus.OK);
    }

    @GetMapping("/deep")
    public ResponseEntity deeper() {

        return new ResponseEntity<>("this is one step deeper", HttpStatus.OK);
    }

}

