public class Main {
    public static void minimumSubK(int[] arr, int k) {
        int[] minSub = new int[3]; // [0] - min sum, [1] - start of subArr index, [2] end of subArr index
        int i = 0, j = 0;//pointers

        //It creates an integer array minSub of size 3 to store information about the minimum sum subarray:
        // minSub[0] will store the minimum sum,
        // minSub[1] will store the start index of the subarray, and minSub[2] will store the end index of the subarray.

        for (; j <= k - 1; j++) {
            minSub[0] += arr[j];//סוכמים את האינקס לתוך פרמטר סכימה
        }

        minSub[1] = i;
        minSub[2] = --j;

        int tempSum = minSub[0];//he variable tempSum is initialized with the value of minSub[0].
        // This variable will be used to keep track of the current sum of the subarray.

        while (j < arr.length - 1) {//כל עוד לא הגענו לסוף המערך
            tempSum -= arr[i];
            i++;
            j++;
            tempSum += arr[j];

            if (tempSum < minSub[0]) {//After updating tempSum, it is compared with the current minimum sum stored in minSub[0].
                // If tempSum is smaller, it means a new minimum sum subarray has been found.
                // In that case, minSub[0] is updated with the new minimum sum,
                // and minSub[1] and minSub[2] are updated with the new start and end indices of the subarray.
                minSub[0] = tempSum;
                minSub[1] = i;
                minSub[2] = j;
            }
        }
        System.out.println("Minimum sum sub-arry is (" + minSub[1] + "," + minSub[2] + ")");
    }

    // Time complexity: O(log n)
    // Space complexity: O(1)
}