package com.company;

import com.entity.Student;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class RW21CompareTo {
    public static void main(String[] args) {
        List<Student> studentList = new ArrayList<>();
        studentList.add(new Student("Mai Văn Tiến", 9f));
        studentList.add(new Student("Bùi Văn Nhất", 5f));
        studentList.add(new Student("Nguyễn Minh Anh", 10f));
        studentList.add(new Student("Phùng Gia Phương", 8f));

        //Sử dụng sắp sếp tự động
        Collections.sort(studentList);

        for(int i = studentList.size()-1 ; i >= 0; i--){
            System.out.println(studentList.get(i).toString());
        }

        System.out.println("*******************************");

        for(int i = 0; i < studentList.size(); i++){
            System.out.println(studentList.get(i).toString());
        }
    }
}
