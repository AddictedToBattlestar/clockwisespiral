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
        Integer[][] result = subject.generateSpiral(1);

        Integer[][] expectedResult = {
                {1}
        };
        assertArrayEquals(expectedResult, result);
    }

    @Test
    public void spiralOf2() {
        Integer[][] result = subject.generateSpiral(2);

        Integer[][] expectedResult = {
                {1, 2},
                {4, 3}
        };
        assertArrayEquals(expectedResult, result);
    }
}