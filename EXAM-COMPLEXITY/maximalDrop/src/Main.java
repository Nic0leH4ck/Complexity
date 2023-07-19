public class Main {
    public static int maximalDrop(int[]a){
        int max=-1,maxNum=a[0],minNum=a[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]<minNum){
                minNum=arr[i];
                max=Math.max(max,maxNum-minNum);
            }
            else if(arr[i]>maxNum){
                minNum=arr[i];
                maxNum=arr[i];
            }
        }
        return max;
    }
}
//time-o(n)