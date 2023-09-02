package com.m2t.graphqldemo.model;

import java.util.Arrays;
import java.util.List;

public class Teacher {
    private String id;
    private String name;

    private static List<Teacher> teachers = Arrays.asList(
            new Teacher("t1", "Zohreh Jooya"),
            new Teacher("t2", "Clint Mansell"),
            new Teacher("t3", "Ibrahim Maalouf")
    );

    public static Teacher getById(String id) {
        return teachers.stream().filter(teacher -> teacher.getId().equals(id)).findFirst().orElse(null);
    }

    public Teacher() {
    }

    public Teacher(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public String getId() {
        return id;
    }
    public String getName() {
        return name;
    }
}
