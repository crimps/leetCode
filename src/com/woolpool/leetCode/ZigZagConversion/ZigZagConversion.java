/**
 * @(#)com.woolpool.leetCode.ZigZagConversion.ZigZagConversion.java Copyright (c) 2014-2018
 */
package com.woolpool.leetCode.ZigZagConversion;

/**
 * @author chenwz
 * @version 1.0  16/8/19
 * @modified chenwz  16/8/19  <创建>
 */

import javax.management.StringValueExp;
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
        StringBuffer sb = new StringBuffer();
        char[] chars = s.toCharArray();
        Map<Integer, StringBuffer> resultMap = new HashMap<>();
        int mediaIndex = (numRows + 1) / 2;
        for (int i = 0; i < chars.length; i++) {
            if (null == resultMap.get((i + 1) % (numRows + 1)) && (i + 1) % (numRows + 1) != 0) {
                StringBuffer temp = new StringBuffer();
                temp.append(String.valueOf(chars[i]));
                resultMap.put((i + 1) % (numRows + 1), temp);
            } else {
                if (0 == (i + 1) % (numRows + 1)) {
                    if (0 == numRows % 2) {
                        resultMap.get(mediaIndex + 1).append(String.valueOf(chars[i]));
                    } else {
                        resultMap.get(mediaIndex).append(String.valueOf(chars[i]));
                    }
                } else {
                    resultMap.get((i + 1) % (numRows + 1)).append(String.valueOf(chars[i]));
                }
            }

        }
        for (Map.Entry entry : resultMap.entrySet()) {
            sb.append(entry.getValue());
        }
        return sb.toString();
    }

    public String convert_type2(String s, int numRows) {
        return null;
    }
}