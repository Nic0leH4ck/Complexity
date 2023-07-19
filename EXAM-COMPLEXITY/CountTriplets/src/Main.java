public class Main {
    public static int CountTriplets(int a[],int num){
        int count=0;
        for(int i=0;i<a.length-2;i++){
            int k=a.length-1;
            int j=i+1;
            while(j<k){
                if(a[i]+a[j]+a[k]>=num)
                    k--;
                else{
                    count+=(k-j);
                    j++;
                }
            }
        }
        return count;
    }
    //OPT2:
    public static void printTripels(int[] arr, int num) {
        if (arr.length < 3)
            return;

        int a = 0, b = 1, c = arr.length - 1;
        int sum = 0;
        for (; b < arr.length - 2; a++) {
            b = a + 1;
            c = arr.length - 1;
            while (b < c) {
                sum = arr[a] * arr[b] * arr[c];
                if (sum == num) {
                    System.out.println(arr[a] + "*" + arr[b] + "*" + arr[c] + " = " + num);
                    b++;
                    c--;
                } else if (sum < num)
                    b++;
                else
                    c--;
            }
        }
    }



}