package com.example.day1_q05.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class studentc {
    @GetMapping("/student")
    public List<student> getStudents() {
        List <student> students = new ArrayList<>();
        student obj = new student();
        obj.setStudentName("John");
        obj.setMessage("Welcome, John!");
        students.add(obj);
        return students;
    }
}

