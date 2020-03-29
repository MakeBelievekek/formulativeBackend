package hu.formulative.demo.services;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import hu.formulative.demo.domain.RequestToken;
import hu.formulative.demo.domain.Token;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import static hu.formulative.demo.domain.FormulativeUrls.TOKEN;

@Service
public class TokenService {
    private ObjectMapper mapper;
    private RestTemplate restTemplate;

    public TokenService(ObjectMapper mapper, RestTemplate restTemplate) {
        this.mapper = mapper;
        this.restTemplate = restTemplate;
    }


    public Token getToken() throws JsonProcessingException {
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);

        String body = mapper.writeValueAsString(new RequestToken());

        HttpEntity<String> entity = new HttpEntity<>(body, headers);
        return restTemplate.postForObject(TOKEN.getFormulativeURL(), entity, Token.class);
    }
}