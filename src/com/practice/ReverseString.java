package com.practice;

import java.sql.SQLOutput;
import java.util.Scanner;

public class ReverseString {
   public String name;
   public static String reverseString(String str){
       String str1="";
       for(int i= str.length()-1; i>=0;i--)
       {
           str1=str1+str.charAt(i);
       }
       return str1;
   }
    public static void main(String[] args) {
        System.out.println("Enter the Name");
        Scanner scanner=new Scanner(System.in);
        String name=scanner.next();

        System.out.println("reverse string:"+reverseString(name));
    }

}
