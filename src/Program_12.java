/*
12. Write a programme to input any number and check if it is prime or not.
(Prime number is a number that is greater than 1 and divided by 1 or itself only. In other words,
prime numbers can't be divided by other numbers than itself or 1. For example 2, 3, 5, 7, 11, 13,
17.... are the prime numbers.)
 */

import java.util.Scanner;

public class Program_12 {

    public static void main(String[] args) {

        int temp;
        boolean isPrime = true;

        Scanner sc = new Scanner(System.in);
        System.out.print("Input any number: ");
        int num = sc.nextInt();
        sc.close();
        for (int i = 2; i <= num / 2; i++) {
            temp = num % i;
            if (temp == 0) {
                isPrime = false;
                break;
            }
        }
        if (isPrime)
            System.out.println(num + " is a Prime Number");
        else
            System.out.println(num + " is not a Prime Number");

    }

}
