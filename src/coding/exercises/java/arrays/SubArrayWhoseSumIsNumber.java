package coding.exercises.java.arrays;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class SubArrayWhoseSumIsNumber {

    public static void main(String[] args) {

        findSubArrayOn(new int[]{42, 15, 12, 8, 6, 32}, 26);

        findSubArrayOn(new int[]{12, 5, 31, 13, 21, 8}, 49);

        findSubArrayOn(new int[]{15, 51, 7, 81, 5, 11, 25}, 41);

        int[] subarray = findSubarrayWithGivenSum(new int[]{42, 15, 12, 8, 6, 32}, 26);

        if (subarray.length == 0) {
            System.out.println("No subarray with given sum found.");
        } else {
            System.out.println("Sum found between indexes " + subarray[0] + " and " + subarray[1]);
        }

        findSubArrayOn2(new int[]{42, 15, 12, 8, 6, 32}, 26);
    }

    public static int[] findSubarrayWithGivenSum(int[] arr, int sum) {
        Map<Integer, Integer> map = new HashMap<>();
        int currSum = 0;
        for (int i = 0; i < arr.length; i++) {
            currSum += arr[i];
            if (currSum == sum) {
                return new int[]{0, i};
            }
            if (map.containsKey(currSum - sum)) {
                return new int[]{map.get(currSum - sum) + 1, i};
            }
            map.put(currSum, i);
        }
        return new int[]{};
    }


    // Time complexity of this method is O(n).
    static void findSubArrayOn(int[] inputArray, int inputNumber) {
        //Initializing sum with the first element of the inputArray

        int sum = inputArray[0];

        //Initializing starting point with 0

        int start = 0;

        //Iterating through inputArray starting from second element

        for (int i = 1; i < inputArray.length; i++) {
            //Adding inputArray[i] to the current 'sum'

            sum = sum + inputArray[i];

            //If sum is greater than inputNumber then following loop is executed until

            //sum becomes either smaller than or equal to inputNumber

            while (sum > inputNumber && start <= i - 1) {
                //Removing starting elements from the 'sum'

                sum = sum - inputArray[start];

                //Incrementing start by 1

                start++;
            }

            //If 'sum' is equal to 'inputNumber' then printing the sub array

            if (sum == inputNumber) {
                System.out.println("Continuous sub array of " + Arrays.toString(inputArray) + " whose sum is " + inputNumber + " is ");

                for (int j = start; j <= i; j++) {
                    System.out.print(inputArray[j] + " ");
                }

                System.out.println();
            }
        }
    }

    // Time complexity of this method is O(n^2)
    static void findSubArrayOn2(int[] inputArray, int inputNumber) {
        //Initializing 'sum' to 0

        int sum = 0;

        //Iterating through 'inputArray'

        for (int i = 0; i < inputArray.length; i++) {
            //Assigning inputArray[i] to 'sum'

            sum = inputArray[i];

            for (int j = i + 1; j < inputArray.length; j++) {
                //Adding inputArray[j] to 'sum'

                sum = sum + inputArray[j];

                //If 'sum' is equal to 'inputNumber' then printing the sub array

                if (sum == inputNumber) {
                    System.out.println("Continuous sub array of " + Arrays.toString(inputArray) + " whose sum is " + inputNumber + " is ");

                    for (int k = i; k <= j; k++) {
                        System.out.print(inputArray[k] + " ");
                    }

                    System.out.println();
                }

                //if 'sum' is smaller than 'inputNumber', continue the loop

                else if (sum < inputNumber) {
                    continue;
                }

                //if 'sum' is greater than 'inputNumber', then break the loop

                else if (sum > inputNumber) {
                    break;
                }
            }
        }
    }

}
