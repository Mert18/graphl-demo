package com.m2t.graphqldemo.model;

import java.util.Arrays;
import java.util.List;

public class Student {
    private String id;
    private String name;
    private Integer number;
    private String teacherId;

    private static List<Student> students = Arrays.asList(
            new Student("s1", "Mert Uyğur", 687, "t2"),
            new Student("s2", "Anne Clark", 11, "t2"),
            new Student("s3", "Ramin Farhangniya", 11, "t1")
    );

    public static Student getById(String id) {
        return students.stream().filter(student -> student.getId().equals(id)).findFirst().orElse(null);
    }

    public Student() {
    }

    public Student(String id, String name, Integer number, String teacherId) {
        this.id = id;
        this.name = name;
        this.number = number;
        this.teacherId = teacherId;
    }

    public String getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public Integer getNumber() {
        return number;
    }
    public String getTeacherId() {
        return teacherId;
    }

}
