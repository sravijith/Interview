package coding.exercises.java.list;

import java.util.*;

public class RemoveDuplicateElementsFromList {

    public static void main(String[] args) {
        List<String> listOfStrings = Arrays.asList("Java", "Python", "C#", "Java", "Kotlin", "Python");

        // Java8
        List<String> uniqueStrings = listOfStrings.stream().distinct().toList();

        System.out.println(uniqueStrings);

        // Using HashSet
        Set<String> setWithOutInsertionOrder = new HashSet<>(listOfStrings);

        List<String> listWithoutDuplicateElementsWithOutInsertionOrder = new ArrayList<>(setWithOutInsertionOrder);

        System.out.println("ArrayList After Removing Duplicate Elements : " + listWithoutDuplicateElementsWithOutInsertionOrder);

        // using LinkedHashSet
        HashSet<String> setWithInsertionOrder = new LinkedHashSet<>(listOfStrings);

        ArrayList<String> listWithoutDuplicateElementsWithInsertionOrder = new ArrayList<>(setWithInsertionOrder);

        System.out.println("ArrayList After Removing Duplicate Elements : " + listWithoutDuplicateElementsWithInsertionOrder);
    }
}
