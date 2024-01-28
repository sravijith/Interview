package coding.excercises.java.arrays;

import java.util.Arrays;

/*
 *Given an array of integers, you have to find all pairs of elements in this array such that whose sum must be equal to a given number.
 * For example, if {4, 5, 7, 11, 9, 13, 8, 12} is an array and 20 is the given number, then you have to find all pairs
 * of elements in this array whose sum must be 20. In this example, (9, 11), (7, 13) and (8, 12) are such pairs whose sum is 20.
 */
public class PairsOfElementsInArray {

    // Time Complexity of this solution is O(n^2).
    static void findThePairsWithNSquareComplexity(int inputArray[], int inputNumber) {
        System.out.println("Pairs of elements whose sum is " + inputNumber + " are : ");

        for (int i = 0; i < inputArray.length; i++) {
            for (int j = i + 1; j < inputArray.length; j++) {
                if (inputArray[i] + inputArray[j] == inputNumber) {
                    System.out.println(inputArray[i] + " + " + inputArray[j] + " = " + inputNumber);
                }
            }
        }
    }

    // Time Complexity of this solution is O(nlogn).
    static void findThePairsWithNlogNcomplexity(int inputArray[], int inputNumber) {
        //Sorting the given array

        Arrays.sort(inputArray);

        System.out.println("Pairs of elements whose sum is " + inputNumber + " are : ");

        // Initializing i to first index
        int i = 0;

        // Initializing j to last index
        int j = inputArray.length - 1;

        // Till i crosses j, perform the following task

        while (i < j) {
            // If inputArray[i]+inputArray[j] is equal to inputNumber
            if (inputArray[i] + inputArray[j] == inputNumber) {
                // then Print inputArray[i] and inputArray[j]
                System.out.println(inputArray[i] + " + " + inputArray[j] + " = " + inputNumber);

                // Increment i
                i++;
                // Decrement j
                j--;
            } else if (inputArray[i] + inputArray[j] < inputNumber) { // If inputArray[i]+inputArray[j] is smaller than inputNumber
                // then increment i
                i++;
            } else if (inputArray[i] + inputArray[j] > inputNumber) { // If inputArray[i]+inputArray[j] is greater than inputNumber
                // then decrement j
                j--;
            }
        }
    }

    public static void main(String[] args) {
        findThePairsWithNlogNcomplexity(new int[]{4, 6, 5, -10, 8, 5, 20}, 10);

        findThePairsWithNlogNcomplexity(new int[]{4, -5, 9, 11, 25, 13, 12, 8}, 20);

        findThePairsWithNlogNcomplexity(new int[]{12, 13, 10, 15, 8, 40, -15}, 25);

        findThePairsWithNlogNcomplexity(new int[]{12, 23, 10, 41, 15, 38, 27}, 50);
    }

}
