public class Main {
    public static int superInc (int [] arr,int k){
        int sum=k;
        for(int i=arr.length -1; i>=0;i--){
            if(arr[i]==sum)//if there is correct group
                return true;
            if(arr[i]<sum)//if the current index  is less then sum
                sum-=arr[i];
        }
        return false;//if there is no group
    }
}