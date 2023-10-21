package com.angef.gymManagement.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "MANAGEMENT")

public class Management {

	@Id
	@Column(name = "id")
	private Long id;

	@Column(name = "invoiced", nullable = false)
	private boolean invoiced;

	@Column(name = "access", nullable = false)
	private boolean access;

	public Management(boolean invoiced, boolean access) {
		this.invoiced = invoiced;
		this.access = access;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
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

	{
		if (invoiced == true) {
			access = true;
		} else {
			access = false;
		}

	}
}
