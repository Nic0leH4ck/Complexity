public class Main {
    import java.util.Arrays;

    public class printClosest {
        public static int[] printClosest(int[] arr1, int[] arr2, int X) {
            int[] closestPair = new int[2];
            int minDiff = Integer.MAX_VALUE;
            int i = 0, j = arr2.length - 1;

            while (i < arr1.length && j >= 0) {//while we are in borders
                int sum = arr1[i] + arr2[j];//declaring the sum of i+j
                int diff = Math.abs(X - sum);

                if (diff < minDiff) {
                    minDiff = diff;
                    closestPair[0] = arr1[i];
                    closestPair[1] = arr2[j];
                }

                if (sum < X) {
                    i++;
                } else {
                    j--;
                }
            }

            return closestPair;
        }
    }

}