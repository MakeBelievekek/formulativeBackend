package hu.formulative.demo.domain;

import lombok.ToString;

@ToString
public class RequestToken {
    private String grant_type;
    private String client_id;
    private String client_secret;

    public RequestToken() {
        this.grant_type = "client_credentials";
        this.client_id = "0837e09fcdbf9805cb80f65b99b179e7";
        this.client_secret = "b65da4bf8ef805b5d8d355e97661e90b19a60b613f21d225f1126cd3e4899908";
    }

    public RequestToken(String grant_type, String client_id, String client_secret) {
        this.grant_type = grant_type;
        this.client_id = client_id;
        this.client_secret = client_secret;
    }

    public String getGrant_type() {
        return grant_type;
    }

    public void setGrant_type(String grant_type) {
        this.grant_type = grant_type;
    }

    public String getClient_id() {
        return client_id;
    }

    public void setClient_id(String client_id) {
        this.client_id = client_id;
    }

    public String getClient_secret() {
        return client_secret;
    }

    public void setClient_secret(String client_secret) {
        this.client_secret = client_secret;
    }
}
