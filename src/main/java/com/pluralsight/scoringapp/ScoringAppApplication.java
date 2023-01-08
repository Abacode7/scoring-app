package com.pluralsight.scoringapp;

import java.util.function.Function;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;

@EnableConfigurationProperties(TollReadingProperties.class)
@SpringBootApplication
public class ScoringAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(ScoringAppApplication.class, args);
	}

	@Autowired
	private TollReadingProperties properties;

	@Bean
	public Function<FastPassToll, FastPassToll> assignScore(){
		return value -> {
			Integer fraudThreshold = properties.getFraudThreshold();
			Integer fraudProbabilityScore = 0;
			value.setIsFraud(false);

			System.out.println("Stating id is: " + value.getStationId());
			System.out.println("Fraud threshold is: " + fraudThreshold);

			if(value.getStationId().equals("1001")) {
				// Typically set value from db, cache or ml system.
				fraudProbabilityScore = 30;
			}

			if(fraudProbabilityScore > fraudThreshold) value.setIsFraud(true);

			return value;
		};
	}

}
