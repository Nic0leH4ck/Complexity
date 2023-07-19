public class Main {
    public static boolean sum2(int[]arr,int num){
        int i=0;
        int j= i+1;
        while(i<arr.length-1 && j<arr.length-1 && i!=j ){
           if(arr[j]>num){
               return false;
           }
           if(arr[i]+arr[j]==num){//we found what we wanted
               return true;
           }
           if(arr[j]<num){//if j is less than num  we can continue search
               // while in array borders
               j++;
           }

        return false;
        }
    }
    //space-o(1)
    //time-o(n^2)
//binary search:
    import java.util.Arrays;

    public class Main {
        public static boolean sum2(int[] arr, int num) {
            Arrays.sort(arr); // Sort the array in ascending order
            int left = 0;
            int right = arr.length - 1;

            while (left < right) {
                int currentSum = arr[left] + arr[right];
                if (currentSum == num) {
                    return true; // Found a pair that sums up to num
                } else if (currentSum < num) {
                    left++; // Move the left pointer to increase the sum
                } else {
                    right--; // Move the right pointer to decrease the sum
                }
            }
            return false; // No pair found
        }

    }















}//end main