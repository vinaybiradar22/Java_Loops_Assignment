//Q2. Write a Java program to print a multiplication table for a given number 'n'.

import java.util.Scanner;
public class multiplicationTable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a integer to find table : ");
        int num = sc.nextInt();
        System.out.println("Table is : ");
        for(int i=num;i<=10*num;i+=num){
            System.out.println(i);
        }

    }
}
