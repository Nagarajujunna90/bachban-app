package com.bachpan.demo.dto;

public class AddressDTO {
    private String UserName;
    private Integer password;
    private String firstName;
	private String lastName;
	private String fatherName;
	private String qualification; 
 	private String village;
	private String mandal;
	private String district;
	private String state;
	private String country;
	private Integer pin;
	public String getUserName() {
		return UserName;
	}
	public void setUserName(String userName) {
		UserName = userName;
	}
	public Integer getPassword() {
		return password;
	}
	public void setPassword(Integer password) {
		this.password = password;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getFatherName() {
		return fatherName;
	}
	public void setFatherName(String fatherName) {
		this.fatherName = fatherName;
	}
	public String getQualification() {
		return qualification;
	}
	public void setQualification(String qualification) {
		this.qualification = qualification;
	}
	public String getVillage() {
		return village;
	}
	public void setVillage(String village) {
		this.village = village;
	}
	public String getMandal() {
		return mandal;
	}
	public void setMandal(String mandal) {
		this.mandal = mandal;
	}
	public String getDistrict() {
		return district;
	}
	public void setDistrict(String district) {
		this.district = district;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public Integer getPin() {
		return pin;
	}
	public void setPin(Integer pin) {
		this.pin = pin;
	}
	@Override
	public String toString() {
		return "AddressDTO [UserName=" + UserName + ", password=" + password + ", firstName=" + firstName
				+ ", lastName=" + lastName + ", fatherName=" + fatherName + ", qualification=" + qualification
				+ ", village=" + village + ", mandal=" + mandal + ", district=" + district + ", state=" + state
				+ ", country=" + country + ", pin=" + pin + "]";
	}
	
	}
	
	


