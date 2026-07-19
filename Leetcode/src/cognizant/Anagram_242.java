package cognizant;

import java.util.HashMap;
import java.util.Map;

public class Anagram_242 {

    public static boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;

        HashMap<Character, Integer> hash1 = new HashMap<>();

        // Save one string
        for (char ch: s.toCharArray()){
            hash1.merge(ch, 1, Integer::sum);
        }

        for (char ch: t.toCharArray()){
            if (hash1.containsKey(ch) && hash1.get(ch) != 0){
                hash1.put(ch, hash1.get(ch) - 1);
            }
        }

        for (Map.Entry<Character, Integer> map : hash1.entrySet()){
            if (map.getValue() != 0) return false;
        }
        return true;
    }

    static void main() {
        String s = "anagram";
        String t = "nagaram";

        System.out.println(isAnagram(s, t));
    }
}
