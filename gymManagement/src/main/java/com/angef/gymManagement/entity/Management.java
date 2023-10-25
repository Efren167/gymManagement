package com.angef.gymManagement.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "Management")
public class Management {

	@Id
	@Column(name = "id")
	private long Id;

	@Column(name = "invoiced")
	private boolean invoiced;

	@Column(name = "access")
	private boolean access;

	public Management(long id, boolean invoiced, boolean access) {
		this.Id = id;
		this.invoiced = invoiced;
		this.access = access;
	}
	
	@ManyToOne(optional = false)
    private Subscriber subscriber;

	public Subscriber getSubscriber() {
		return subscriber;
	}

	public void setSubscriber(Subscriber subscriber) {
		this.subscriber = subscriber;
	}

	public boolean isAccess() {
		return access;
	}

	public long getId() {
		return Id;
	}

	public void setId(long Id) {
		this.Id = Id;
	}

	public boolean isInvoiced() {
		return invoiced;
	}

	public void setInvoiced(boolean invoiced) {
		this.invoiced = invoiced;
	}

	public boolean hasAccess() {
		return access;
	}

	public void setAccess(boolean access) {
		this.access = access;
	}

	}

