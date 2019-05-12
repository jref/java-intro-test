package com.globallogic;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class ArrayTaskTest {

    private ArrayTask unit = new ArrayTask();

    @Test
    void reverseArrayEmptyArray() {
        int[] inputArray = new int[0];
        int[] actual = unit.reverseArray(inputArray);
        int[] expected = new int[0];
        assertArrayEquals(expected, actual);
    }

    @Test
    void reverseArrayWithEvenNumberOfElements() {
        int[] inputArray = {1, 2, 3, 4};
        int[] actual = unit.reverseArray(inputArray);
        int[] expected = {4, 3, 2, 1};
        assertArrayEquals(expected, actual);
    }

    @Test
    void reverseArrayWithOddNumberOfElements() {
        int[] inputArray = {1, 2, 3, 4, 5};
        int[] actual = unit.reverseArray(inputArray);
        int[] expected = {5, 4, 3, 2, 1};
        assertArrayEquals(expected, actual);
    }
}