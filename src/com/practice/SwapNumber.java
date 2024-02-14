package com.practice;

import java.io.InputStream;
import java.util.Scanner;

public class SwapNumber {
    static int a=8;
    static int b=5;


    public static void main(String[] args) {
        System.out.println("Number before operation");
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter Number a :");
        String str=scanner.next();

        System.out.println("Enter Number b :");
        String str1=scanner.next();
        a=Integer.valueOf(str);
        b=Integer.valueOf(str1);

        System.out.println("Number before Swap a: "+a+", b:"+b);

        b=a+b;
        a=b-a;
        b=b-a;
        System.out.println("Number after swap operation a:"+a+",  b:"+b);

    }
}
