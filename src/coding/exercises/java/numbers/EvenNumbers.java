package coding.exercises.java.numbers;

import java.util.stream.IntStream;

public class EvenNumbers {

    public static void main(String[] args) {
        IntStream.rangeClosed(1, 10)
                .map(i -> i * 2)
                .forEach(System.out::println);
    }
}
