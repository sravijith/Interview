package coding.exercises.java.arrays;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Stream;

public class ArrayCommonElements {

    public static void main(String[] args) {

        System.out.println("-----  Java 8 Version ------");
        java8();

        System.out.println("------  iterativeMethod  -----");
        iterativeMethod();

        System.out.println("-----   usingRetainAll  ------");
        usingRetainAll();
    }

    private static void java8() {
        Integer[] arr1 = {71, 21, 34, 89, 56, 28};

        Integer[] arr2 = {12, 56, 17, 21, 94, 34};

        List<Integer> list1 = Stream.of(arr1).toList();

        List<Integer> list2 = Arrays.stream(arr2).toList();

        list1.stream()
                .filter(list2::contains)
                .forEach(System.out::println);
    }

    public static void iterativeMethod() {
        String[] s1 = {"ONE", "TWO", "THREE", "FOUR", "FIVE", "FOUR"};

        String[] s2 = {"THREE", "FOUR", "FIVE", "SIX", "SEVEN", "FOUR"};

        Set<String> set = new HashSet<>();

        for (int i = 0; i < s1.length; i++) {
            for (int j = 0; j < s2.length; j++) {
                if (s1[i].equals(s2[j])) {
                    set.add(s1[i]);
                }
            }
        }

        System.out.println(set);
    }

    public static void usingRetainAll() {
        Integer[] i1 = {1, 2, 3, 4, 5, 4};

        Integer[] i2 = {3, 4, 5, 6, 7, 4};

        Set<Integer> set1 = new HashSet<>(List.of(i1));

        Set<Integer> set2 = new HashSet<>(List.of(i2));

        set1.retainAll(set2);

        System.out.println(set1);
    }
}
