package study3;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

import static org.assertj.core.api.Assertions.assertThat;

public class LambdaTest {
    private List<Integer> numbers;

    @BeforeEach
    void setUp() {
        numbers = Arrays.asList(1, 2, 3, 4, 5, 6);
    }

    @Test
    public void sumAll() {
        final int result = sumAll(numbers, number -> true);
        assertThat(result).isEqualTo(21);
    }

    @Test
    public void sumAllEven() {
        final int result = sumAll(numbers, number -> number % 2 == 0);
        assertThat(result).isEqualTo(12);
    }

    @Test
    public void sumAllOverThree() {
        final int result = sumAll(numbers, number -> number > 3);
        assertThat(result).isEqualTo(15);
    }

    private int sumAll(List<Integer> numbers, Predicate<Integer> predicate) {
        int total = 0;
        for (int number : numbers) {
            if (predicate.test(number)) {
                total += number;
            }
        }
        return total;
    }

//    private int sumAllEven(List<Integer> numbers) {
//        int total = 0;
//        for (int number : numbers) {
//            if (number % 2 == 0) {
//                total += number;
//            }
//        }
//        return total;
//    }
//
//    private int sumAllOverThree(List<Integer> numbers) {
//        int total = 0;
//        for (int number : numbers) {
//            if (number > 3) {
//                total += number;
//            }
//        }
//        return total;
//    }
}