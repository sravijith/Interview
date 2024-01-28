package coding.excercises.numbers;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class PalindromeNumber {

    public static void main(String[] args) {

        System.out.println(isPalindrome(232));
    }

    static boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }

        long reversed = 0;
        long temp = x;

        while (temp != 0) {
            int digit = (int) (temp % 10);
            reversed = reversed * 10 + digit;
            temp /= 10;
            System.out.println("digit: " + digit + ", reversed: " + reversed + ", temp: " + temp);
        }

        return (reversed == x);
    }

}
