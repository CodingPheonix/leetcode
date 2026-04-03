package cognizant;

public class LongestPalindromicString_5 {

    private static String expand(String str, int left, int right){
        while (left >= 0 && right < str.length() && str.charAt(left) == str.charAt(right)){
            left--; right++;
        }
        return str.substring(left + 1, right);
    }

    public static String longestPalindrome(String s) {
        if (s.isEmpty()) return "";

        String longString = "";

        for (int i = 0; i < s.length(); i++){
            String evenString = expand(s, i, i+1);
            String oddString = expand(s, i, i);

            if (evenString.length() > longString.length()) longString = evenString;
            if (oddString.length() > longString.length()) longString = oddString;
        }

        return longString;
    }

    static void main() {
        System.out.println(longestPalindrome("babad"));
    }
}
