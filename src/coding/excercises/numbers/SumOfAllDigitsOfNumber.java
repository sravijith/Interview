package coding.excercises.numbers;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SumOfAllDigitsOfNumber {

    public static void main(String[] args) {
        int i = 15623;

        Integer sumOfDigits = Stream.of(String.valueOf(i).split(""))
                .mapToInt(Integer::parseInt).sum();

        System.out.println(sumOfDigits);
    }
}
