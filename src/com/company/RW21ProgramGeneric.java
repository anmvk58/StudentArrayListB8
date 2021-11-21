package com.company;

import com.entity.Student;

@SuppressWarnings("deprecation")
public class RW21ProgramGeneric {
    public static void main(String[] args) {
        Student student = new Student("Robert A");
        student = null;
        inManHinh();
    }

    public static void inManHinh(){
        int a = 5;
        System.out.println("Hi");
        System.out.println("Hello");
    }
}
