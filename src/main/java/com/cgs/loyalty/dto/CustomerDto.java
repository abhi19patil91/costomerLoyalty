package com.cgs.loyalty.dto;

public class CustomerDto {

	private String customerId;
	private String name;
	private String mobileNo;
	private String email;
	private String dob;
	private String customerType;
	private String rating;
	private String channelOfRegistration;

	public String getCustomerId() {
		return customerId;
	}

	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMobileNo() {
		return mobileNo;
	}

	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	public String getCustomerType() {
		return customerType;
	}

	public void setCustomerType(String customerType) {
		this.customerType = customerType;
	}

	public String getRating() {
		return rating;
	}

	public void setRating(String rating) {
		this.rating = rating;
	}

	public String getChannelOfRegistration() {
		return channelOfRegistration;
	}

	public void setChannelOfRegistration(String channelOfRegistration) {
		this.channelOfRegistration = channelOfRegistration;
	}

	public CustomerDto(String customerId, String name, String mobileNo, String email, String dob, String customerType,
			String rating, String channelOfRegistration) {
		super();
		this.customerId = customerId;
		this.name = name;
		this.mobileNo = mobileNo;
		this.email = email;
		this.dob = dob;
		this.customerType = customerType;
		this.rating = rating;
		this.channelOfRegistration = channelOfRegistration;
	}

	public CustomerDto() {
		super();
	}

}
