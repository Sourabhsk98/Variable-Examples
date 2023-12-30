package com.StaticVariable;

public class StaticVariable {

    //Creating two static members
    static boolean check;
    static int number;
    static int answer = 10;

    public static void main(String[] args) {
        System.out.println(StaticVariable.check); // Default value is false.
        System.out.println(StaticVariable.number); // Default value is 0.
        System.out.println(StaticVariable.answer); // Assigned value is printed.
    }
}
