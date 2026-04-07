package com.collegemanagement;

public class StudentDTO {
	private String fullName;
	private String email;
	private String city;
	private String mobileNo;
	private String department;
	
	public String getFullName() {
		return fullName;
	}
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getMobileNo() {
		return mobileNo;
	}
	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	
	@Override
	public String toString() {
		return "Student Data Added into Database  -->  [fullName=" + fullName + ", email=" + email + ", city=" + city + ", mobileNo=" + mobileNo
				+ ", department=" + department + "]";
	}
	
}
