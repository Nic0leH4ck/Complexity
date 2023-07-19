public class Main {
    public static int smallestSub(int[] a, int k) {
        int low = 0, high = 0, curCount = 0, minCount = a.length + 1, curSum = 0;

        while (low < a.length) {
            if (curSum <= k) {
                if (high < a.length) {
                    curCount++;
                    curSum += a[high];
                    high++;
                } else
                    low = a.length;
            } else if (curSum > k) {
                if (curCount < minCount)
                    minCount = curCount;
                curCount--;
                curSum -= a[low];
                low++;
            }
        }
        return minCount;
    }

}