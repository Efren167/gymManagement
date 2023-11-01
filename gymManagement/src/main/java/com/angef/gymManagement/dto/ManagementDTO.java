package com.angef.gymManagement.dto;

public class ManagementDTO {
	private Long subscriberId;
	private boolean invoiced;
	private boolean access;

	private ManagementDTO(Builder builder) {

		this.subscriberId = builder.subscriberId;
		this.invoiced = builder.invoiced;
		this.access = builder.access;
	}
	

	public Long getSubscriberId() {
		return subscriberId;
	}

	public void setSubscriberId(Long subscriberId) {
		this.subscriberId = subscriberId;
	}

	public void setInvoiced(boolean invoiced) {
		this.invoiced = invoiced;
	}

	public void setAccess(boolean access) {
		this.access = access;
	}

	public boolean getInvoiced() {
		return invoiced;
	}

	public boolean getAccess() {
		return access;
	}

	public static Builder builder() {
		return new Builder();
	}

	public static class Builder {
		private Long subscriberId;
		private boolean invoiced;
		private boolean access;

		public Builder subscriberId(Long subscriberId) {
			this.subscriberId = subscriberId;
			return this;
		}
		

		public Builder withInvoiced(boolean invoiced) {
			this.invoiced = invoiced;
			return this;
		}

		public Builder withAccess(boolean access) {
			this.access = access;
			return this;
		}

		public ManagementDTO build() {
			return new ManagementDTO(this);
		}
	}
}
