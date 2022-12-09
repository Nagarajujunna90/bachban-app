package com.bachpan.demo.dto;

public class UserDTO {

	private String firstName;
	private String lastName;
	private String fatherName;
	private String Qualification;
	private String roleName;

	public String getRoleName() {
		return roleName;
	}

	public void setRoleName(String roleName) {
		this.roleName = roleName;
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
		return Qualification;
	}

	public void setQualification(String qualification) {
		Qualification = qualification;
	}

	@Override
	public String toString() {
		return "UserDTO [ firstName=" + firstName + ", lastName=" + lastName + ", fatherName="
				+ fatherName + ", Qualification=" + Qualification + "]";
	}

}
