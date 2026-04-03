package cognizant;

import java.util.HashMap;

public class SmallestValueOfRearrangedNumber_2165 {
    public static long smallestNumber(long num) {
        boolean isPositive = num > 0;

        num = Math.abs(num);

        long[] arr = new long[10];

        while (num > 0){
            arr[(int) (num%10)] ++;
            num /= 10;
        }

        long ans = 0;

        if (isPositive) {
            int i = 1;
            while(i <= 9){
                if (arr[i] > 0){
                    ans = ans * 10 + i;
                    arr[i]--;
                    break;
                }
                i++;
            }

            while (arr[0] != 0){
                ans = ans * 10;
                arr[0]--;
            }

            for (int j = i; j <= 9; j++){
                if (arr[j] > 0){
                    while (arr[j] > 0){
                        ans = ans * 10 + j;
                        arr[j]--;
                    }
                }
            }

            return ans;
        } else {

            for (int i = 9; i >= 0; i--){
                while (arr[i] > 0) {
                    ans = ans * 10 + i;
                    arr[i]--;
                }
            }

            return -1 * ans;
        }
    }

    static void main() {
        System.out.println(smallestNumber(2170596702L));
    }
}
