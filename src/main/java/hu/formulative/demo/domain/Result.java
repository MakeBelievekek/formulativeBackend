package hu.formulative.demo.domain;

import lombok.ToString;

@ToString
public class Result {
    private Integer yearlyFee;

    public Integer getYearlyFee() {
        return yearlyFee;
    }

    public void setYearlyFee(Integer yearlyFee) {
        this.yearlyFee = yearlyFee;
    }
}
