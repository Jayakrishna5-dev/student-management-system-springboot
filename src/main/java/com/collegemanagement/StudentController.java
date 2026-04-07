package com.collegemanagement;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/collegeManagement")
public class StudentController {
	@Autowired
	private StudentService studentService;
	
	@PostMapping("/students")
	public String createStudent(@RequestBody StudentDTO studentDTO) {
		//service call to store the data into database table
		return studentService.saveStudentData(studentDTO);
	}
	
	@GetMapping("/students")
	public List<Student> getAllStudents() {
		return studentService.getAllStudentsData();
	}
	
	@GetMapping("/students/{id}")
	public Student getStudentById(@PathVariable Long id) {
		return studentService.getStudentDataById(id);
	}
	
	@PutMapping("/students/{id}")
	public String updateStudent(@RequestBody StudentDTO studentDTO, @PathVariable Long id) {
		return studentService.updateStudentData(studentDTO, id);
	}
	
	@PatchMapping("/students/{id}")
	public String partialUpdateStudent(@RequestBody StudentDTO studentDTO, @PathVariable Long id) {
		return studentService.updatePartialStudentData(studentDTO, id);
	}
	
	@DeleteMapping("/students/{id}")
	public String deleteStudent(@PathVariable Long id) {
		return studentService.deleteStudentDataById(id);
	}
	
}
