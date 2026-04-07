package com.collegemanagement;

import java.time.LocalDateTime;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import com.fasterxml.jackson.annotation.JsonFormat;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EntityListeners;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@EntityListeners(AuditingEntityListener.class)
@Table(name = "students")
public class Student {
	
	public Student() {
		
	}

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long studentId;

	@Column(name = "full_name")
    private String fullName;
    
    @Column(unique = true, nullable = false)
    private String email;

    @Column(name = "city", length = 100)
    private String city;

    @Column(unique = true, nullable = false)
    private String mobileNo;

    @Column(name = "department", length = 100)
    private String department;

    @CreatedDate
    @Column(name = "created_time", updatable = false)
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private LocalDateTime createdAt;

    @LastModifiedDate
    @Column(name = "updated_time")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private LocalDateTime updatedAt;

    public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public Long getStudentId() {
		return studentId;
	}

	public String getFullName() {
		return fullName;
	}

	public String getEmail() {
		return email;
	}

	public String getCity() {
		return city;
	}

	public String getMobileNo() {
		return mobileNo;
	}

	public String getDepartment() {
		return department;
	}

	public LocalDateTime getCreatedAt() {
		return createdAt;
	}

	public LocalDateTime getUpdatedAt() {
		return updatedAt;
	}
	
	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", fullName=" + fullName + ", email=" + email + ", city=" + city
				+ ", mobileNo=" + mobileNo + ", department=" + department + ", createdAt=" + createdAt + ", updatedAt="
				+ updatedAt + "]";
	}
	
}
