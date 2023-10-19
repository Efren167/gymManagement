package com.angef.gymManager.service;
import org.springframework.stereotype.Service;
import lombok.NonNull;

@Service
public class GymManagementService {
	
	@NonNull
	private final SubscriberRepository subscriberRepository;
	
	public List<Subscriber> getSubscribers() {
		return this.subscriberRepository.findAll();
	}

}
