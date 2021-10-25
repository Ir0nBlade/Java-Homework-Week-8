/*
2. -Read the numbers from the console entered by the user and print the minimum
and maximum number the user has entered.
-Before the user enters the number, print the message Enter number:
-If the user enters an invalid number, break out of the loop and print the minimum and maximum
number.
Hint:
-Use an endless while loop.
-Create a class with the name MinAndMaxInputChallenge.
 */


import java.util.Scanner;

public class Program_2 {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        int min=Integer.MAX_VALUE;  // MAX_VALUE store the maximum possible value of integer
        int max=Integer.MIN_VALUE;  // Integer.MIN_VALUE stores the minimum possible value of integer

        while(true){
            System.out.print("Enter number: ");
            boolean isAnInt = scanner.hasNextInt();

            // conditional statement to check if input data is integer type
            if (isAnInt){
                int number =scanner.nextInt();

                if (number>max){
                    max=number;
                }
                if (number<min){
                    min=number;
                }
            }else {
                break; // to break endless while loop
            }
            scanner.nextLine(); // handle input
        }
        System.out.println("Min= "+ min + ", Max= "+max);
        scanner.close();
    }

}
