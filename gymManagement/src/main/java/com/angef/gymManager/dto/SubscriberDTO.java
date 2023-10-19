package com.angef.gymManager.dto;
import lombok.Getter;
import java.io.Serializable;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Getter
@Setter
@NoArgsConstructor
public class SubscriberDTO implements Serializable {
	
	private String name;
	private String surname;
	private String dni;
	private String phone;
	
	public static class Builder {
	
		private String name;
		private String surname;
		private String dni;
		private String phone;
		
		public Builder name(String name) {
			this.name = name;
			return this;
		}
		
		public Builder surname(String surname) {
			this.surname = surname;
			return this;
		}
		
		public Builder dni(String dni) {
			this.dni = dni;
			return this;
		}
		
		public Builder phone(String phone) {
			this.phone = phone;
			return this;
		}
		
		public SubscriberDTO build() {
			SubscriberDTO subscriberDTO = new SubscriberDTO();
			subscriberDTO.name = this.name;
			subscriberDTO.surname = this.surname;
			subscriberDTO.dni = this.dni;
			subscriberDTO.phone = this.phone;
			return subscriberDTO;
		}
	}

}
