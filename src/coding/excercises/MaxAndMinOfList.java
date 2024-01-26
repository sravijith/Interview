package coding.excercises;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MaxAndMinOfList {

    public static void main(String[] args) {
        List<Integer> listOfIntegers = Arrays.asList(45, 12, 56, 15, 24, 75, 31, 89);

        int max = listOfIntegers.stream()
                .max(Comparator.naturalOrder())
                .orElse(0);

        System.out.println("Maximum Element : " + max);

        int min = listOfIntegers.stream()
                .min(Comparator.naturalOrder())
                .orElse(0);

        System.out.println("Minimum Element : " + min);
    }
}
