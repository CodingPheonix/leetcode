package cognizant;

public class SearchInsertPosition_35 {
    public static int searchInsert(int[] nums, int target) {
        int i = 0, j = nums.length - 1;

        while (i <= j){
            int mid = i + (j - i) / 2;

            if (nums[mid] == target){
                return mid;
            } else if (nums[mid] > target){
                j = mid - 1;
            } else {
                i = mid + 1;
            }
        }

        return i;
    }

    static void main() {
        int[] arr = new int[]{10,30,50,60};
        System.out.println(searchInsert(arr, 99));
    }
}
