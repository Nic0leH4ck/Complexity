public class Main {
    public static int maxMountain(int[]a){
        return maxMountain(a,0,a.length-1);
    }
    private static int maxMountain(int[]a,int begin,int end){
        int middle=(begin+end)/2;
        if(a[middle]>Math.max(a[middle-1],a[middle+1]))
            return a[middle];
        if(a[middle]>a[middle-1])
            return maxMountain(a,middle+1,end);
        else
            return maxMountain(a,begin,middle-1);

    }
}
//space-o(1)
//time-o(log2n)
