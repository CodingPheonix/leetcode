package cognizant;

import java.util.HashSet;
import java.util.Set;

public class Happy_number_202 {
    public static boolean isHappy(int n) {
        Set<Integer> seen=new HashSet<>();
        while(n!=1 && !seen.contains(n)){
            seen.add(n);
            n=getNext(n);
        }
        return n==1;

    }
    private static int getNext(int num){
        int total =0;
        while(num>0){
            int digit=num%10;
            total+=digit*digit;
            num/=10;
        }
        return total;
    }

    static void main() {
        int num = 19;
        System.out.println(isHappy(num));
    }
}
