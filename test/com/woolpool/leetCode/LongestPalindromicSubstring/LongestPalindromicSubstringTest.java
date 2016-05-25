package com.woolpool.leetCode.LongestPalindromicSubstring;


import org.junit.Test;

public class LongestPalindromicSubstringTest {
    private LongestPalindromicSubstring longestPalindromicSubstring = new LongestPalindromicSubstring();

    private String s = "aba";
    private String s2 = "abcdcba";
    private String s3 = "abcdcbc";
    private String s4 = "kyyrjtdplseovzwjkykrjwhxquwxsfsorjiumvxjhjmgeueafubtonhlerrgsgohfosqssmizcuqryqomsi" +
            "povhhodpfyudtusjhonlqabhxfahfcjqxyckycstcqwxvicwkjeuboerkmjshfgiglceycmycadpnvoeaurqatesivajoqdi" +
            "lynbcihnidbizwkuaoegmytopzdmvvoewvhebqzskseeubnretjgnmyjwwgcooytfojeuzcuyhsznbcaiqpwcyusyyywqmm" +
            "vqzvvceylnuwcbxybhqpvjumzomnabrjgcfaabqmiotlfojnyuolostmtacbwmwlqdfkbfikusuqtupdwdrjwqmuudbcvtp" +
            "ieiwteqbeyfyqejglmxofdjksqmzeugwvuniaxdrunyunnqpbnfbgqemvamaxuhjbyzqmhalrprhnindrkbopwbwsjeqrmy" +
            "qipnqvjqzpjalqyfvaavyhytetllzupxjwozdfpmjhjlrnitnjgapzrakcqahaqetwllaaiadalmxgvpawqpgecojxfvcgx" +
            "sbrldktufdrogkogbltcezflyctklpqrjymqzyzmtlssnavzcquytcskcnjzzrytsvawkavzboncxlhqfiofuohehaygxid" +
            "xsofhmhzygklliovnwqbwwiiyarxtoihvjkdrzqsnmhdtdlpckuayhtfyirnhkrhbrwkdymjrjklonyggqnxhfvtkqxoica" +
            "kzsxmgczpwhpkzcntkcwhkdkxvfnjbvjjoumczjyvdgkfukfuldolqnauvoyhoheoqvpwoisniv";
    private String s5 = "a";
    private String s6 = "bb";

    @Test
    public void testLongestPalindrome() throws Exception {
        System.out.println(longestPalindromicSubstring.longestPalindrome(s));
        System.out.println(longestPalindromicSubstring.longestPalindrome(s2));
        System.out.println(longestPalindromicSubstring.longestPalindrome(s3));
        System.out.println(longestPalindromicSubstring.longestPalindrome(s4));
        System.out.println(longestPalindromicSubstring.longestPalindrome(s5));
        System.out.println(longestPalindromicSubstring.longestPalindrome(s6));
    }

    @Test
    public void testLongestPalindrome_type2() {
        System.out.println(longestPalindromicSubstring.longestPalindrome_type2(s));
        System.out.println(longestPalindromicSubstring.longestPalindrome_type2(s2));
        System.out.println(longestPalindromicSubstring.longestPalindrome_type2(s3));
        System.out.println(longestPalindromicSubstring.longestPalindrome_type2(s4));
        System.out.println(longestPalindromicSubstring.longestPalindrome_type2(s5));
        System.out.println(longestPalindromicSubstring.longestPalindrome_type2(s6));
    }

    @Test
    public void testIsPalindromic() {
        System.out.println(longestPalindromicSubstring.isPalindromic(s));
        System.out.println(longestPalindromicSubstring.isPalindromic(s2));
        System.out.println(longestPalindromicSubstring.isPalindromic(s3));
    }
}