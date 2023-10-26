package com.angef.gymManagement;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.angef.gymManagement.dto.ManagementDTO;

@SpringBootApplication
public class GymManagementApplication {

	public static void main(String[] args) {
		SpringApplication.run(GymManagementApplication.class, args);

		ManagementDTO management = new ManagementDTO.Builder().withInvoiced(true).withAccess(false).build();

		System.out.println(management);
	}

}
