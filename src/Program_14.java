/*
14. Write a program in Java to display the pattern like a diamond.
While loop
      *
     ***
    *****
   *******
  *********
 ***********
*************
 ***********
  *********
   *******
    *****
     ***
      *
 */

import java.util.Scanner;

public class Program_14 {

    public static void main(String[] args) {

        int number = 7, m = 1, n;

        while (m <= number) {
            n = 1;

            // Inner loop 1 to print half diamond
            while (n++ <= number - m) {
                System.out.print(" ");
            }
            n = 1;

            // inner loop 2 to prints space
            while (n++ <= m * 2 - 1) {
                System.out.print("*");
            }
            System.out.println(); // print white space inbetween
            m++;
        }
        m = number - 1;

        // Outer loop 2 to print star
        while (m > 0) {
            n = 1;
            while (n++ <= number - m) {
                System.out.print(" ");
            }
            n = 1;

            //Inner loop 2 to print stars
            while (n++ <= m * 2 - 1) {
                System.out.print("*");
            }
            System.out.println();
            m--;    // Decrementing for reverse pyramid
        }

    }
}
