package coding.exercises.java.arrays;

import java.util.Arrays;

public class LeadersInArray {

    public static void main(String[] args) {
        findTheLeadersMethod1(new int[]{12, 9, 7, 14, 8, 6, 3});

        findTheLeadersMethod1(new int[]{8, 23, 19, 21, 15, 6, 11});

        findTheLeadersMethod1(new int[]{55, 67, 71, 57, 51, 63, 38});

        findTheLeadersMethod1(new int[]{21, 58, 44, 14, 51, 36, 23});

        findTheLeadersMethod2(new int[]{12, 9, 7, 14, 8, 6, 3});

        findTheLeadersMethod2(new int[]{8, 23, 19, 21, 15, 6, 11});

        findTheLeadersMethod2(new int[]{55, 67, 71, 57, 51, 63, 38});

        findTheLeadersMethod2(new int[]{21, 58, 44, 14, 51, 36, 23});
    }

    static void findTheLeadersMethod1(int[] inputArray) {
        //Getting the length of input array

        int inputArrayLength = inputArray.length;

        //Assuming the last element as max

        int max = inputArray[inputArrayLength - 1];

        System.out.println("The leaders in " + Arrays.toString(inputArray) + " are : ");

        //Printing the last element as it is always a leader

        System.out.println(inputArray[inputArrayLength - 1]);

        //Traversing the remaining elements from right to left

        for (int i = inputArray.length - 2; i >= 0; i--) {
            //If the element is greater than max

            if (inputArray[i] > max) {
                //Printing the element

                System.out.println(inputArray[i]);

                //Updating the max

                max = inputArray[i];
            }
        }
    }

    static void findTheLeadersMethod2(int[] inputArray) {
        System.out.println("The leaders in " + Arrays.toString(inputArray) + " are :");

        for (int i = 0; i < inputArray.length; i++) {
            boolean flag = true;

            for (int j = i + 1; j < inputArray.length; j++) {
                if (inputArray[j] > inputArray[i]) {
                    flag = false;

                    break;
                }
            }

            if (flag) {
                System.out.println(inputArray[i]);
            }
        }
    }

}
