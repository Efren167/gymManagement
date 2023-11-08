package com.angef.gymManagement.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.angef.gymManagement.dto.ManagementDTO;
import com.angef.gymManagement.dto.SubscriberDTO;
import com.angef.gymManagement.entity.Subscriber;
import com.angef.gymManagement.service.GymManagementService;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("api/v0")
public class GymManagementController {

	@Autowired
	private GymManagementService gymManagementService;

	@GetMapping("/subscribers")
	public List<SubscriberDTO> getSubscribers() {
		return this.gymManagementService.getAllSubscribers();
		
	}

	@GetMapping("/payments")
	public List<ManagementDTO> getPayments() {
		return this.gymManagementService.getAllPayments();
	}

	 @PutMapping("/subscribers/{id}")
	    public ResponseEntity<Subscriber> updateSubscriber(@PathVariable Long id, @RequestBody Subscriber updatedSubscriber) {
	        Subscriber updated = gymManagementService.updateSubscriber(id, updatedSubscriber);

	        if (updated != null) {
	            return ResponseEntity.ok(updated);
	        } else {
	            return ResponseEntity.notFound().build();
	        }
	    }
    }



