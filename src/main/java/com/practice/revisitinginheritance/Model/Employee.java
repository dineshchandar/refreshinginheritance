package com.practice.revisitinginheritance.Model;

public class Employee extends Person{

    public Employee(String name) {
        super(name);
    }

    public int salary;
    public String companyName;

    public void showEmploymentDetails(){
        show();
        System.out.println("Employment Details \n 1. Salary : " + salary + "\n 2. Company Name : " + companyName);
    }
}
