package com.example.cx3;

import org.springframework.stereotype.Component;

@Component
public class StudentCfg {
    Student student = new Student();

    StudentCfg(){
        student.setName("默认姓名");
    }
    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }
}
