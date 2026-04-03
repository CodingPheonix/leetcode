package cognizant;

import java.util.HashSet;

public class CountSubarrays_3392 {

    public static int countSubarrays(int[] nums) {
        int count = 0;

        for (int i = 0; i < nums.length-2; i++){
            if (nums[i+1] == ((nums[i] + nums[i+2]) * 2)) count++;
        }

        return count;
    }

    public static void main(String[] args) {
        System.out.println(countSubarrays(new int[]{1,2,1,4,1}));
    }
}