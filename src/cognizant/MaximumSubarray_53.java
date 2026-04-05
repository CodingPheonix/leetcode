package cognizant;

public class MaximumSubarray_53 {
    public static int maxSubArray(int[] nums) {
        int res = nums[0];
        int sum = 0;

        for (int n : nums) {
            if (sum < 0) {
                sum = 0;
            }

            sum += n;
            res = Math.max(res, sum);
        }

        return res;
    }

    static void main() {
        System.out.println(maxSubArray(new int[]{-2,1,-3,4,-1,2,1,-5,4}));
    }
}
