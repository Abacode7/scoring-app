package com.pluralsight.scoringapp;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties("fraud")
public class TollReadingProperties {

    private int fraudThreshold;

    public int getFraudThreshold() {
        return fraudThreshold;
    }

    public void setFraudThreshold(int fraudThreshold) {
        this.fraudThreshold = fraudThreshold;
    }

}
