package com.company;

public class StudentGeneric<T> {
    private T lucky;
    private String name;
    private int age;

    public StudentGeneric(T lucky, String name, int age) {
        this.lucky = lucky;
        this.name = name;
        this.age = age;
    }

    public T getLucky() {
        return lucky;
    }

    public void setLucky(T lucky) {
        this.lucky = lucky;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
