package coding.exercises.java.strings;

import java.util.Arrays;
import java.util.stream.Collectors;

public class ReverseEachWordOfString {

    public static void main(String[] args) {
        String str = "Java Concept Of The Day";

        java8(str);
    }

    private static void java8(String str) {
        String reversedStr = Arrays.stream(str.split(" "))
                .map(word -> new StringBuffer(word).reverse())
                .collect(Collectors.joining(" "));

        System.out.println(reversedStr);

        System.out.println("-------------------------");
    }

    static void reverseEachWordOfString(String inputString) {
        String[] words = inputString.split(" ");

        String reverseString = "";

        for (int i = 0; i < words.length; i++) {
            String word = words[i];

            String reverseWord = "";

            for (int j = word.length() - 1; j >= 0; j--) {
                reverseWord = reverseWord + word.charAt(j);
            }

            reverseString = reverseString + reverseWord + " ";
        }

        System.out.println(inputString);

        System.out.println(reverseString);

        System.out.println("-------------------------");
    }

}
