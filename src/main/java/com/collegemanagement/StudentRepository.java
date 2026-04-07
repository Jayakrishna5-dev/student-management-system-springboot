package com.collegemanagement;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.collegemanagement.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {
}
