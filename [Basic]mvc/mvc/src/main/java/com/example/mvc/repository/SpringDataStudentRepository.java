package com.example.mvc.repository;

import com.example.mvc.domain.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SpringDataStudentRepository extends JpaRepository<Student, Long> {
}
