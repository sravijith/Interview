package coding.exercises.java.arrays;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class SecondLargestNumberInArray {

    public static void main(String[] args) {

        var input = new int[]{45, 12, 56, 15, 24, 75, 31, 89};

        secondLargest(input);

        java8(input);
    }

    private static void java8(int[] input) {

        List<Integer> listOfIntegers = Arrays.stream(input).boxed().toList();

        Integer secondLargestNumber = listOfIntegers.stream()
                .sorted(Comparator.reverseOrder())
                .skip(1)
                .findFirst()
                .orElse(0);

        System.out.println(secondLargestNumber);
    }

    static void secondLargest(int[] input) {
        int firstLargest, secondLargest;

        //Checking first two elements of input array

        if (input[0] > input[1]) {
            //If first element is greater than second element

            firstLargest = input[0];

            secondLargest = input[1];
        } else {
            //If second element is greater than first element

            firstLargest = input[1];

            secondLargest = input[0];
        }

        //Checking remaining elements of input array

        for (int i = 2; i < input.length; i++) {
            if (input[i] > firstLargest) {
                //If element at 'i' is greater than 'firstLargest'

                secondLargest = firstLargest;

                firstLargest = input[i];
            } else if (input[i] < firstLargest && input[i] > secondLargest) {
                //If element at 'i' is smaller than 'firstLargest' and greater than 'secondLargest'

                secondLargest = input[i];
            }
        }

        System.out.println("secongLargest without Built in Method: " + secondLargest);
    }
}
