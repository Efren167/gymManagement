package com.angef.gymManagement.entity;


	public class ManagementEntity {
	    private boolean invoiced;
	    private boolean access;

	    public ManagementEntity(boolean invoiced, boolean access) {
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

	    @Override
	    public String toString() {
	        return "ManagementEntity{" +
	                "invoiced=" + invoiced +
	                ", access=" + access +
	                '}';
	    }
	}


