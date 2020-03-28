package hu.formulative.demo.controller;

import hu.formulative.demo.domain.Dummy;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class GreetingsController {

    @GetMapping("/deep")
    public ResponseEntity greetings() {

        return new ResponseEntity<>("Hello world", HttpStatus.OK);
    }

    @GetMapping
    public ResponseEntity deeper() {

        Dummy dummy = new Dummy();
        dummy.setName("hello!!!");
        return new ResponseEntity<>(dummy, HttpStatus.OK);
    }

}

