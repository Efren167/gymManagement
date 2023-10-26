package com.angef.gymManagement.dto;

public class ManagementDTO {
	    private boolean invoiced;
	    private boolean access;
	    
	    private ManagementDTO() {
	    }

	    public boolean isInvoiced() {
	        return invoiced;
	    }

	    
	    public boolean hasAccess() {
	        return access;
	    }

	    public static class Builder {
	        private boolean invoiced;
	        private boolean access;

	        public Builder() {
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
	            ManagementDTO managementDTO = new ManagementDTO();
	            managementDTO.invoiced = this.invoiced;
	            managementDTO.access = this.access;
	            return managementDTO;
	        }
	    }

	    @Override
	    public String toString() {
	        return "ManagementDTO{" +
	                "invoiced=" + invoiced +
	                ", access=" + access +
	                '}';
	    }
	}


