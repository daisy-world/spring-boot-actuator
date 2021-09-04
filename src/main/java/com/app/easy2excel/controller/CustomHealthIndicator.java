package com.app.easy2excel.controller;

import org.springframework.boot.actuate.health.Health;
import org.springframework.boot.actuate.health.HealthIndicator;
import org.springframework.stereotype.Component;

@Component
public class CustomHealthIndicator implements HealthIndicator {

	@Override
	public Health health() {

		  if (!checkHealth()) {
	            return Health.down().withDetail( "app","Not Available").build();
	        }
	        return Health.up().withDetail("app", "Available").build();
	}
	
	  private boolean checkHealth(){

	        boolean isUp =true;
	        return isUp;

	    }

}
