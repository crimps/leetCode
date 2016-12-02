package com.woolpool.leetCode.stringToInteger;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by damon on 16/11/30.
 */
public class StringToIntegerTest {
    StringToInteger stringToInteger = new StringToInteger();
    String EQUALS = "equals";

    @Test
    public void myAtoi() throws Exception {
        assertEquals(EQUALS, 0, stringToInteger.myAtoi_type2(""));
        assertEquals(EQUALS, 0, stringToInteger.myAtoi_type2("+"));
        //溢出
        assertEquals(EQUALS, 2147483647, stringToInteger.myAtoi_type2("9223372036854775809"));
        assertEquals(EQUALS, 1, stringToInteger.myAtoi_type2("+1"));
        assertEquals(EQUALS, 0, stringToInteger.myAtoi_type2(" b11228552307"));
        assertEquals(EQUALS, -12, stringToInteger.myAtoi_type2("  -0012a42"));
        assertEquals(EQUALS, 0, stringToInteger.myAtoi_type2("+-2"));
        assertEquals(EQUALS, 1, stringToInteger.myAtoi_type2("1"));
        assertEquals(EQUALS, 0, stringToInteger.myAtoi_type2("   +0 123"));
        assertEquals(EQUALS, 2147483647, stringToInteger.myAtoi_type2("2147483648"));
        assertEquals(EQUALS, 123, stringToInteger.myAtoi_type2("+123"));
        assertEquals(EQUALS, 1, stringToInteger.myAtoi_type2("1a"));
        assertEquals(EQUALS, -2147483648, stringToInteger.myAtoi_type2("      -11919730356x"));

    }

}