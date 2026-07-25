package cognizant;

public class Median_of_two_sorted_arrays_4 {

    public static double findMedian(int[] sorted) {
        int len = sorted.length;

        if (len % 2 == 0) {
            // even length → average of two middle elements
            return (sorted[len/2 - 1] + sorted[len/2]) / 2.0;
        } else {
            // odd length → middle element
            return sorted[len/2];
        }
    }

    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        // Sort
        int[] sorted = new int[nums1.length + nums2.length];
        int i = 0, j = 0, k = 0;

        while (i < nums1.length && j < nums2.length){
            if (nums1[i] <= nums2[j]){
                sorted[k] = nums1[i];
                k++; i++;
            } else {
                sorted[k] = nums2[j];
                k++; j++;
            }
        }

        while (i < nums1.length){
            sorted[k] = nums1[i];
            k++; i++;
        }

        while (j < nums2.length){
            sorted[k] = nums2[j];
            k++; j++;
        }

        return findMedian(sorted);
    }

    static void main() {
       int[] nums1 = new int[]{1, 2};
       int[] nums2 = new int[]{3, 4};

        System.out.println(findMedianSortedArrays(nums1, nums2));
    }
}
