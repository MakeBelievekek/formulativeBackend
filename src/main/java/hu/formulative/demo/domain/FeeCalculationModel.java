package hu.formulative.demo.domain;

import lombok.ToString;

@ToString
public class FeeCalculationModel {
    private String project;
    private String buildConfig;
    private String version;
    private String calculation;
    private FeeCalculationParameterModel params;

    public FeeCalculationModel() {
    }

    public FeeCalculationModel(FeeCalculationParameterModel parameterModel) {
        this.project = "excelFelol";
        this.buildConfig = "default";
        this.version = "1.0.0";
        this.calculation = "yearlyFee.year";
        this.params = parameterModel;
    }

    public FeeCalculationModel(String project,
                               String buildConfig,
                               String version,
                               String calculation,
                               FeeCalculationParameterModel feeCalculationParameterModel) {
        this.project = project;
        this.buildConfig = buildConfig;
        this.version = version;
        this.calculation = calculation;
        this.params = feeCalculationParameterModel;
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

    public FeeCalculationParameterModel getParams() {
        return params;
    }

    public void setParams(FeeCalculationParameterModel params) {
        this.params = params;
    }

}
