package com.practice.revisitinginheritance;

import com.practice.revisitinginheritance.Model.Employee;
import com.practice.revisitinginheritance.Model.Family;
import com.practice.revisitinginheritance.Model.Person;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
@RequestMapping("v1/inheritance")
public class InheritanceController {

    @GetMapping("/hello")
    void helloWorld(){
        Employee emp1 = new Employee("ceedee");
        emp1.companyName = "cmp";
        emp1.salary = 10;
        emp1.showEmploymentDetails();

        Family family = new Family();
        Person spouse = new Person("yu");
        family.setSpouse(spouse);
        ArrayList children = new ArrayList();
        Person child = new Person("sd");
        children.add(child);
        family.setChild(children);

        family.showFamilyDetails();

    }
}
