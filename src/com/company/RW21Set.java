package com.company;

import com.entity.Student;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class RW21Set {
    public static void main(String[] args) {
        Set<Student> studentSet = new HashSet<>();
        studentSet.add(new Student("Nguyễn C"));
        studentSet.add(new Student("Nguyễn B"));
        studentSet.add(new Student("Nguyễn A"));
        studentSet.add(new Student("Nguyễn D"));

        //Chuyển đổi thành dạng Iterator
        Iterator<Student> studentIterator = studentSet.iterator();

        // in ra danh sách
        while(studentIterator.hasNext()){
            System.out.println(studentIterator.next().toString());
        }
    }
}
