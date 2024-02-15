package com.practice;

import java.util.Locale;
import java.util.Scanner;

public class VowelsCount {
    public int VowelsCountMethod(String str)
    { int count=0;
        for(int i=0; i<str.length();i++){
            if(str.charAt(i)=='a'||str.charAt(i)=='e'||str.charAt(i)=='i'||
                    str.charAt(i)=='o'||str.charAt(i)=='u'){
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        System.out.println("Enter the Name");
        Scanner scanner=new Scanner(System.in);
        String str=scanner.next();
        str=str.toLowerCase();
        VowelsCount a=new VowelsCount();
        int number =a.VowelsCountMethod(str);

        System.out.println("Number vowels present in "+ str+" Name: "+number);

    }
}
