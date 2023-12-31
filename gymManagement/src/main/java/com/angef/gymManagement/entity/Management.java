package com.angef.gymManagement.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
@Table(name = "Management")
public class Management {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "payment_id")
	private Long paymentId;
	@OneToOne
	@JoinColumn(name = "id")
	private Subscriber subscriptionId;

	@Column(name = "invoiced")
	private boolean invoiced;

	@Column(name = "access")
	private boolean access;

	public Long getPaymentId() {
		return paymentId;
	}

	public void setPaymentId(Long paymentId) {
		this.paymentId = paymentId;
	}

	public Subscriber getSubscriptionId() {
		return subscriptionId;
	}

	public void setSubscriptionId(Subscriber subscriptionId) {
		this.subscriptionId = subscriptionId;
	}

	public boolean isAccess() {
		return access;
	}

	public boolean isInvoiced() {
		return invoiced;
	}

	public void setInvoiced(boolean invoiced) {
		this.invoiced = invoiced;
	}

	public void setAccess(boolean access) {
		this.access = access;
	}

}
