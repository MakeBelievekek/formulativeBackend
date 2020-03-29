package hu.formulative.demo.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import hu.formulative.demo.domain.Dummy;
import hu.formulative.demo.domain.RequestToken;
import hu.formulative.demo.domain.Result;
import hu.formulative.demo.domain.Token;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/api")
public class GreetingsController {

    private RestTemplate restTemplate  = new RestTemplate();
    ObjectMapper mapper = new ObjectMapper();



    @GetMapping
    public ResponseEntity getFee() throws JsonProcessingException {
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);
        headers.set("Authorization", "Bearer " + "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJpc3MiOiJodHRwczovL2Zvcm11bGF0aXZlLmlvL2FwaSIsInN1YiI6IjA4MzdlMDlmY2RiZjk4MDVjYjgwZjY1Yjk5YjE3OWU3IiwiYXVkIjoiaHR0cHM6Ly9mb3JtdWxhdGl2ZS5pby9hcGkiLCJleHAiOjE1ODU1Njc2MjksIm93bmVyIjoiLU0zNm1EMDN1OFJHU0cxZ2xXeTEiLCJpYXQiOjE1ODU0ODEyMjl9.jTq2Tum1mC9tfJjmOzeytAGrcNSBGt5f278NOrmuBk8");

        String body = mapper.writeValueAsString(new Dummy());

        HttpEntity<String> entity = new HttpEntity<String>(body, headers);
        Result result = restTemplate.postForObject("https://formulative.io/api/calculate", entity, Result.class);
        return new ResponseEntity(result, HttpStatus.OK);
    }

    @GetMapping(path = "/token")
    public ResponseEntity getToken() throws JsonProcessingException {
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);

        String body = mapper.writeValueAsString(new RequestToken());

        HttpEntity<String> entity = new HttpEntity<String>(body, headers);
        Token result = restTemplate.postForObject("https://formulative.io/api/oauth/token", entity, Token.class);
        return new ResponseEntity(result, HttpStatus.OK);
    }




}

