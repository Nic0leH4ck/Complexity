public class Main {

    public static void printPairs(int[] arr, int k) {
        for (int i = 0; i < arr.length; i++) {//the loop condition -while in the borders of the array
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] - arr[i] == k) {
                    System.out.println("(" + arr[i] + ", " + arr[j] + ")");
                }
            }
        }
    }

//o(n)-time
//o(1)-space

public static void printPairs(int a[],int k) {
    if (a.length < 2)
        return;
    int i=0; j=1;
    while(j<a.length){
        if(a[j]-a[i]==k){
            System.out.println("pairs found:("+a[j]+","+a[i]+")");
            i++;
            j++;
        }
        else if(a[j]-a[i]>k){
            i++;
            if(i==j)
                j++;
        }
        else//<k
        j++;
    }
}
