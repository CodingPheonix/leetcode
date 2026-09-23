package TopicWiseQuestions.Array;

import java.util.Arrays;

public class Next_permutation_31 {
    public static void nextPermutation(int[] nums) {

        // 1. Find the break point
        int breakPoint = nums.length - 2;

        while (breakPoint >= 0 && nums[breakPoint] >= nums[breakPoint + 1]) {
            breakPoint--;
        }

        // 2. If no break point, this is the largest permutation
        if (breakPoint == -1) {
            reverse(nums, 0, nums.length - 1);
            return;
        }

        // 3. Find the smallest value greater than nums[breakPoint]
        int target = nums.length - 1;

        while (nums[target] <= nums[breakPoint]) {
            target--;
        }

        // 4. Swap
        int temp = nums[target];
        nums[target] = nums[breakPoint];
        nums[breakPoint] = temp;

        // 5. Reverse the right side
        reverse(nums, breakPoint + 1, nums.length - 1);
    }

    static void reverse(int[] nums, int i, int j) {
        while (i < j) {
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;

            i++;
            j--;
        }
    }

    static void main() {
        int[] nums = new int[]{1, 2, 3};
        nextPermutation(nums);
        System.out.println(Arrays.toString(nums));
    }
}
