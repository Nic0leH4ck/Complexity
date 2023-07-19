public class Main {
    public static int meetingPoint(int[]a,int[]b){
        int index=Integer.MAX_VALUE,len=Math.min(a.length,b.length);
        int bot=0;//declaring the variables for the binary search
        int top=len-1;
        int mid;
        while (top>=bot){
            mid=(top+bot)/2;//declare the mid
            if(a[mid]>b[mid])
                bot=mid+1;
            else if(a[mid]<b[mid])
                top=mid-1;
            else{
                index=Math.min(index,mid);
                top=mid-1;
            }
        }
        return index;
    }
}
//space-o(1)
//time-o(logn)