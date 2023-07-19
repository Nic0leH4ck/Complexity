public class Main {
    public static int findMissingIndex(int[]arr){
        int n=arr.length;
        if(n<3){//if the array smaller than 3
            return n;
            int diff=arr[i]-arr[0];
            for(int i=2;i<n;i++){
                if(arr[i]-arr[i-1]!=diff){
                    return i;
                }
            }
            return n;
        }

    }

//OPT2:
    public static int findMissingIndex(int[] arr) {
        int n = arr.length;

        // Calculate the common difference
        int diff = (arr[n - 1] - arr[0]) / n;

        // Perform binary search
        int low = 0;
        int high = n - 1;

        while (low < high) {
            int mid = low + (high - low) / 2;

            if (arr[mid] == arr[0] + (mid * diff)) {
                low = mid + 1;
            } else {
                high = mid;
            }
        }

        return low;
    }
}//end main