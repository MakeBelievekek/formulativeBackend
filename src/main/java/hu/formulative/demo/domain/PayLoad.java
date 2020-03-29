package hu.formulative.demo.domain;

public class PayLoad {
    private String day;
    private String amountOfInsurance;
    private String year;
    private String month;
    private String lengthOfInsurance;
    private String numberOfInsured;
    private String chargeFrequency;
    private String policyDiscount;
    private String paymentMethodDiscount;
    private String customerDiscount;
    private String campaignDiscount;

    public PayLoad() {
        this.day = "30";
        this.amountOfInsurance = "5000000";
        this.year = "1981";
        this.month = "12";
        this.lengthOfInsurance = "10";
        this.numberOfInsured = "3";
        this.chargeFrequency = "1";
        this.policyDiscount = "0.1";
        this.paymentMethodDiscount = "1";
        this.customerDiscount = "1";
        this.campaignDiscount = "1";
    }

    public PayLoad(String day,
                   String amountOfInsurance,
                   String year,
                   String month,
                   String lengthOfInsurance,
                   String numberOfInsured,
                   String chargeFrequency,
                   String policyDiscount,
                   String paymentMethodDiscount,
                   String customerDiscount,
                   String campaignDiscount) {
        this.day = day;
        this.amountOfInsurance = amountOfInsurance;
        this.year = year;
        this.month = month;
        this.lengthOfInsurance = lengthOfInsurance;
        this.numberOfInsured = numberOfInsured;
        this.chargeFrequency = chargeFrequency;
        this.policyDiscount = policyDiscount;
        this.paymentMethodDiscount = paymentMethodDiscount;
        this.customerDiscount = customerDiscount;
        this.campaignDiscount = campaignDiscount;
    }

    public String getDay() {
        return day;
    }

    public void setDay(String day) {
        this.day = day;
    }

    public String getAmountOfInsurance() {
        return amountOfInsurance;
    }

    public void setAmountOfInsurance(String amountOfInsurance) {
        this.amountOfInsurance = amountOfInsurance;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getMonth() {
        return month;
    }

    public void setMonth(String month) {
        this.month = month;
    }

    public String getLengthOfInsurance() {
        return lengthOfInsurance;
    }

    public void setLengthOfInsurance(String lengthOfInsurance) {
        this.lengthOfInsurance = lengthOfInsurance;
    }

    public String getNumberOfInsured() {
        return numberOfInsured;
    }

    public void setNumberOfInsured(String numberOfInsured) {
        this.numberOfInsured = numberOfInsured;
    }

    public String getChargeFrequency() {
        return chargeFrequency;
    }

    public void setChargeFrequency(String chargeFrequency) {
        this.chargeFrequency = chargeFrequency;
    }

    public String getPolicyDiscount() {
        return policyDiscount;
    }

    public void setPolicyDiscount(String policyDiscount) {
        this.policyDiscount = policyDiscount;
    }

    public String getPaymentMethodDiscount() {
        return paymentMethodDiscount;
    }

    public void setPaymentMethodDiscount(String paymentMethodDiscount) {
        this.paymentMethodDiscount = paymentMethodDiscount;
    }

    public String getCustomerDiscount() {
        return customerDiscount;
    }

    public void setCustomerDiscount(String customerDiscount) {
        this.customerDiscount = customerDiscount;
    }

    public String getCampaignDiscount() {
        return campaignDiscount;
    }

    public void setCampaignDiscount(String campaignDiscount) {
        this.campaignDiscount = campaignDiscount;
    }

    @Override
    public String toString() {
        return "PayLoad{" +
                "day='" + day + '\'' +
                ", amountOfInsurance='" + amountOfInsurance + '\'' +
                ", year='" + year + '\'' +
                ", month='" + month + '\'' +
                ", lengthOfInsurance='" + lengthOfInsurance + '\'' +
                ", numberOfInsured='" + numberOfInsured + '\'' +
                ", chargeFrequency='" + chargeFrequency + '\'' +
                ", policyDiscount='" + policyDiscount + '\'' +
                ", paymentMethodDiscount='" + paymentMethodDiscount + '\'' +
                ", customerDiscount='" + customerDiscount + '\'' +
                ", campaignDiscount='" + campaignDiscount + '\'' +
                '}';
    }
}
