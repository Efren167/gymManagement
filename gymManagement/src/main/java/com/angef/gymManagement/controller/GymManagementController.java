package com.angef.gymManagement.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
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
	public List<ManagementDTO> getPayments(){
		return this.gymManagementService.getAllPayments();
	}
	
	@GetMapping("/subscriber/{id}")
    public Optional<SubscriberDTO> buscarPorId(@PathVariable Long id) {
		return this.gymManagementService.getSubscriber(id);
       
    }
	
	@PutMapping("/subscriber/{id}")
    public void updateSubscriber(@PathVariable Long id,
            @RequestBody Subscriber updatedSubscriber) {
        updatedSubscriber.setId(id);
        this.gymManagementService.updateSubscriber(updatedSubscriber);
    }
	
	@DeleteMapping("/subscriber/{id}")
	public void deleteSubscriber(@PathVariable Long id) {
	    this.gymManagementService.deleteSubscriber(id);
	}
	 
	@PostMapping("/subscriber/{id}")
	public void addSubscriber(@RequestBody Subscriber newSubscriber) {
	    this.gymManagementService.addSubscriber(newSubscriber);
	}
	 

}
