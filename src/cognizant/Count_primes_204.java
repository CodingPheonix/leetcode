package cognizant;

import java.util.Arrays;

public class Count_primes_204 {

    public static int sieve(int num){
        boolean[] arr = new boolean[num + 1];
        Arrays.fill(arr,true);
        arr[0] = arr[1] = false;

        for (int i = 2; i < num; i++) {
            if (arr[i]){
                for (long j = (long) i * i; j < num; j+=i) {
                    arr[(int)j] = false;
                }
            }
        }

        int count = 0;

        for (int i = 0; i < num; i++) {
            if (arr[i]) count++;
        }

        return count;
    }

    public static int countPrimes(int n) {
        if (n == 0 || n == 1 || n - 1 == 1){
            return 0;
        }
        return sieve(n);
    }

    static void main() {
        System.out.println(countPrimes(12));
    }
}
