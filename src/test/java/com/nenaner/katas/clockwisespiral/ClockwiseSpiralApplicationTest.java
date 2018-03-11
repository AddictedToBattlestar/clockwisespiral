package com.nenaner.katas.clockwisespiral;

import org.junit.Before;
import org.junit.Test;

import java.security.InvalidParameterException;

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

    @Test
    public void spiralOf3() {
        Integer[][] result = subject.generateSpiral(3);

        Integer[][] expectedResult = {
                {1, 2, 3},
                {8, 9, 4},
                {7, 6, 5}
        };
        assertArrayEquals(expectedResult, result);
    }

    @Test
    public void spiralOf4() {
        Integer[][] result = subject.generateSpiral(4);

        Integer[][] expectedResult = {
                {1, 2, 3, 4},
                {12, 13, 14, 5},
                {11, 16, 15, 6},
                {10, 9, 8, 7}
        };
        assertArrayEquals(expectedResult, result);
    }


    @Test
    public void spiralOf5() {
        Integer[][] result = subject.generateSpiral(5);

        Integer[][] expectedResult = {
                {1, 2, 3, 4, 5},
                {16,17,18,19,6},
                {15,24,25,20,7},
                {14,23,22,21,8},
                {13,12,11,10,9}
        };
        assertArrayEquals(expectedResult, result);
    }

    @Test
    public void spiralOf6() {
        Integer[][] result = subject.generateSpiral(6);

        Integer[][] expectedResult = {
                {1, 2, 3, 4, 5,6},
                {20,21,22,23,24,7},
                {19,32,33,34,25,8},
                {18,31,36,35,26,9},
                {17,30,29,28,27,10},
                {16,15,14,13,12,11}
        };
        assertArrayEquals(expectedResult, result);
    }

    @Test(expected = InvalidParameterException.class)
    public void itHandlesInvalidParameter() {
        subject.generateSpiral(-1);
    }
}