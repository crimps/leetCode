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

    /**
     * 排列解法
     * 将字符按排列形式填入二维数组当中，然后按行来读取得到的就是最终的结果
     * @param s
     * @param numRows
     * @return
     */
    public String convert(String s, int numRows) {
        //只有排列一行或是字符串为空串，直接返回字符串
        if (0 == s.length() || numRows <= 1) {
            return s;
        }

        StringBuffer sb = new StringBuffer();
        char[] chars = s.toCharArray();
        Map<Integer, StringBuffer> charMap = new HashMap<>();
        boolean order = true;   //顺序：true-正序，false-反序
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
                //处理列数为2的特殊情况
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