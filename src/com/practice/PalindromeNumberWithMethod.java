package com.practice;
import java.util.Objects;
import java.util.Scanner;
public class PalindromeNumberWithMethod {
    public  boolean palindromeNumberCount(String num){
        boolean flag=false;
        int i = 0;
        int j = num.length() - 1;
        while (i < j) {
            if (num.charAt(i) == num.charAt(j)) {
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
        boolean b1 = true;
        do {
            System.out.println("Enter The Number");
            Scanner scanner = new Scanner(System.in);
            String num = scanner.next();
            if(num.equals(0+"")){
                System.exit(0);
            }
            PalindromeWithMethod a = new PalindromeWithMethod();
            boolean b = a.checkPalindrome(num);
            if (b == true) {
                System.out.println("enter Number is Palindrome");
            } else {
                System.out.println("enter Number is not Palindrome");
            }
        }while (b1);
    }

}
