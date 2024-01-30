//Q1. Write a Java program to calculate the sum of natural numbers up to a given positive integer 'n'.

import java.util.Scanner;

public class sumOfNaturalNum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter +ve integer : ");
        int num = sc.nextInt();

        int sum=0;
        for(int i =1;i<=num;i++){
            sum += i;
        }
        System.out.println("Sum of Natural num upto "+num+" is : "+sum);
    }
}
