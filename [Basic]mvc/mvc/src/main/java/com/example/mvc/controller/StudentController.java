package com.example.mvc.controller;

import com.example.mvc.dto.StudentCreateRequestDto;
import com.example.mvc.dto.StudentCreateResponsetDto;
import com.example.mvc.service.StudentService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@AllArgsConstructor
@RequestMapping("/students")
public class StudentController {
    private final StudentService studentService;
    /**
     * 요청
     * json
     * {
     *     "name":"Steve"
     * }
     *
     * 응답
     * json
     * {
     *     "message':"created",
     *     "studentId":1
     * }
     */
    public ResponseEntity<StudentCreateResponsetDto> createStudentAPI(@RequestBody StudentCreateRequestDto studentCreateRequestDto) {
        // 응답
        StudentCreateResponsetDto studentCreateResponsetDto = studentService.createStudentService(studentCreateRequestDto);
        return new ResponseEntity<StudentCreateResponsetDto>(studentCreateResponsetDto, HttpStatus.OK);
    }
}
