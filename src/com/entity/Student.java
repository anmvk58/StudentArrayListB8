package com.entity;

import com.company.Person;

public class Student extends Person implements Comparable<Student>{
    int id;
    String name;
    static int count = 0;
    float gpa;

    public Student(String name) {
        this.id = ++count;
        this.name = name;
    }

    public Student(String name, float gpa) {
        this.id = ++count;
        this.name = name;
        this.gpa = gpa;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", gpa=" + gpa +
                '}';
    }

    @Override
    public int compareTo(Student student) {
        return name.compareTo(student.name);
    }

//    public int compareTo(StudentEx2 o) {
//        int flagCompare = this.name.compareTo(o.getName());
//        if (flagCompare == 0) {
//            if (this.score > o.score) {
//                return 1;
//            } else if (this.score < o.score) {
//                return -1;
//            } else if (this.score == o.score) {
//                return this.birthDay.compareTo(o.getBirthDay());
//            }
//        } else {
//            return flagCompare;
//        }
//        return 0;
//    }
}
