package com.nenaner.katas.clockwisespiral;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class ClockwiseSpiralApplicationTest {

    ClockwiseSpiralApplication subject;

    @Before
    public void setUp() {
        subject = new ClockwiseSpiralApplication();
    }

    @Test
    public void spiralOf1() {
        int[][] result = subject.generateSpiral(1);

        int[][] expectedResult = {
                {1}
        };
        assertArrayEquals(expectedResult, result);
    }
}