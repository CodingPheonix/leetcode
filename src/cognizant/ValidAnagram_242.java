package cognizant;

import java.util.HashMap;

public class ValidAnagram_242 {

    private static HashMap<Character, Integer> getMap(String str){
        HashMap<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < str.length(); i++){
            char ch = str.charAt(i);

            if (map.containsKey(ch)){
                map.put(ch, map.get(ch) + 1);
            } else {
                map.put(ch,1);
            }
        }

        return map;
    }

    public static boolean isAnagram(String s, String t) {
        HashMap<Character, Integer> map1 = getMap(s);
        HashMap<Character, Integer> map2 = getMap(t);

        return map1.equals(map2);
    }

    static void main() {
        System.out.println(isAnagram("anagram", "nagaram"));
        System.out.println(isAnagram("rat", "car"));
    }
}
