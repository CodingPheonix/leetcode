package cognizant;

public class RemoveDuplicatesFromSortedArray_26 {
    public static int removeDuplicates(int[] nums) {
        int i = 0, j = 0;
        int memory = Integer.MAX_VALUE;

        while(j != nums.length){
            if (nums[j] != memory){
                memory = nums[j];

                nums[i] = nums[j];

                i++; j++;
            } else {
                j++;
            }
        }

        return i;
    }

    static void main() {
        System.out.println(removeDuplicates(new int[]{0,0,1,1,1,2,2,3,3,4}));
    }

}
