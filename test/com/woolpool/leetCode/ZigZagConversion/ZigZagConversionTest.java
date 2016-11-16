package com.woolpool.leetCode.ZigZagConversion;

import org.junit.Test;

import static org.junit.Assert.*;

public class ZigZagConversionTest {
    private String convert = "PAYPALISHIRING";

    @Test
    public void testConvert() throws Exception {
        ZigZagConversion zigZagConversion = new ZigZagConversion();
        zigZagConversion.convert(convert, 3);
        zigZagConversion.convert("ABC", 2);
        zigZagConversion.convert("ABCDE", 4);
    }
}