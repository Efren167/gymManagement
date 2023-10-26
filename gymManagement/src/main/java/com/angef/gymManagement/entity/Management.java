package com.angef.gymManagement.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "Management")
public class Management {

	@Id
	@OneToOne
<<<<<<< HEAD
	@JoinColumn(name = "id")
	private Subscriber subscriptionId;
=======
    @JoinColumn(name = "id")
    private Subscriber subscriptionId;

>>>>>>> 6594689466b51ae4a456c3ebc209c49f3f64fc30

	@Column(name = "invoiced")
	private boolean invoiced;

	@Column(name = "access")
	private boolean access;

	public Management(boolean invoiced, boolean access) {
		this.invoiced = invoiced;
		this.access = access;
	}
<<<<<<< HEAD
=======
	
>>>>>>> 6594689466b51ae4a456c3ebc209c49f3f64fc30

	public boolean isAccess() {
		return access;
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
