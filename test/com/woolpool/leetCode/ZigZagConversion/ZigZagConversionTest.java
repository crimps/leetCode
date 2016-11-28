package com.woolpool.leetCode.ZigZagConversion;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class ZigZagConversionTest {
    private String convert = "";
    private String EQUALS = "equsls";

    @Test
    public void testConvert() throws Exception {
        ZigZagConversion zigZagConversion = new ZigZagConversion();
        assertEquals(EQUALS, "PAHNAPLSIIGYIR", zigZagConversion.convert("PAYPALISHIRING", 3));
        assertEquals(EQUALS, zigZagConversion.convert("ABCDE", 2), "ACEBD");
        assertEquals(EQUALS, zigZagConversion.convert("ABCDE", 4), "ABCED");
        assertEquals(EQUALS, zigZagConversion.convert("ABCD", 3), "ABDC");
    }
}