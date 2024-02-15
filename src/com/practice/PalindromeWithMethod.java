package com.practice;

import java.util.Scanner;

public class PalindromeWithMethod {
    public boolean checkPalindrome(String str) {
        boolean flag = false;
        int i = 0;
        int j = str.length() - 1;
        while (i < j) {
            if (str.charAt(i) == str.charAt(j)) {
                i++;
                j--;
                flag = true;
            } else {

                flag = false;
                break;
            }
        }
        return flag;
    }

    public static void main(String[] args) {
        System.out.println("Enter the Name");
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        PalindromeWithMethod a = new PalindromeWithMethod();
        boolean b = a.checkPalindrome(str);
        if (b == true) {
            System.out.println("enter string is Palindrome");
        } else {
            System.out.println("enter string is not Palindrome");
        }

    }
}
