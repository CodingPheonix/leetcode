package TopicWiseQuestions.Array;

import java.util.Arrays;

public class Three_sum_closest_16 {
    public static int threeSumClosest(int[] nums, int target) {
        int cDiff= Integer.MAX_VALUE;
        int minSum = 0;

        Arrays.sort(nums);

        for (int i = 0; i < nums.length - 2; i++){
            int start = i+1, end = nums.length-1;

            while(start < end){
                int sum = nums[i] + nums[start] + nums[end];
                int diff = Math.abs(sum - target);

                minSum = (diff < cDiff) ? sum : minSum;
                cDiff = Math.min(cDiff, diff);

                if (sum > target) end--;
                else start++;
            }
        }

        return minSum;
    }

    static void main() {
        int[] nums = new int[]{0,0,0};
        int target = 1;

        System.out.println(threeSumClosest(nums, target));
    }
}
