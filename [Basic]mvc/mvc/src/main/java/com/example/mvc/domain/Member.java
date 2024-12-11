package com.example.mvc.domain;

public class Member {
    // 속성
    private String name;
    private String email;
    private int age;

    // 생성자

    // 기능
    // getter
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getEmail() {
        return email;
    }

    // setter
    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
