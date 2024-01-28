package coding.excercises.numbers;

import java.util.stream.Stream;

public class SumOfAllDigitsOfNumber {

    public static void main(String[] args) {
        int i = 15623;

        withoutBuiltInMethods(i);

        usingRecursive(i);

        java8(i);

    }

    static void withoutBuiltInMethods(int inputNumber) {
        //Creating a copy of input number

        int copyOfInputNumber = inputNumber;

        //Initializing sum to 0

        int sum = 0;

        while (copyOfInputNumber != 0) {
            //Getting last digit of the input number

            int lastDigit = copyOfInputNumber % 10;

            //Adding last digit to sum

            sum = sum + lastDigit;

            //Removing last digit from the input number

            copyOfInputNumber = copyOfInputNumber / 10;
        }

        //Printing sum

        System.out.println("Sum Of All Digits In " + inputNumber + " = " + sum);
    }

    static int sum = 0;

    //Recursive function to calculate sum of all digits of a number

    static int usingRecursive(int inputNumber) {
        if (inputNumber == 0) {
            //if input number is 0, returning sum

            return sum;
        } else {
            //Getting last digit of input number

            int lastDigit = inputNumber % 10;

            //Adding last digit to sum

            sum = sum + lastDigit;

            //Removing last digit from input number

            inputNumber = inputNumber / 10;

            //Calling the function recursively

            usingRecursive(inputNumber);
        }

        return sum;
    }

    static void java8(int inputNumber) {
        Integer sumOfDigits = Stream.of(String.valueOf(inputNumber).split(""))
                .mapToInt(Integer::parseInt).sum();

        System.out.println(sumOfDigits);

    }

}
