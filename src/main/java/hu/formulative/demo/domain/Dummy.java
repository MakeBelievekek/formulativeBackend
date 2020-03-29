package hu.formulative.demo.domain;

import lombok.NoArgsConstructor;


public class Dummy {
    private String project;
    private String buildConfig;
    private String version;
    private String calculation;
    private PayLoad params;

    public Dummy() {
        this.project = "excelFelol";
        this.buildConfig = "default";
        this.version = "1.0.0";
        this.calculation = "yearlyFee.year";
        this.params = new PayLoad();
    }

    public Dummy(String project,
                 String buildConfig,
                 String version,
                 String calculation,
                 PayLoad payLoad) {
        this.project = project;
        this.buildConfig = buildConfig;
        this.version = version;
        this.calculation = calculation;
        this.params = payLoad;
    }

    public String getProject() {
        return project;
    }

    public void setProject(String project) {
        this.project = project;
    }

    public String getBuildConfig() {
        return buildConfig;
    }

    public void setBuildConfig(String buildConfig) {
        this.buildConfig = buildConfig;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getCalculation() {
        return calculation;
    }

    public void setCalculation(String calculation) {
        this.calculation = calculation;
    }

    public PayLoad getParams() {
        return params;
    }

    public void setParams(PayLoad params) {
        this.params = params;
    }

    @Override
    public String toString() {
        return "Dummy{" +
                "project='" + project + '\'' +
                ", buildConfig='" + buildConfig + '\'' +
                ", version='" + version + '\'' +
                ", calculation='" + calculation + '\'' +
                ", params=" + params +
                '}';
    }
}
