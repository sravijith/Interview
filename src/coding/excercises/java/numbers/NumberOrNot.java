package coding.excercises.java.numbers;

import java.util.Scanner;

public class NumberOrNot {

    public static void main(String[] args) {
        System.out.println("Enter your mobile number");

        Scanner sc = new Scanner(System.in);

        String input = sc.next();

        if (isNumberOrNot(input) && (input.length() == 10)) {
            System.out.println("Good!!! You have entered valid mobile number");
        } else {
            System.out.println("Sorry!!!! You have entered invalid mobile number. Try again...");
        }
    }

    static boolean isNumberOrNot(String input) {
        try {
            Integer.parseInt(input);
        } catch (NumberFormatException ex) {
            return false;
        }
        return true;
    }

}
