package com.practice.revisitinginheritance.Model;

public class Person {

    String name;

    public void show(){
        System.out.println("Person Name is " + name);
    }

    public Person(String name) {
        this.name = name;
    }
}
