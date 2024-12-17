package com.example.mvc.domain;

import com.example.mvc.dto.StudentCreateRequestDto;
import jakarta.persistence.*;
import lombok.Getter;

@Entity
@Table(name = "studnet")
public class Student {

    //속성=필드
    @Id
    @Getter
    @GeneratedValue(strategy = GenerationType.IDENTITY) // 1씩 증가함
    private Long id;
    private String name;

    //
    protected Student() {}

    // 생성자 여러개 생기면 너무 복잡
    // 외부에서 생성자 접근 불가능함
    private Student(String name){
        this.name = name;
    }

    // 생성 기능 담당하는 static
    // dto 변환 로직 담당 기능
    //
    public static Student of(StudentCreateRequestDto studentCreateRequestDto){
        return new Student(studentCreateRequestDto.getName());
    }
}
