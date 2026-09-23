package TopicWiseQuestions.Array;

public class Container_with_most_water_11 {
    public static int maxArea(int[] height) {
        int i = 0, j = height.length - 1;
        int max = Integer.MIN_VALUE;

        while (i < j){
            int min_pillar = Math.min(height[i], height[j]);
            int dist = j-i;

            int vol = min_pillar * dist;
            max = Math.max(vol, max);

            if (height[i] > height[j]) j--;
            else i++;
        }

        return max;
    }

    static void main() {
        int height[] = new int[]{1,8,6,2,5,4,8,3,7};
        System.out.println(maxArea(height));
    }
}
