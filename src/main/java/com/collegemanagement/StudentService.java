package com.collegemanagement;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

@Service
public class StudentService {
	@Autowired
	private StudentRepository studentRepo;
	
	public void saveDataintoDatabase(StudentDTO dto, Student st) {
		st.setFullName(dto.getFullName());
		st.setCity(dto.getCity());
		st.setDepartment(dto.getDepartment());
		st.setEmail(dto.getEmail());
		st.setMobileNo(dto.getMobileNo());
		studentRepo.save(st);
	}
	
	public String saveStudentData(StudentDTO studentDetails) {
		Student student = new Student();
//		student.setFullName(studentDetails.getFullName());
//		student.setCity(studentDetails.getCity());
//		student.setDepartment(studentDetails.getDepartment());
//		student.setEmail(studentDetails.getEmail());
//		student.setMobileNo(studentDetails.getMobileNo());
//		studentRepo.save(student);
		saveDataintoDatabase(studentDetails, student);
		return "Data placed in Database ✔️";
	}

	public List<Student> getAllStudentsData() {
		List<Student> Data = studentRepo.findAll();
		return Data;
	}

	public Student getStudentDataById(Long id) {
		return studentRepo.findById(id)
	            .orElseThrow(() -> new ResponseStatusException(
	                    HttpStatus.NOT_FOUND,
	                    "Student not found with id: " + id
	            ));
	}

	public String updateStudentData(StudentDTO studentDTO, Long id) {
		Student studentDetails = studentRepo.findById(id)
	            .orElseThrow(() -> new ResponseStatusException(
	                    HttpStatus.NOT_FOUND,
	                    "Student not found with id: " + id
	            ));
		saveDataintoDatabase(studentDTO, studentDetails);
		return "Data Updated Successfully 😉🤝";
	}

	public String updatePartialStudentData(StudentDTO dto, Long id) {
		Student student = studentRepo.findById(id)
	            .orElseThrow(() -> new ResponseStatusException(
	                    HttpStatus.NOT_FOUND,
	                    "Student not found with id: " + id
	            ));
		if (dto.getFullName() != null)
	        student.setFullName(dto.getFullName());

	    if (dto.getEmail() != null)
	        student.setEmail(dto.getEmail());

	    if (dto.getCity() != null)
	        student.setCity(dto.getCity());

	    if (dto.getMobileNo() != null)
	        student.setMobileNo(dto.getMobileNo());

	    if (dto.getDepartment() != null)
	        student.setDepartment(dto.getDepartment());

	    studentRepo.save(student);
	    
		return "Partial Data Updated Successfully 😎";
	}

	public String deleteStudentDataById(Long id) {
		Student student = studentRepo.findById(id)
	            .orElseThrow(() -> new ResponseStatusException(
	                    HttpStatus.NOT_FOUND,
	                    "Student not found with id: " + id
	            ));
		studentRepo.deleteById(id);
		return "Data Successfully Deleted ⭐";
	}
}
