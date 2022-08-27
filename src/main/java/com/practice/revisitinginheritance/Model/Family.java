package com.practice.revisitinginheritance.Model;

import java.util.ArrayList;

public class Family {

    Person spouse;
    ArrayList<Person> child;

    public Person getSpouse() {
        return spouse;
    }

    public void setSpouse(Person spouse) {
        this.spouse = spouse;
    }

    public ArrayList<Person> getChild() {
        return child;
    }

    public void setChild(ArrayList<Person> child) {
        this.child = child;
    }

    public void showFamilyDetails(){
        System.out.println("Family \n Spouse : " + spouse.name + "\n Children :");
        for(Person person: child){
            System.out.println(person.name);
        }
    }
}
