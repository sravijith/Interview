package coding.exercises.java.numbers;

import java.util.Scanner;

public class ReverseAddPalindrome {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Number : ");

        int inputNumber = sc.nextInt();

        reverseAndAdd(inputNumber);
    }

    //Method To Reverse A Number

    static int reverseNumber(int number) {
        int reverse = 0;

        int rem = 0;

        while (number != 0) {
            rem = number % 10;

            reverse = (reverse * 10) + rem;

            number = number / 10;
        }

        return reverse;
    }

    //Method To Check For Palindrome

    static boolean checkPalindrome(int number) {
        int reverse = reverseNumber(number);

        if (reverse == number) {
            return true;
        } else {
            return false;
        }
    }

    // Method To Reverse And Add Given Number Until You Get A Palindrome

    static void reverseAndAdd(int number) {
        if (checkPalindrome(number)) {
            System.out.println("Given Number is already a palindrome");
        } else {
            while (!checkPalindrome(number)) {
                int reverse = reverseNumber(number);

                int sum = number + reverse;

                System.out.println(number + " + " + reverse + " = " + sum);

                number = sum;
            }
        }
    }

}
