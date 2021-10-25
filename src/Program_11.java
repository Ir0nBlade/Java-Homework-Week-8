/*
11. Even Digit Sum
Write a method named getEvenDigitSum with one parameter of type int called number.
The method should return the sum of the even digits within the number.
If the number is negative, the method should return -1 to indicate an invalid value.
EXAMPLE INPUT/OUTPUT:
* getEvenDigitSum(123456789); → should return 20 since 2 + 4 + 6 + 8 = 20
* getEvenDigitSum(252); → should return 4 since 2 + 2 = 4
* getEvenDigitSum(-22); → should return -1 since the number is negative
NOTE: The method getEvenDigitSum should be defined as public static
 */

public class Program_11 {

    public static int getEvenDigitSum(int number) {

        if (number < 0) {
            return -1;
        }

        int sum = 0;
        int compare = 0;
        while (number > 0) {
            compare = number % 10;
            if (compare % 2 == 0) {
                sum += compare;
            }
            number /= 10;
        }
        return sum;
    }

    public static void main(String[] args) {

        System.out.println(getEvenDigitSum(123456789));
        System.out.println(getEvenDigitSum(252));
        System.out.println(getEvenDigitSum(-22));

    }
}

