package com.angef.gymManagement.entity;
import jakarta.persistence.Entity;

@Entity

public class Management {

	private boolean invoiced;
	private boolean access;

	public Management(boolean invoiced, boolean access) {
		this.invoiced = invoiced;
		this.access = access;
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
