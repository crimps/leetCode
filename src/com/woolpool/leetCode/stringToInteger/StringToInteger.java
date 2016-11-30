/**
 * @(#)com.woolpool.leetCode.stringToInteger.StringToInteger.java Copyright (c) 2014-2018 crimps
 */
package com.woolpool.leetCode.stringToInteger;

/**
 *
 * @author crimps
 * @version 1.0  16/11/30
 * @modified crimps  16/11/30  <创建>
 */

import java.math.BigDecimal;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * Implement atoi to convert a string to an integer.

 Hint: Carefully consider all possible input cases. If you want a challenge, please do not see below and ask yourself what are the possible input cases.

 Notes: It is intended for this problem to be specified vaguely (ie, no given input specs). You are responsible to gather all the input requirements up front.

 Update (2015-02-10):
 The signature of the C++ function had been updated. If you still see your function signature accepts a const char * argument, please click the reload button  to reset your code definition.

 spoilers alert... click to show requirements for atoi.

 Requirements for atoi:
 The function first discards as many whitespace characters as necessary until the first non-whitespace character is found. Then, starting from this character, takes an optional initial plus or minus sign followed by as many numerical digits as possible, and interprets them as a numerical value.

 The string can contain additional characters after those that form the integral number, which are ignored and have no effect on the behavior of this function.

 If the first sequence of non-whitespace characters in str is not a valid integral number, or if no such sequence exists because either str is empty or it contains only whitespace characters, no conversion is performed.

 If no valid conversion could be performed, a zero value is returned. If the correct value is out of the range of representable values, INT_MAX (2147483647) or INT_MIN (-2147483648) is returned.
 */
public class StringToInteger {

    /**
     * 用正则表达式来验证是否为纯数字，再考虑int类型的溢出情况
     * PS：leetcode不支持正则表达式
     * @param str
     * @return
     */
    public int myAtoi(String str) {
        Pattern pattern = Pattern.compile("[0-9]+]");
        Matcher matcher = pattern.matcher(str);
        if (matcher.find()) {
            long longAtoi = Long.parseLong(str);
            if (longAtoi >= Integer.MIN_VALUE && longAtoi <= Integer.MAX_VALUE) {
                return Integer.valueOf(str);
            } else {
                return 0;
            }
        } else {
            return 0;
        }
    }

    public int myAtoi_type2(String str) {
        int index = -1;
        str = str.trim();
        if (!"".equals(str)) {
            //判断是否为纯数字
            boolean flag = true;
            if (str.length() == 1) {
                if (!Character.isDigit(str.charAt(0))) {
                    index = -1;
                } else {
                    index = 0;
                }
            } else {
                //带正、负号的情况
                if (!Character.isDigit(str.charAt(0))) {
                    if (!('+' == str.charAt(0) || '-' == str.charAt(0))) {
                        flag = false;
                        index = -1;
                    }
                }
                if (flag) {
                    for(int i = 1; i < str.length(); i++) {
                        if (!Character.isDigit(str.charAt(i))) {
                            break;
                        } else {
                            index = i;
                        }
                    }
                }
            }

            if (index >= 0) {
                Double doubleAtoi = Double.parseDouble(str.substring(0, index + 1));
                if (doubleAtoi >= Integer.MIN_VALUE && doubleAtoi <= Integer.MAX_VALUE) {
                    return Integer.parseInt(str.substring(0, index + 1));
                } else {
                    return 0;
                }
            } else {
                return 0;
            }

        } else {
            return 0;
        }
    }
}