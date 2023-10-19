package com.angef.gymManagement.config;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GymManagementConfiguration {
	
	@Bean
	public SubscriberService subscriberService() {
		return SubscriberService();
	}

}
