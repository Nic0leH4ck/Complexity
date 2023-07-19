public class Main {
    public static boolean splitT03(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }

        int lim1 = 0, lim2 = arr.length - 1, sum1 = 0, sum2 = 0, sum3 = 0;
        while (lim1 < lim2) {
            sum3 = sum - (sum1 + sum2);
            if (sum3 == 0 && sum1 <= 0 && sum2 >= 0)
                return true;
            else if (sum3 > 0)
                sum2 += arr[lim2--];
            else if (sum3 < 0)
                sum1 += arr[lim1++];
            else {
                sum2 += arr[lim2--];
                sum1 += arr[lim1++];
            }

        }
        return false;

    }

    // Time Complexity: O(n)
    // Space Complexity: O(1)
}