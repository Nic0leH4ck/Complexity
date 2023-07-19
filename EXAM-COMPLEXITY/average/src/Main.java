public class Main {
    public static int average(int[] arr) {

        int savedDiff = Integer.MIN_VALUE, savedIndex = 0;

        int rightSum = 0;
        for (int i = 0; i < arr.length; i++) {
            rightSum += arr[i];
        }

        int leftSum = 0;
        for (int i = 0; i < arr.length - 1; i++) {

            leftSum += arr[i];
            rightSum -= arr[i];

            // (i+1) is the amount of elements within left group.
            // ( arr.length - (i+1)) is the amount of elements within right group.
            int leftAve = leftSum / (i + 1);
            int rightAve = rightSum / (arr.length - (i + 1));

            int currDiff = rightAve - leftAve;
            if (currDiff < 0)
                currDiff = -currDiff;

            if (currDiff > savedDiff) {
                savedDiff = currDiff;
                savedIndex = i;
            }
        }

        return savedIndex;
    }

    // Time Complexity: O(n + m) - Linear
    // Space Complexity: O(1)

}