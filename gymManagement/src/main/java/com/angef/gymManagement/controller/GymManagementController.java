package com.angef.gymManagement.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.angef.gymManagement.dto.ManagementDTO;
import com.angef.gymManagement.dto.SubscriberDTO;
import com.angef.gymManagement.service.GymManagementService;

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


}
