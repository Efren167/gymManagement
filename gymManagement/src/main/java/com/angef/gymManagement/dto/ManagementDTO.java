package com.angef.gymManagement.dto;

import com.angef.gymManagement.entity.Subscriber;

public class ManagementDTO {
		private Long id;
	    private boolean invoiced;
	    private boolean access;
  
	    private ManagementDTO(Builder builder) {
	    	this.id = builder.id;
			this.invoiced = builder.invoiced;
			this.access = builder.access;
		}
	    
	    
		public Long getId() {
			return id;
		}


		public void setId(Long id) {
			this.id = id;
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
	    	private Long id;
			private boolean invoiced;
	        private boolean access;


	        public Builder withInvoiced(boolean invoiced) {
	            this.invoiced = invoiced;
	            return this;
	        }
	        public Builder id(Long id) {
	            this.id = id;
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


