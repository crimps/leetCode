package com.woolpool.leetCode.LongestSubstringWithoutRepeatingCharacters;

import org.junit.Test;

/**
 *
 */
public class LongestSubstringWithoutRepeatingCharactersTest {
    private String str1 = "aabcdabcdad";
    private String str2 = "bbbbb";
    private String str3 = "";
    private String str4 = "rhimfczyirdmdffnaotwbmlgyltsyvnpevclxdji";

    @Test public void testLengthOfLongestSubstring() throws Exception {
        lengthOfLongestSubstringCountTime(str1);
        lengthOfLongestSubstringCountTime(str2);
        lengthOfLongestSubstringCountTime(str3);
        lengthOfLongestSubstringCountTime(str4);
    }

    public void lengthOfLongestSubstringCountTime(String str) {
        LongestSubstringWithoutRepeatingCharacters longestSubstringWithoutRepeatingCharacters = new LongestSubstringWithoutRepeatingCharacters();
        long start = System.nanoTime();
        int length = longestSubstringWithoutRepeatingCharacters.lengthOfLongestSubstring(str);
        long end = System.nanoTime();
        System.out.println(str);
        System.out.println("total time : " + (end - start)/1000000 + "ms");
        System.out.println("length:" + length);
        System.out.println("=====================================");
    }
}
