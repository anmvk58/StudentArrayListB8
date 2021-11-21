package com.backend;

import com.entity.Student;

import java.util.*;

public class RW21ArrayList {
    //List các properties
    private List<Student> list = new ArrayList<>();
    private Scanner scanner = new Scanner(System.in);

    //List các methods

    // Hàm khởi tạo đối tượng RW21ArrayList
    public RW21ArrayList() {
        //Khởi tạo các đối tượng Student
        Student student1 = new Student( "Nguyễn A");
        Student student2 = new Student( "Nguyễn B");
        Student student3 = new Student( "Nguyễn C");
        Student student4 = new Student( "Nguyễn A");
        Student student5 = new Student( "Nguyễn E");
        //add các phần tử vào trong Arraylist
        list.add(student1);
        list.add(student2);
        list.add(student3);
        list.add(student4);
        list.add(student5);
    }

    //a)in ra tổng số phần tử:
    public void printTotalStudent(){
        System.out.println("Tổng số phần tử = " + list.size());
    }

    //b) lấy phần tử thứ 4:
    public void printStudentX(int n){
        System.out.println("Phần tử thứ " + n + " là: " + list.get(n-1).toString());
    }

    //c) in phần tử đầu và cuối
    public void printEndHomeStudent(){
        System.out.println("Phần tử đầu tiên: " + list.get(0).toString());
        System.out.println("Phần tử cuối cùng: " + list.get(list.size() - 1).toString());
    }

    //d) thêm phần tử vào đầu danh sách
    public void insertFirstStudent(){
        Student student6 = new Student("Iron Man");
        list.add(0, student6);
    }

    //e) thêm phần tử vào cuối:
    public void insertLastStudent(){
        list.add(new Student("Superman"));
    }

//    f) Đảo ngược vị trí của students
    public void reverseStudent(){
        Collections.reverse(list);
    }

//    g) Tạo 1 method tìm kiếm student theo id
    public void findStudentById(int id){
        int temp = 0;
        for(Student s : list){
            if(s.getId() == id){
                System.out.println("Thông tin Student tìm thấy: ");
                System.out.println(s.toString());
                temp = 1;
            }
        }
        if(temp == 0) {
            System.out.println("Không tìm thấy sinh viên !!!");
        }
    }

    //plus: tìm dựa trên nhập từ bàn phím
    public void findStudentByIdInputMethod(){
        System.out.println("Mời nhập vào id: ");
        findStudentById(scanner.nextInt());
    }


//    h) Tạo 1 method tìm kiếm student theo name
    public void findStudentByName(String name){
        int temp = 0;
        for(Student s : list){
            if(s.getName().equals(name)){
                System.out.println("Thông tin Student tìm thấy: ");
                System.out.println(s.toString());
                temp = 1;
            }
        }
        if(temp == 0) {
            System.out.println("Không tìm thấy sinh viên !!!");
        }
    }

    //plus: tìm dựa trên nhập từ bàn phím
    public void findStudentByNameInputMethod(){
        System.out.println("Mời nhập vào name: ");
        findStudentByName(scanner.nextLine());
    }

    // Hàm kiểm tra 1 tên có bị trùng ko.
    public boolean checkDuplicate(String name){
        int temp = 0;
        for(Student s : list){
            if(s.getName().equals(name)){
                temp++;
            }
        }

        if( temp >= 2 ) {
            return true;
        } else {
            return false;
        }
    }

//    i) Tạo 1 method để in ra các student có trùng tên
    public void findStudentDuplicate(){
        for (Student s : list) {
            if(checkDuplicate(s.getName())){
                System.out.println(s.toString());
            }
        }
    }


//    j) Xóa name của student có id = 2;
        public void deleteNameStudentById(int id){
            for (Student s : list) {
                if(s.getId() == id){
                    s.setName(null);
                }
            }
        }

//    k) Delete student có id = 5;
        public void deleteStudentById(int id){
            for (Student s : list) {
                if(s.getId() == id){
                    list.remove(s);
                }
            }
        }

//    l) Tạo 1 ArrayList tên là studentCopies và add tất cả students vào
//    studentCopies
    public void copyStudents(){
        List<Student> studentCopies = new ArrayList(list);
        printListStudent(studentCopies);
    }

    // Hàm in ra list danh sách Student
    public void printListStudent(List<Student> listStudent){
        for (Student s : listStudent) {
            System.out.println(s.toString());
        }
    }

}
