package com.frontend;

import com.backend.RW21ArrayList;

public class RW21ArrayList_Frontend {
    public static void main(String[] args) {
        RW21ArrayList rw21ArrayList = new RW21ArrayList();
        //Câu a:
        nextQuestion("Câu a");
        rw21ArrayList.printTotalStudent();

        //Câu b:
        nextQuestion("Câu b");
        rw21ArrayList.printStudentX(1);

        // Câu g)
        nextQuestion("Câu g");
        rw21ArrayList.findStudentById(6);
//        rw21ArrayList.findStudentByIdInputMethod();

        nextQuestion("Câu h");
        rw21ArrayList.findStudentByName("Nguyễn D");
//        rw21ArrayList.findStudentByNameInputMethod();

        nextQuestion("Câu i");
        rw21ArrayList.findStudentDuplicate();

        nextQuestion("câu l");
        rw21ArrayList.copyStudents();
    }

    public static void nextQuestion(String message){
        System.out.println("\n ---------------  " + message + "  ---------------");
    }
}
