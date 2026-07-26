package cognizant;

import java.util.Arrays;

public class Binary_Search_704 {
    public static int search(int[] nums, int target) {
        int i = 0, j = nums.length - 1;

        while (i <= j){
            int mid = i + (j - i) / 2;

            if (nums[mid] == target){
                return mid-1;
            } else if (nums[mid] > target){
                j = mid;
            } else {
                i = mid + 1;
            }
        }

        return -1;
    }

    static void main() {
        int[] arr = new int[]{-1,0,3,5,9};
        System.out.println(search(arr, 12));
    }
}
