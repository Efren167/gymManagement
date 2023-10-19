package com.angef.gymManagement.controller;

@RestController
@RequestMapping("api/v0/")
public class GymManagementController {
	
	private final GymManagerService gymManagerService;
	
	@GetMapping("/subscribers")
	public List<Subscriber> getSubscribers() {
		return this.gymManagerService.getSubscribers();
	}

}
