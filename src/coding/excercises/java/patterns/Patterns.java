package coding.excercises.patterns;

import java.util.Scanner;

public class Patterns {

    public static void main(String[] args) {

        System.out.println("------------- Pattern 1  -----------------");
        pattern1();

        System.out.println("------------- Pattern 2  -----------------");
        pattern2();

        System.out.println("------------- Pattern 3  -----------------");
        pattern3();

        System.out.println("------------- Pattern 4  -----------------");
        pattern4();

        System.out.println("------------- Pattern 5  -----------------");
        pattern5();

        System.out.println("------------- Pattern 6  -----------------");
        pattern6();

    }

    public static void pattern1() {

        Scanner sc = new Scanner(System.in);

        //Taking noOfRows value from the user

        System.out.println("How Many Rows You Want In Your Pyramid?");

        int noOfRows = sc.nextInt();

        //Initializing rowCount with 1

        int rowCount = 1;

        System.out.println("Here Is Your Pyramid");

        //Implementing the logic

        for (int i = noOfRows; i > 0; i--) {
            //Printing i spaces at the beginning of each row

            for (int j = 1; j <= i; j++) {
                System.out.print(" ");
            }

            //Printing 'rowCount' value 'rowCount' times at the end of each row

            for (int j = 1; j <= rowCount; j++) {
                System.out.print(rowCount + " ");
            }

            System.out.println();

            //Incrementing the rowCount

            rowCount++;
        }

    }

    public static void pattern2() {

        Scanner sc = new Scanner(System.in);

        //Taking noOfRows value from the user

        System.out.println("How Many Rows You Want In Your Pyramid?");

        int noOfRows = sc.nextInt();

        //Initializing rowCount with 1

        int rowCount = 1;

        System.out.println("Here Is Your Pyramid");

        //Implementing the logic

        for (int i = noOfRows; i > 0; i--) {
            //Printing i spaces at the beginning of each row

            for (int j = 1; j <= i; j++) {
                System.out.print(" ");
            }

            //Printing 'j' value at the end of each row

            for (int j = 1; j <= rowCount; j++) {
                System.out.print(j + " ");
            }

            System.out.println();

            //Incrementing the rowCount

            rowCount++;
        }


    }

    public static void pattern3() {

        Scanner sc = new Scanner(System.in);

        //Taking noOfRows value from the user

        System.out.println("How Many Rows You Want In Your Pyramid?");

        int noOfRows = sc.nextInt();

        //Initializing rowCount with 1

        int rowCount = 1;

        System.out.println("Here Is Your Pyramid");

        //Implementing the logic

        for (int i = noOfRows; i > 0; i--) {
            //Printing i spaces at the beginning of each row

            for (int j = 1; j <= i; j++) {
                System.out.print(" ");
            }

            //Printing * at the end of each row

            for (int j = 1; j <= rowCount; j++) {
                System.out.print("* ");
            }

            System.out.println();

            //Incrementing the rowCount

            rowCount++;
        }
    }

    public static void pattern4() {

        Scanner sc = new Scanner(System.in);

        //Taking noOfRows value from the user

        System.out.println("How Many Rows You Want In Your Pyramid?");

        int noOfRows = sc.nextInt();

        //Initializing rowCount with 1

        int rowCount = 1;

        System.out.println("Here Is Your Pyramid");

        //Implementing the logic

        for (int i = noOfRows; i > 0; i--) {
            //Printing i*2 spaces at the beginning of each row

            for (int j = 1; j <= i * 2; j++) {
                System.out.print(" ");
            }

            //Printing j value where j value will be from 1 to rowCount

            for (int j = 1; j <= rowCount; j++) {
                System.out.print(j + " ");
            }

            //Printing j value where j value will be from rowCount-1 to 1

            for (int j = rowCount - 1; j >= 1; j--) {
                System.out.print(j + " ");
            }

            System.out.println();

            //Incrementing the rowCount

            rowCount++;
        }
    }

    public static void pattern5() {
        Scanner sc = new Scanner(System.in);

        //Taking noOfRows value from the user

        System.out.println("How Many Rows You Want In Your Pyramid?");

        int noOfRows = sc.nextInt();

        //Initializing rowCount with noOfRows

        int rowCount = noOfRows;

        System.out.println("Here Is Your Pyramid");

        //Implementing the logic

        for (int i = 0; i < noOfRows; i++) {
            //Printing i*2 spaces at the beginning of each row

            for (int j = 1; j <= i * 2; j++) {
                System.out.print(" ");
            }

            //Printing j where j value will be from 1 to rowCount

            for (int j = 1; j <= rowCount; j++) {
                System.out.print(j + " ");
            }

            //Printing j where j value will be from rowCount-1 to 1

            for (int j = rowCount - 1; j >= 1; j--) {
                System.out.print(j + " ");
            }

            System.out.println();

            //Decrementing the rowCount

            rowCount--;
        }
    }

    public static void pattern6() {
        Scanner sc = new Scanner(System.in);

        //Taking noOfRows value from the user

        System.out.println("How Many Rows You Want In Your Pyramid?");

        int noOfRows = sc.nextInt();

        //Initializing rowCount with 1

        int rowCount = 1;

        System.out.println("Here Is Your Pyramid");

        //Implementing the logic

        for (int i = noOfRows; i >= 1; i--) {
            //Printing i*2 spaces at the beginning of each row

            for (int j = 1; j <= i * 2; j++) {
                System.out.print(" ");
            }

            //Printing j where j value will be from i to noOfRows

            for (int j = i; j <= noOfRows; j++) {
                System.out.print(j + " ");
            }

            //Printing j where j value will be from noOfRows-1 to i

            for (int j = noOfRows - 1; j >= i; j--) {
                System.out.print(j + " ");
            }

            System.out.println();

            //Incrementing the rowCount

            rowCount++;
        }
    }

}
