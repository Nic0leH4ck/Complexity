public class Main {
    public class findSmallest {
        public static int findSmallest(int[] arr) {
            int findSmallest = 1;

            for (int i = 0; i < arr.length && arr[i] <= findSmallest; i++) {//while in array borders
                findSmallest += arr[i];
            }

            return findSmallest;
        }


    }

}