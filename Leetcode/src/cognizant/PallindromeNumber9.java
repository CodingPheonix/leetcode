package cognizant;

public class PallindromeNumber9 {

    public static boolean isPalindrome(int x) {
        String str = Integer.toString(x);

        int i = 0;
        int j = str.length()-1;

        while(i <= j){
            if (str.charAt(i) == (str.charAt(j))){
                i++; j--;
            } else {
                return false;
            }
        }

        return true;
    }

    static void main() {
        System.out.println(isPalindrome(121));
    }

}
