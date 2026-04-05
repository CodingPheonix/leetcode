package cognizant;

public class LongestCommonPrefix_14 {
    public static String longestCommonPrefix(String[] strs) {
        if (strs.length == 0) return "";

        for (int i = 0; i < strs[0].length(); i++){
            for (String word: strs) {
                if (i >= word.length() || strs[0].charAt(i) != word.charAt(i)){
                    return strs[0].substring(0, i);
                }
            }
        }

        return strs[0];
    }

    static void main() {
        System.out.println(longestCommonPrefix(new String[]{"flower","flow","flight"}));
    }
}
