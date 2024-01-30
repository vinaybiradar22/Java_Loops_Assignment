//Q5. Write a Java program to generate and print the first 'n' terms of the Fibonacci series.

import java.util.Scanner;
public class nTermsOfFibonacciSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter num: ");
        int n = sc.nextInt();

        int num1=0,num2=1,num3=0;
        System.out.print("Fibonacci Series is : "+num1+" "+num2+" ");
        for(int i=2;i<n;i++){
            num3=num1+num2;
            System.out.print(num3+" ");
            num1=num2;
            num2=num3;

        }

    }
}
