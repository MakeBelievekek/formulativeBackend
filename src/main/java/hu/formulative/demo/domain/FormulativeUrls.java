package hu.formulative.demo.domain;

public enum FormulativeUrls {
    TOKEN("https://formulative.io/api/oauth/token"),
    CALCULATE("https://formulative.io/api/calculate");

    private String formulativeURL;

    FormulativeUrls(String url) {
        this.formulativeURL = url;
    }

    public String getFormulativeURL() {
        return formulativeURL;
    }
}
