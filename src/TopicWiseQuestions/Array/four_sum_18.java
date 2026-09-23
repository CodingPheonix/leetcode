package TopicWiseQuestions.Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class four_sum_18 {
    public static List<List<Integer>> fourSum(int[] nums, int target) {
        if (nums == null || nums.length < 4) return new ArrayList<>();

        List<List<Integer>> list = new ArrayList<>();
        Arrays.sort(nums);

        for (int i = 0; i < nums.length - 3; i++){
            if (i > 0 && nums[i] == nums[i-1]) continue;

            for (int j = i+1; j < nums.length - 2; j++){
                if (j > i+1 && nums[j] == nums[j-1]) continue;

                int start = j+1, end = nums.length - 1;

                while (start < end){
                    long sum = (long) nums[i] + nums[j] + nums[start] + nums[end];

                    if (sum == target){
                        list.add(Arrays.asList(nums[i], nums[j], nums[start], nums[end]));

                        while (start < end && nums[start] == nums[start+1]) start++;
                        while (start < end && nums[end] == nums[end-1]) end--;

                        start++; end--;
                    } else {
                        if (sum < target ){
                            start++;
                        } else {
                            end--;
                        }
                    }
                }
            }
        }

        return list;
    }

    static void main() {
        int[] nums = new int[]{1000000000,1000000000,1000000000,1000000000};
        int target = -294967296;

        System.out.println(fourSum(nums, target));
    }
}
