package com.example.designPattern;

import java.util.ArrayList;
import java.util.List;

public class Person {
    
    private String name;
    private List<Person> descendants = new ArrayList<>();

    public Person(String name){
        this.name = name;
    }

    public void addDescendant(Person person){
        descendants.add(person);
    }

    public void removeDescendant(Person person){
        descendants.remove(person);
    }

    void sayName(){
        System.out.println(this.name);
        for (Person person : this.descendants) {
            person.sayName();
        }
    }
    
}
