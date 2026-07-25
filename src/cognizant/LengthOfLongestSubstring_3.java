package cognizant;

import java.util.HashMap;

public class LengthOfLongestSubstring_3 {
    public static int lengthOfLongestSubstring(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        int left = 0, maxLen = 0;

        for (int right = 0; right < s.length(); right++) {
            char ch = s.charAt(right);

            if (map.containsKey(ch) && map.get(ch) >= left) {
                left = map.get(ch) + 1; // move left past the duplicate
            }

            map.put(ch, right);
            maxLen = Math.max(maxLen, right - left + 1);
        }

        return maxLen;
    }

    static void main() {
        String s = "abcabcbb";
        System.out.println(lengthOfLongestSubstring(s));
    }
}
