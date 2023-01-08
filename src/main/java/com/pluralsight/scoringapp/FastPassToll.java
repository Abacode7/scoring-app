package com.pluralsight.scoringapp;

public class FastPassToll {

    private String fastPassId;
    
    private String stationId;
    
    private Float amountPaid;
    
    private String status;
    
    private Boolean isFraud;
    
    public FastPassToll() {
    }

    public FastPassToll(String fastPassId, String stationId, Float amountPaid, String status, Boolean isFraud) {
        this.fastPassId = fastPassId;
        this.stationId = stationId;
        this.amountPaid = amountPaid;
        this.status = status;
        this.isFraud = isFraud;
    }
    
    public String getFastPassId() {
        return fastPassId;
    }
    public void setFastPassId(String fastPassId) {
        this.fastPassId = fastPassId;
    }
    public String getStationId() {
        return stationId;
    }
    public void setStationId(String stationId) {
        this.stationId = stationId;
    }
    public Float getAmountPaid() {
        return amountPaid;
    }
    public void setAmountPaid(Float amountPaid) {
        this.amountPaid = amountPaid;
    }
    public String getStatus() {
        return status;
    }
    public void setStatus(String status) {
        this.status = status;
    }
    public Boolean getIsFraud() {
        return isFraud;
    }
    public void setIsFraud(Boolean isFraud) {
        this.isFraud = isFraud;
    }
}
