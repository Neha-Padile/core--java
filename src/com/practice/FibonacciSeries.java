package com.practice;

import java.util.Scanner;


public class FibonacciSeries {

     static void FibonacciMethod(int N) {
        int num1;
        int num2, num3;
        num1 = 0;
        num2 = 1;
        System.out.println("Fibonacci Series number series: ");
        for (int i = 0; i < N; i++) {
            System.out.print(num1 + " ");
            num3 = num1 + num2;
            num1 = num2;
            num2 = num3;

        }
    }

    public static void main(String[] args) {
        System.out.println("Enter the Fibonacci Series Number");
        Scanner scanner=new Scanner(System.in);
        int N = scanner.nextInt();
        FibonacciSeries.FibonacciMethod(N);

    }

}
