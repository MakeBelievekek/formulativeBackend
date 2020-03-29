package hu.formulative.demo.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import hu.formulative.demo.domain.CalculatedFeeModel;
import hu.formulative.demo.domain.FeeCalculationModel;
import hu.formulative.demo.domain.Token;
import hu.formulative.demo.services.TokenService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import static hu.formulative.demo.domain.FormulativeUrls.CALCULATE;

@RestController
@RequestMapping("/api")
public class GreetingsController {
    private RestTemplate restTemplate;
    private ObjectMapper mapper;
    private TokenService tokenService;

    @Autowired
    public GreetingsController(RestTemplate template, ObjectMapper objectMapper, TokenService tokenService) {
        this.restTemplate = template;
        this.mapper = objectMapper;
        this.tokenService = tokenService;
    }

    @GetMapping
    public ResponseEntity<CalculatedFeeModel> getFee() throws JsonProcessingException {
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);
        Token token = this.tokenService.getToken();
        headers.set("Authorization", token.getToken_type() + token.getAccess_token());

        String body = mapper.writeValueAsString(new FeeCalculationModel());

        HttpEntity<String> entity = new HttpEntity<>(body, headers);
        CalculatedFeeModel calculatedFeeModel = restTemplate.postForObject(CALCULATE.getFormulativeURL(), entity, CalculatedFeeModel.class);
        return new ResponseEntity<>(calculatedFeeModel, HttpStatus.OK);
    }

}

