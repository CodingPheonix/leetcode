package cognizant;

public class ReverseInteger_7 {
    public static int reverse(int x) {
        boolean isNegative = x < 0;
        long num = 0;

        int absValue = Math.abs(x);

        while (absValue > 0){
            int digit = absValue % 10;
            if (num == 0 && digit == 0) {
                absValue /= 10;
                continue;
            }

            num = num * 10 + digit;
            absValue /= 10;
        }

        if (num > Integer.MAX_VALUE || num < Integer.MIN_VALUE) {
            return 0;
        }

        return (int) (isNegative ? -1 * num : num);
    }

    static void main() {
        System.out.println(reverse(1534236469));
    }
}
