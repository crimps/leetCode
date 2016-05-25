package com.woolpool.leetCode.LongestPalindromicSubstring;


import org.junit.Test;

public class LongestPalindromicSubstringTest {
    private String s = "aba";
    private String s2 = "abcdcba";
    private String s3 = "abcdcbc";
    private LongestPalindromicSubstring longestPalindromicSubstring = new LongestPalindromicSubstring();

    private String s4 = "kyyrjtdplseovzwjkykrjwhxquwxsfsorjiumvxjhjmgeueafubtonhlerrgsgohfosqssmizcuqryqomsi" +
            "povhhodpfyudtusjhonlqabhxfahfcjqxyckycstcqwxvicwkjeuboerkmjshfgiglceycmycadpnvoeaurqatesivajoqdi" +
            "lynbcihnidbizwkuaoegmytopzdmvvoewvhebqzskseeubnretjgnmyjwwgcooytfojeuzcuyhsznbcaiqpwcyusyyywqmm" +
            "vqzvvceylnuwcbxybhqpvjumzomnabrjgcfaabqmiotlfojnyuolostmtacbwmwlqdfkbfikusuqtupdwdrjwqmuudbcvtp" +
            "ieiwteqbeyfyqejglmxofdjksqmzeugwvuniaxdrunyunnqpbnfbgqemvamaxuhjbyzqmhalrprhnindrkbopwbwsjeqrmy" +
            "qipnqvjqzpjalqyfvaavyhytetllzupxjwozdfpmjhjlrnitnjgapzrakcqahaqetwllaaiadalmxgvpawqpgecojxfvcgx" +
            "sbrldktufdrogkogbltcezflyctklpqrjymqzyzmtlssnavzcquytcskcnjzzrytsvawkavzboncxlhqfiofuohehaygxid" +
            "xsofhmhzygklliovnwqbwwiiyarxtoihvjkdrzqsnmhdtdlpckuayhtfyirnhkrhbrwkdymjrjklonyggqnxhfvtkqxoica" +
            "kzsxmgczpwhpkzcntkcwhkdkxvfnjbvjjoumczjyvdgkfukfuldolqnauvoyhoheoqvpwoisniv";

    @Test
    public void testLongestPalindrome() throws Exception {
        System.out.println(longestPalindromicSubstring.longestPalindrome(s));
        System.out.println(longestPalindromicSubstring.longestPalindrome(s2));
        System.out.println(longestPalindromicSubstring.longestPalindrome(s3));
        System.out.println(longestPalindromicSubstring.longestPalindrome(s4));
    }

    @Test
    public void testIsPalindromic() {
        System.out.println(longestPalindromicSubstring.isPalindromic(s));
        System.out.println(longestPalindromicSubstring.isPalindromic(s2));
        System.out.println(longestPalindromicSubstring.isPalindromic(s3));
    }
}