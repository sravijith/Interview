package coding.exercises.java.list;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class ThreeMaxAndMinNumbers {

    public static void main(String[] args) {
        List<Integer> listOfIntegers = Arrays.asList(45, 12, 56, 15, 24, 75, 31, 89);

        System.out.println("----- 3 Minimum Numbers  -----");

        listOfIntegers.stream()
                .sorted()
                .limit(3)
                .forEach(System.out::println);

        System.out.println("-----  3 Maximum Numbers  -----");

        listOfIntegers.stream()
                .sorted(Comparator.reverseOrder())
                .limit(3)
                .forEach(System.out::println);
    }
}
