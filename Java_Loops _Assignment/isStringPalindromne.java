//Q4. Write a Java program to check if a given string is a palindrome or not using a loop.

import java.util.Scanner;
public class isStringPalindromne {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string to check fopr palindrome (in small-case) : ");
        String str = sc.next();
        String revStr="";

        for(int i=(str.length()-1);i>=0;i--){
            revStr += str.charAt(i);
        }

        if(revStr.equals(str)){
            System.out.println("String "+str+" is Palindrome.");
        } else {
            System.out.println("String "+str+" is not Palindrome.");
        }
    }
}
