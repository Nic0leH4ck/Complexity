public class Main {
    public static int strictlyIncreasing(int[]a) {
        int sum = 0, temp = 0, count = 1;//declaring variables
        for (int i = 1; i < a.length; i++) {//the condition while we running
            if (a[i] > a[i - 1]) {//check the neighbor
                count++;
                temp += count - 1;
            } else {
                count = 1;
                sum += temp;
                temp = 0;
            }
        }
        return temp + sum;
    }
}//end class main

//an method that gets array and returns back the  sum sub-arrays while there are organized in increasing order