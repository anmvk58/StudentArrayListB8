package com.company;

import com.entity.Student;

import java.util.HashMap;
import java.util.Map;

public class RW21Map {
    public static void main(String[] args) {
        Map<String, Student> student = new HashMap<>();


        student.put("Học sinh hư", new Student("Bad Guys"));

        System.out.println(student.get("Học sinh hư"));
    }
}
