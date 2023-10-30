package com.angef.gymManagement.dto;

public class SubscriberDTO {

	private final Long id;
	private final String name;
	private final String surname;
	private final String dni;
	private final String email;
	private final String phone;

	private SubscriberDTO(Builder builder) {
		this.id = builder.id;
		this.name = builder.name;
		this.surname = builder.surname;
		this.dni = builder.dni;
		this.email = builder.email;
		this.phone = builder.phone;
	}
	
	public Long getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getSurname() {
		return surname;
	}

	public String getDni() {
		return dni;
	}

	public String getEmail() {
		return email;
	}

	public String getPhone() {
		return phone;
	}
	
	 public static Builder builder() {
	        return new Builder();
	    }

	public static class Builder {
		private Long id;
		private String name;
		private String surname;
		private String dni;
		private String email;
		private String phone;
		
		public Builder id(Long id) {
			this.id = id;
			return this;
		}

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

		public Builder email(String email) {
			this.email = email;
			return this;
		}

		public Builder phone(String phone) {
			this.phone = phone;
			return this;
		}

		public SubscriberDTO build() {
			return new SubscriberDTO(this);
		}
	}

}
