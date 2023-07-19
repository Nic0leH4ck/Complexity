public class Main {

    public static int countNeg(int[][]arr) {
        int count=0,j=arr[0].length-1,i=0;

        while (i < arr.length) {
            while (j >= 0 && arr[i][j] >= 0) {
                j--;
                count += j + 1;
                i++;
                return count;
            }
        }
    }
    //time-o(n+m)
//spc=ace-o(1)