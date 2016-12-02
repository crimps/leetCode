package com.woolpool.leetCode.palindromeNumber;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author crimps
 * @version 1.0  16/12/2
 * @modified crimps  16/12/2  <创建>
 */
public class PalindromeNumberTest {
    private String EQUALS = "equals";
    PalindromeNumber palindromeNumber = new PalindromeNumber();
    @Test
    public void isPalindrome() throws Exception {
        assertEquals(EQUALS, false, palindromeNumber.isPalindrome(10));
        assertEquals(EQUALS, false, palindromeNumber.isPalindrome(-2147483648));
        assertEquals(EQUALS, true, palindromeNumber.isPalindrome(121));
    }

}