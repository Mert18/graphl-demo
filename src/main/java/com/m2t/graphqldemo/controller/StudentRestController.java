package com.m2t.graphqldemo.controller;

import com.m2t.graphqldemo.model.Student;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/student")
public class StudentRestController {
    @GetMapping
    public Student studentById(@RequestParam String id) {
        return Student.getById(id);
    }
}
