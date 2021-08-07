package com.company;

public class Person {
    String name;
    double capital;
    public Person(){}

    public Person(String entrepreneurName, double capital) {
        this.name = entrepreneurName;
        this.capital = capital;
    }

    public void PersonInfo(){
        System.out.println("This is " + this.name + ", " + "the entrepreneur of ");
    }

}
