package tudelft.sum;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TwoNumbersSumTest {
    @Test
    public void test1() {
        TwoNumbersSum calculator = new TwoNumbersSum();
        ArrayList<Integer> first = new ArrayList<>(Arrays.asList(2, 4, 3)); // 243
        ArrayList<Integer> second = new ArrayList<>(Arrays.asList(5, 1, 3)); // 513
        ArrayList<Integer> expected = new ArrayList<>(Arrays.asList(7, 5, 6)); // 243 + 513 = 756
        assertEquals(expected, calculator.addTwoNumbers(first, second));
    }
    @Test
    public void test2() {
        TwoNumbersSum calculator = new TwoNumbersSum();
        ArrayList<Integer> first = new ArrayList<>(Arrays.asList(9, 9)); // 99
        ArrayList<Integer> second = new ArrayList<>(Arrays.asList(1)); // 1
        ArrayList<Integer> expected = new ArrayList<>(Arrays.asList(1, 0, 0)); // 99 + 1 = 100
        assertEquals(expected, calculator.addTwoNumbers(first, second));
    }

    @Test
    public void test3() {
        TwoNumbersSum calculator = new TwoNumbersSum();
        ArrayList<Integer> first = new ArrayList<>();
        ArrayList<Integer> second = new ArrayList<>(Arrays.asList(3, 4, 5)); // 345
        ArrayList<Integer> expected = new ArrayList<>(Arrays.asList(3, 4, 5));
        assertEquals(expected, calculator.addTwoNumbers(first, second));
    }

    @Test
    public void test4() {
        TwoNumbersSum calculator = new TwoNumbersSum();
        ArrayList<Integer> first = new ArrayList<>();
        ArrayList<Integer> second = new ArrayList<>();
        ArrayList<Integer> expected = new ArrayList<>();
        assertEquals(expected, calculator.addTwoNumbers(first, second));
    }

    @Test
    public void test5() {
        TwoNumbersSum calculator = new TwoNumbersSum();
        ArrayList<Integer> first = new ArrayList<>(Arrays.asList(9, 9, 9)); // 999
        ArrayList<Integer> second = new ArrayList<>(Arrays.asList(1)); // 1
        ArrayList<Integer> expected = new ArrayList<>(Arrays.asList(1, 0, 0, 0)); // 999 + 1 = 1000
        assertEquals(expected, calculator.addTwoNumbers(first, second));
    }
}
