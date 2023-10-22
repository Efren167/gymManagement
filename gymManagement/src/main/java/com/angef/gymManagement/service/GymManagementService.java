package com.angef.gymManagement.service;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.angef.gymManagement.dto.SubscriberDTO;
import com.angef.gymManagement.entity.Subscriber;
import com.angef.gymManagement.repository.SubscriberRepository;

@Service
public class GymManagementService {
	
	@Autowired
	private SubscriberRepository subscriberRepository;
	
	public List<SubscriberDTO> getAllSubscribers() {

		List<Subscriber> subscribers = this.subscriberRepository.findAll();
		List<SubscriberDTO> lstSubscriberDTO = new ArrayList<>();
		subscribers.stream().forEach(subscriber -> {
			SubscriberDTO subscriberDTO = SubscriberDTO.builder().id(subscriber.getId()).name(subscriber.getName())
					.surname(subscriber.getSurname()).dni(subscriber.getDni()).email(subscriber.getEmail())
					.phone(subscriber.getPhone()).build();
			lstSubscriberDTO.add(subscriberDTO);
		});

		return lstSubscriberDTO;
	}
	
	public Optional<SubscriberDTO> getSubscriber(Long id) {
	    Optional<Subscriber> subscriber = subscriberRepository.findById(id);
	    Optional<SubscriberDTO> subscriberDTO = subscriber.map(sub -> convertToDTO(sub));
	    return subscriberDTO;
	}

	private SubscriberDTO convertToDTO(Subscriber subscriber) {

		SubscriberDTO subscriberDTO = SubscriberDTO.builder().id(subscriber.getId()).name(subscriber.getName())
				.surname(subscriber.getSurname()).dni(subscriber.getDni()).email(subscriber.getEmail())
				.phone(subscriber.getPhone()).build();

		return subscriberDTO;
	}


}
