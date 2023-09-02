package com.m2t.graphqldemo.controller;

import com.m2t.graphqldemo.model.Student;
import com.m2t.graphqldemo.model.Teacher;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.graphql.data.method.annotation.SchemaMapping;
import org.springframework.stereotype.Controller;

@Controller
public class StudentGraphqlController {
    @QueryMapping
    public Student studentById(@Argument String id) {
        return Student.getById(id);
    }

    @SchemaMapping
    public Teacher teacher(Student student) {
        return Teacher.getById(student.getTeacherId());
    }
}
