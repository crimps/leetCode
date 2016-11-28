/**
 * @(#)com.woolpool.leetCode.ZigZagConversion.ZigZagConversion.java Copyright (c) 2014-2018
 */
package com.woolpool.leetCode.ZigZagConversion;

/**
 * @author crimps
 * @version 1.0  16/8/19
 * @modified crimps  16/8/19  <创建>
 */

import java.util.*;

/**
 * The string "PAYPALISHIRING" is written in a zigzag pattern on a given number of rows like this:
 * (you may want to display this pattern in a fixed font for better legibility)

 P   A   H   N
 A P L S I I G
 Y   I   R
 And then read line by line: "PAHNAPLSIIGYIR"
 Write the code that will take a string and make this conversion given a number of rows:

 string convert(string text, int nRows);
 convert("PAYPALISHIRING", 3) should return "PAHNAPLSIIGYIR".
 */
public class ZigZagConversion {

    public String convert(String s, int numRows) {
        if (0 == s.length() || numRows <= 1) {
            return s;
        }
        StringBuffer sb = new StringBuffer();
        char[] chars = s.toCharArray();
        Map<Integer, StringBuffer> charMap = new HashMap<>();
        boolean order = true;
        int rowcount = 0;
        for(int index = 0; index < s.length(); index++) {
            if (order) {
                if (null == charMap.get(rowcount)) {
                    charMap.put(rowcount, new StringBuffer());
                }
                charMap.get(rowcount).append(chars[index]);
                rowcount++;
                if (rowcount >= numRows) {
                    order = false;
                    rowcount = 0;
                }
            } else {

                if (numRows - 2 <= 0) {
                    order = true;
                    rowcount = 0;
                    index--;
                } else {
                    charMap.get(numRows - rowcount - 2).append(chars[index]);
                    rowcount++;
                    if (rowcount >= numRows - 2) {
                        order = true;
                        rowcount = 0;
                    }
                }
            }
        }

        for (Map.Entry entry : charMap.entrySet()) {
            sb.append(charMap.get(entry.getKey()));
        }
        return sb.toString();
    }

    public String convert_type2(String s, int numRows) {
        return null;
    }
}