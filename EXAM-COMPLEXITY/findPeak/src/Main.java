public class Main {
    public static int findPeak(int[] arr) {
        int i = 0;//the index that we are running with
        for (i < arr.length - 1; i++) {
            if ((i == 0 && arr[i] > arr[i + 1]) || i == arr.length - 1 && (arr[i] > arr[i - 1])) {
                //if the  index is sbigger than  one of his neighbors but he is at the ends of aray
                return i;
            else if ([i]>[i + 1] && [i]>[i - 1]){//if the index is bigger than his two neighbors
                    //else because if he is not at the end so he has 2 neighbors that we can check with
                    return i;
                }
                return -1;
            }
        }
    }
}
