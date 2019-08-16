package org.school.eltex;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class FirstUnitTest {

    @Test
    void lambdaExpressions() {
        List<Integer> numbers = Arrays.asList(1, 2, 3);
        assertTrue(numbers.stream()
            .mapToInt(i -> i)
            .sum() > 5, "Sum should be greater than 5");
    }

    @Test
    void groupAssertions() {
        int[] numbers = { 0, 1, 2, 3, 4 };
        assertAll("numbers", () -> assertEquals(numbers[0], 1), () -> assertEquals(numbers[3], 3), () -> assertEquals(numbers[4], 1));
    }

    @Test
    @DisplayName("╯°□°）╯")
    @Disabled
    void disabledTest() {
        assertTrue(false);
    }
}
