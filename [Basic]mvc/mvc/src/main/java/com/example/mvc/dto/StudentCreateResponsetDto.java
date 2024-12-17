package com.example.mvc.dto;

import com.example.mvc.domain.Student;
import lombok.Getter;

@Getter
public class StudentCreateResponsetDto {

    private String message;
    private Long id;

    private StudentCreateResponsetDto(String message, Long id){
        this.message = message;
        this.id = id;
    }

    public static StudentCreateResponsetDto of(Student student){
        Long id = student.getId();
        String message = "a메시지";
        return new StudentCreateResponsetDto(message, id);
    }
}
