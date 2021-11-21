package com.company;

import com.entity.Student;

import java.util.Stack;

public class RW21StackQueue {
    public static void main(String[] args) {
        Student student1 = new Student("Nguyễn Văn Nam");
        Student student2 = new Student("Nguyễn Văn Huyên");
        Student student3 = new Student("Trần Văn Nam");
        Student student4 = new Student("Nguyễn Văn A");

        //Tạo Stack và thêm vào:
        Stack<Student> students = new Stack<>();
        students.push(student1);
        students.push(student2);
        students.push(student3);
        students.push(student4);

        //Gọi void
        printStack(students);

    }

    public static void printStack(Stack<Student> students){
        //In ra theo thứ tự từ muộn nhất tới sớm nhất:
        while(!students.isEmpty()){
            Student s = students.pop();
            System.out.println(s.toString());
        }
    }
}
