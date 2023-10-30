package com.angef.gymManagement.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.angef.gymManagement.dto.ManagementDTO;
import com.angef.gymManagement.dto.SubscriberDTO;
import com.angef.gymManagement.entity.Management;
import com.angef.gymManagement.entity.Subscriber;
import com.angef.gymManagement.repository.ManagementRepository;
import com.angef.gymManagement.repository.SubscriberRepository;

@Service
public class GymManagementService {

	@Autowired
	private SubscriberRepository subscriberRepository;
	@Autowired
	private ManagementRepository managementRepository;


	public List<SubscriberDTO> getAllSubscribers() {

		List<Subscriber> subscribers = this.subscriberRepository.findAll();
		List<SubscriberDTO> lstSubscriberDTO = new ArrayList<>();
		subscribers.stream().forEach(subscriber -> {
			SubscriberDTO subscriberDTO = SubscriberDTO.builder().name(subscriber.getName())
					.surname(subscriber.getSurname()).dni(subscriber.getDni()).email(subscriber.getEmail())
					.phone(subscriber.getPhone()).build();
			lstSubscriberDTO.add(subscriberDTO);
		});

		return lstSubscriberDTO;
	}

	public List<ManagementDTO> getAllPayments() {

		List<Management> payments = this.managementRepository.findAll();
		List<ManagementDTO> lstManagementDTO = new ArrayList<>();
		payments.stream().forEach(payment -> {
			ManagementDTO managementDTO = ManagementDTO.builder().withInvoiced(payment.isInvoiced()).withAccess(payment.isAccess()).build();
			lstManagementDTO.add(managementDTO);
		});

		return lstManagementDTO;
	}
}