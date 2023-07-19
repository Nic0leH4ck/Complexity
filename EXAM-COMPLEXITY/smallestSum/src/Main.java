public class Main {
    public class smallestSum {
        private static int smallestSum(int[] arr, int k) {
            int maxSum = Integer.MIN_VALUE;
            int currentSum = 0;

            for (int i = 0; i < arr.length; i++) {
                currentSum += arr[i];

                // בדיקה אם סכום התת מערך גדול מ-K
                if (currentSum > k) {
                    return i + 1; // אורך התת מערך הרצוף הגדול מ-K
                }

                // בדיקה אם סכום התת מערך הוא המספר הכי גדול עד כה
                if (currentSum > maxSum) {
                    maxSum = currentSum;
                }

                // בדיקה אם התת מערך שלילי
                if (currentSum < 0) {
                    currentSum = 0;
                }
            }
            return arr.length + 1; // אין תת מערך רצוף שסכום איבריו גדול מ-K
        }
    }

}