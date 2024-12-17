package com.example.mvc.service;

import com.example.mvc.domain.Student;
import com.example.mvc.dto.StudentCreateRequestDto;
import com.example.mvc.dto.StudentCreateResponsetDto;
import com.example.mvc.repository.JPAStudentRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class StudentService {
    private final JPAStudentRepository jpaStudentRepository;

    public StudentCreateResponsetDto createStudentService(StudentCreateRequestDto studentCreateRequestDto) {
        Student name = Student.of(studentCreateRequestDto);
        Student savedStudent = jpaStudentRepository.save(name);
        return StudentCreateResponsetDto.of(savedStudent);
    }
}
