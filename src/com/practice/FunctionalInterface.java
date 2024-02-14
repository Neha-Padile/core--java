package com.practice;

public interface FunctionalInterface {
     void m1(int a,int b);
     default void m2(){
         System.out.println("Default method");
     } static void m3(){
         System.out.println("Static Method");
     }
}
