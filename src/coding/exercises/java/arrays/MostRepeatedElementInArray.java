package coding.exercises.java.arrays;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class MostRepeatedElementInArray {

    public static void main(String[] args) {
        List<String> listOfStrings = Arrays.asList("Pen", "Eraser", "Note Book", "Pen", "Pencil", "Pen", "Note Book", "Pencil");

        Map<String, Long> elementCountMap = listOfStrings.stream()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        Map.Entry<String, Long> mostFrequentElement = elementCountMap.entrySet().stream()
                .max(Map.Entry.comparingByValue())
                .get();

        System.out.println("Most Frequent Element : " + mostFrequentElement.getKey());

        System.out.println("Count : " + mostFrequentElement.getValue());
    }
}
