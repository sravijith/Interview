package coding.excercises;

import java.util.stream.IntStream;

public class SumOfNaturalNumbers {

    public static void main(String[] args) {
        int sum = IntStream.range(1, 11).sum();

        System.out.println(sum);
    }
}
