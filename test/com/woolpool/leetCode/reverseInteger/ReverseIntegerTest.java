package com.woolpool.leetCode.reverseInteger;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by damon on 16/11/29.
 */
public class ReverseIntegerTest {
    ReverseInteger reverseInteger = new ReverseInteger();
    private String EQUALS = "equals";

    @Test
    public void reverse() throws Exception {

        assertEquals(EQUALS, reverseInteger.reverse(123), 321);
        assertEquals(EQUALS, reverseInteger.reverse(-123), -321);
        //int反转,溢出情况
        assertEquals(EQUALS, reverseInteger.reverse(1534236469), 0);
    }

}