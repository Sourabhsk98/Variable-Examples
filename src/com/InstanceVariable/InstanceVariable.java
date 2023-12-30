package com.InstanceVariable;
// Java Program to demonstrate
// Instance Variables
import java.io.*;

class Instancevariable {
    // the instance variable name is visible for any child class.
    public String name;
    // the grade variable is visible in Student class only.
    private double grade;
    // The value for the name variable is assigned in the constructor
    public Instancevariable (String stdName) {
        name = stdName;
    }
    // The variable grade is assigned a value now
    public void setgrade(double stdgrade) {
        grade = stdgrade;
    }
    //The following method will print the details of the Student
    public void printstd() {
        System.out.println("name  : " + name );
        System.out.println("grade :" + grade);
    }
    public static void main(String args[]) {
        Instancevariable set = new Instancevariable("Poornima");
        set.setgrade(10);
        set.printstd();
    }

}