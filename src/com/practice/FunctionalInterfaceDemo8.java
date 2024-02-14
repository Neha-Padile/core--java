package com.practice;

public class FunctionalInterfaceDemo8 {
    public static void main(String[] args) {


        FunctionalInterface.m3();
        FunctionalInterface functionalInterface=(a,b)-> {
            System.out.println("sachin ="+(a+b));
        } ;
        functionalInterface.m1(20,30);
        functionalInterface.m2();
    }

}

