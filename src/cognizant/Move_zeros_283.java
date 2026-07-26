package cognizant;

import java.util.Arrays;

public class Move_zeros_283 {
    public static void moveZeroes(int[] nums) {
        int i = 0;

        for (int num: nums){
            if (num != 0) nums[i++] = num;
        }

        while (i < nums.length){
            nums[i++] = 0;
        }
    }

    static void main() {
        int[] arr = new int[]{0,1, 1, 0, 0, 3, 23};
        moveZeroes(arr);
        System.out.println(Arrays.toString(arr));
    }
}
