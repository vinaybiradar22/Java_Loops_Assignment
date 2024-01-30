//Q3. Write a Java program to find the GCD (Greatest Common Divisor) of two numbers using a loop.

import java.util.Scanner;
public class gcd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter num 1 : ");
        int num1 = sc.nextInt();
        System.out.print("Enter num 2 : ");
        int num2 = sc.nextInt();

        int gcd=0;

            for (int i = 2; i <= num1 && i <= num2; i++) {
                if (num1 % i == 0 && num2 % i == 0) {
                    gcd = 1;
                    System.out.println("gcd = " + i);
                    break;
                }
            }


        if(gcd==0){
            System.out.println("No gcd found.");
        }


    }
}
